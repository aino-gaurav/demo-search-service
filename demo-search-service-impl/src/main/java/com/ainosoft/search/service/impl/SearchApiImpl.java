package com.ainosoft.search.service.impl;

import java.util.List;

import com.ainosoft.library.service.LibraryApi;
import com.ainosoft.library.service.slim.Book;
import com.ainosoft.search.service.SearchApi;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class SearchApiImpl implements SearchApi {
	
	@Inject
	private Provider<LibraryApi> libraryApi;

	@Override
	public Book getBookByName(String name) throws Exception {
		List<Book> bookList = libraryApi.get().getBookList();

		Book result = null;
		
		for (Book book : bookList) {
			if (book.getBookName().equalsIgnoreCase(name)) {
				result = book;
				break;
			}
		}
		
		return result;
	}

}
