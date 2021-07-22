package com.example.conceptos.jordi_vicent_cutanda_perez;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.example.demo.patterns.behavioral.iterator.Book;


@Nested
@DisplayName("JUnitTestBooksTest")
class Iterator2Test {
	
	@Test
	@DisplayName("Massive Itinerator")
    void testMassiveIterator() {

        int randomBooksToCreate = (int)Math.round(Math.random()*(100)+1);

        List<Book> randomSampleBooks = IteratorTest.addSampleListBooksTest(randomBooksToCreate);
        Iterator<Book> listBooksIterator = randomSampleBooks.iterator();

        for (int actualBook = 1; actualBook <= (randomSampleBooks.size()); actualBook++) {

        	boolean haveNextItemInList = listBooksIterator.hasNext();
        	
        	System.out.println("TEST MASSIVE ITINERAOTR BOOK");
        	
        	System.out.println("Actual Position: " + String.valueOf(actualBook)
            + " of "
            + String.valueOf(randomSampleBooks.size()));

            System.out.println(listBooksIterator.next().toString());
            

        }

    }
	
	@Test
	@DisplayName("Unique Itinerator")
    void testUniqueIterator() {

        List<Book> randomSampleBook = IteratorTest.addSampleListBooksTest(1);
        Iterator<Book> listBookIterator = randomSampleBook.iterator();
            
        	boolean haveNextItemInList = listBookIterator.hasNext();
        	
        	String nextBook = listBookIterator.next().toString();

            System.out.println(nextBook);
            
    }
	
	@Test
	@DisplayName("Null Itinerator")
    void testNullIterator() {
        List<Book> randomSampleBook = new ArrayList<Book>();
        Iterator<Book> listBookIterator = randomSampleBook.iterator();
            
        	boolean haveNextItemInList = listBookIterator.hasNext();
            
	}
}
