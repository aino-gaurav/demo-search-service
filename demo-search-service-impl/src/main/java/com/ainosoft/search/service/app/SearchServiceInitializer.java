package com.ainosoft.search.service.app;

import java.lang.annotation.Annotation;

import org.appops.core.deployment.ServiceConfiguration;
import org.appops.service.ServiceInitializer;
import org.appops.service.generator.ServiceMetaGenerator;
import org.appops.slim.base.api.ServiceMetaManager;

import com.ainosoft.search.service.core.SearchService;
import com.google.inject.Inject;
import com.google.inject.Provider;

@SearchService
public class SearchServiceInitializer extends ServiceInitializer {

	@Inject
	public SearchServiceInitializer(Provider<ServiceMetaGenerator> serviceMetaGenerator,
			Provider<ServiceMetaManager> serviceMetaManager) {
		super(serviceMetaGenerator, serviceMetaManager);
	}

	@Override
	public String initialize(String serviceName, ServiceConfiguration config,
			Class<? extends Annotation> serviceAnnotation) {
		addServiceMeta(serviceName, config, serviceAnnotation);
		return serviceName;
	}

}
