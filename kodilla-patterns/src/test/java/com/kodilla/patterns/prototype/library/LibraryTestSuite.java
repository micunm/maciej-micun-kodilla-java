package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
    //Given
    Library library=new Library("testLibrary");
    library.getBooks().add(new Book("Java for dummies", "Tommy Lee Jones", LocalDate.of(2008, 01, 25)));
    library.getBooks().add(new Book("Money does not give you happiness", "Bill Gates", LocalDate.of(2008, 04, 20)));
    library.getBooks().add(new Book("Not for sale", "Steve Jobs", LocalDate.of(2002, 03, 03)));
    library.getBooks().add(new Book("Rambo - a real history", "Rockie Balboa", LocalDate.of(1981, 01, 23)));
    library.getBooks().add(new Book("AI - how to implement SkyNet in your company", "Sarah O'Connor", LocalDate.of(1991, 01, 23)));
    library.getBooks().add(new Book("No Cry", "Bob Marley", LocalDate.of(1972, 01, 23)));
    library.getBooks().add(new Book("Bourne's Identity", "A. Ludlum", LocalDate.of(1985, 02, 28)));

    //making a shallow copy of object linrary
    Library clonedLibrary = null;
    try {
    clonedLibrary = library.shallowCopy();
    clonedLibrary.setName("Library number 2");
    } catch (CloneNotSupportedException e) {
        System.out.println(e);
    }

    //making a deep copy of object board
    Library deepClonedLibrary = null;
    try {
        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Library number 3");
    } catch (CloneNotSupportedException e) {
         System.out.println(e);
        }
    //When
    Set<Book> books=library.getBooks();
    Set<Book> books2=clonedLibrary.getBooks();
    Set<Book> books3=deepClonedLibrary.getBooks();
    //Then
    System.out.println("Library no. 1: ");
    for(Book theBook: books) {
        System.out.println(theBook);
    }

    System.out.println("Library no. 2: ");
    for(Book theBook2: books) {
        System.out.println(theBook2);
    }
    System.out.println("Library no. 3: ");
    for(Book theBook3: books) {
    System.out.println(theBook3);
        }

        Assert.assertEquals(7, ((Set) books).size());
        Assert.assertEquals(7, books2.size());
        Assert.assertEquals(7, books3.size());
    }
}
