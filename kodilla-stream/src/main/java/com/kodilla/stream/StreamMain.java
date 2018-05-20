package com.kodilla.stream;

/*import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.iterate.NumbersGenerator;*/

import com.kodilla.stream.ForumUser.Forum;
import com.kodilla.stream.ForumUser.ForumUser;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
//import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
/*      Processor processor=new Processor();
        ExecuteSaySomething executeSaySomething=new ExecuteSaySomething();
        Executor codeToExecute= () -> System.out.println("This is an example text");
        processor.execute(codeToExecute);
        processor.execute(() -> System.out.println("This is an example text"));
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(20, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(5, 8, (a, b) -> a - b);
        expressionExecutor.executeExpression(17, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(25, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);*/

        // task 7.1
/*
        PoemBeautifier beautifier=new PoemBeautifier();
        String testText="Tekst do testów.";

        beautifier.beautify("Jakiś tam tekst", (text) -> text.toUpperCase());
        beautifier.beautify("Jakiś tam tekst", (text) -> "ABC "+text+" ABC");
        beautifier.beautify("Jakiś tam tekst", (text) -> "******** "+text+" ********");
        beautifier.beautify("Jakiś tam tekst", (text) -> "_"+text.replace(" ", "_")+"_");
        beautifier.beautify("Jakiś tam tekst", (text) -> "@@@@@@@@ "+text+" @@@@@");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
*/

//submodule 7.3
/*        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);*/

/*        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);*/

/*        BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/

//Task 7.3
        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(user -> user.getUserSex() == 'M')
                .filter(user -> user.getBirthDay().getYear() <= 1988)
                .filter(user -> user.getNumberOfUserPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
