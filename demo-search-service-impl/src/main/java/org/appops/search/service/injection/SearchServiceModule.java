package org.appops.search.service.injection;

import org.appops.core.annotation.ImplModule;
import org.appops.library.service.LibraryApi;
import org.appops.search.service.SearchApi;
import org.appops.search.service.core.SearchService;
import org.appops.search.service.impl.SearchApiImpl;
import org.appops.service.injection.ServiceModule;

@ImplModule(serviceName = SearchService.class)
public class SearchServiceModule extends ServiceModule {

	@Override
	public void configureModule() {
		bind(SearchApi.class).to(SearchApiImpl.class);
	}

}
