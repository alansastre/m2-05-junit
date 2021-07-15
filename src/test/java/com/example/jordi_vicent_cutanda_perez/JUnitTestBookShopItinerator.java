package com.example.jordi_vicent_cutanda_perez;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.demo.patterns.behavioral.iterator.Book;

import junit.framework.TestCase;

class JUnitTestBookShopItinerator extends TestCase {
	
	private static final String LORE_IPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Id diam vel quam elementum. Bibendum enim facilisis gravida neque convallis a cras semper. Lectus mauris ultrices eros in cursus turpis massa. Vitae congue mauris rhoncus aenean vel elit scelerisque mauris pellentesque. At elementum eu facilisis sed odio morbi quis commodo. Laoreet suspendisse interdum consectetur libero id faucibus nisl. Risus commodo viverra maecenas accumsan lacus vel facilisis volutpat est. Magnis dis parturient montes nascetur ridiculus mus mauris vitae. Pulvinar elementum integer enim neque volutpat ac tincidunt. Imperdiet sed euismod nisi porta lorem. Amet luctus venenatis lectus magna fringilla urna. Maecenas pharetra convallis posuere morbi leo. Urna nec tincidunt praesent semper feugiat.";
		
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

		int randomBooksToCreate = (int)Math.round(Math.random()*(10000));
		
		List<Book> randomSampleBooks = addSampleListBooksTest(randomBooksToCreate);
		Iterator<Book> listBooksIterator = randomSampleBooks.iterator();
		
		for (int actualBook = 0; actualBook <= (randomSampleBooks.size()); actualBook++) {
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
