package com.ainosoft.search.service.module;

import org.appops.core.annotation.SlimModule;
import org.appops.slim.base.injection.ServiceSlimModule;

import com.ainosoft.search.service.SearchApi;
import com.ainosoft.search.service.core.SearchService;

@SlimModule(serviceName = SearchService.class)
public class SearchServiceSlimModule extends ServiceSlimModule {

	@Override
	public void configureModule() {
		bindServiceApi(SearchApi.class);
	}

}
