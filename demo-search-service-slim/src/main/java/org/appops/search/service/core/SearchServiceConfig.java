package org.appops.search.service.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.appops.core.annotation.Config;

@Config
@SearchService
@Retention(RetentionPolicy.RUNTIME)
public @interface SearchServiceConfig {

}
