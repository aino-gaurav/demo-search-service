package org.appops.search.service.module;

import org.appops.core.annotation.SlimModule;
import org.appops.search.service.SearchApi;
import org.appops.search.service.core.SearchService;
import org.appops.slim.base.injection.ServiceSlimModule;

@SlimModule(serviceName = SearchService.class)
public class SearchServiceSlimModule extends ServiceSlimModule {

	@Override
	public void configureModule() {
		bindServiceApi(SearchApi.class);
	}

}
