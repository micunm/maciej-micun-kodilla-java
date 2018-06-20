package com.kodilla.patterns.prototype.library;

import org.junit.Test;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
    //Given
    Library library=new Library("testLibrary");
    library.getBooks().add(new Book("Java for dummies", "Tommy Lee Johns", 2018.01.23));
    library.getBooks().add(new Book("Money does not give you happiness", "Bill Gates", 2008.04.20);
    library.getBooks().add(new Book("Not for sale", "Steve Jobs", 2002.03.03));
    library.getBooks().add(new Book("Rambo - a real history", "Rockie Balboa", 1981.01.23));
    library.getBooks().add(new Book("AI - how to implement SkyNet in your company", "Sarah O'Connor", 1991.01.23));
    library.getBooks().add(new Book("No Cry", "Bob Marley", 1972.01.23));

    //When

    //Then
    }
}
