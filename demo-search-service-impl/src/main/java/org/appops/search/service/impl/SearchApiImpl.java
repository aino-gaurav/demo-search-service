package org.appops.search.service.impl;

import java.util.ArrayList;

import org.appops.library.service.LibraryApi;
import org.appops.library.service.slim.Book;
import org.appops.search.service.SearchApi;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class SearchApiImpl implements SearchApi {
	
	@Inject
	private Provider<LibraryApi> libraryApi;

	@Override
	public Book getBookByName(String name) throws Exception {
		ArrayList<Book> bookList = libraryApi.get().getBookList();

		Book result = new Book();
		
		for (Book book : bookList) {
			if (book.getBookName().equalsIgnoreCase(name)) {
				result = book;
				break;
			}
		}
		
		return result;
	}

	@Override
	public Book getBestSeller() throws Exception {
		Book book = libraryApi.get().getBestSeller();
		return book;
	}

}
