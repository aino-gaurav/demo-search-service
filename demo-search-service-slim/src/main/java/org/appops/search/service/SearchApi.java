package org.appops.search.service;


import org.appops.core.service.RequestMethod;
import org.appops.core.service.annotation.ServiceOp;
import org.appops.library.service.slim.Book;
import org.appops.search.service.core.SearchService;

@SearchService
public interface SearchApi {
	
	@ServiceOp(method = RequestMethod.GET, path = "book")
	public Book getBookByName(String name) throws Exception;
	
	@ServiceOp(method = RequestMethod.GET, path = "bestseller")
	public Book getBestSeller() throws Exception;
}