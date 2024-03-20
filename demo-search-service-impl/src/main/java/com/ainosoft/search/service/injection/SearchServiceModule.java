package com.ainosoft.search.service.injection;

import org.appops.core.annotation.ImplModule;
import org.appops.service.injection.ServiceModule;

import com.ainosoft.library.service.LibraryApi;
import com.ainosoft.search.service.SearchApi;
import com.ainosoft.search.service.core.SearchService;
import com.ainosoft.search.service.impl.SearchApiImpl;

@ImplModule(serviceName = SearchService.class)
public class SearchServiceModule extends ServiceModule {

	@Override
	public void configureModule() {
		bind(SearchApi.class).to(SearchApiImpl.class);
	}

}
