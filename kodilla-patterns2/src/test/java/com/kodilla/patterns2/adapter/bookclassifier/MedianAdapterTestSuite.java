package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Bamboo Bill", "Lion's Gate", 1990,"1234"));
        books.add(new Book("John Travola", "Tut", 1975,"5678"));
        books.add(new Book("Agatha Cristie", "Murderer", 1970,"9101"));
        books.add(new Book("Stanisław Lem", "Solaris", 1950,"1213"));
        books.add(new Book("George Orwell", "1984 year", 1980,"9101"));
        books.add(new Book("Henryk Sienkiewicz", "Quo Vadis?", 1960,"1213"));

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int medianResult = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(1975, medianResult);
    }
}
