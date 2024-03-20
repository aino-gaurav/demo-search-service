package com.ainosoft.search.service;

import org.appops.core.service.RequestMethod;
import org.appops.core.service.annotation.ServiceOp;

import com.ainosoft.library.service.slim.Book;
import com.ainosoft.search.service.core.SearchService;

@SearchService
public interface SearchApi {
	
	@ServiceOp(method = RequestMethod.GET, path = "book")
	public Book getBookByName(String name) throws Exception;
}