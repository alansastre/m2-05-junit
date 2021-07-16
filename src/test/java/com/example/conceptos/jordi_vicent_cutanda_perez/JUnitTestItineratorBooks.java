package com.example.conceptos.jordi_vicent_cutanda_perez;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.demo.patterns.behavioral.iterator.Book;

import junit.framework.TestCase;

class JUnitTestBookShopItinerator extends TestCase {
	private static final String LORE_IPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Id diam veunt praesent semper feugiat.";

	private List<Book> addSampleListBooksTest (int numberBooks) {

        List<Book> sampleListBooks =  new ArrayList<Book>();

        String[] loreIpsumRandom = LORE_IPSUM.split(" ");

        for (int actualNewBook = 0;
                actualNewBook <= numberBooks;
                actualNewBook++) {
            int randomNumberISBN = (int)Math.round(Math.random()*(999999));
            String isbn = "ISBN - " + String.format("%06d", randomNumberISBN);

            int randomPositionString = ((int)Math.round(Math.random()*((loreIpsumRandom.length)-1)));
            String authorString = loreIpsumRandom[randomPositionString];

            int randomYear = ((int)Math.round(Math.random()*(100))) + 1920;
            int year = Integer.parseInt(String.format("%04d", randomYear));

            Book randomNewBook = new Book(isbn, authorString, year);

            sampleListBooks.add(randomNewBook);
        }
		return sampleListBooks;
	}
	
	@Test
    void testIterator() {

        int randomBooksToCreate = (int)Math.round(Math.random()*(1000));

        List<Book> randomSampleBooks = addSampleListBooksTest(randomBooksToCreate);
        Iterator<Book> listBooksIterator = randomSampleBooks.iterator();

        for (int actualBook = 1; actualBook <= (randomSampleBooks.size()); actualBook++) {

            
        	boolean haveNextItemInList = listBooksIterator.hasNext();
        	
        	System.out.println("Actual Position: " + String.valueOf(actualBook)
            + " of "
            + String.valueOf(randomSampleBooks.size()));

            System.out.println(listBooksIterator.next().toString());

            assertEquals
            ("Position fail: "
            + String.valueOf(actualBook)
            + " of "
            + String.valueOf(randomSampleBooks.size()),
            true, haveNextItemInList);
        }

    }
}