package com.ainosoft.search.service.app;

import org.appops.core.ServiceException;
import org.appops.service.entrypoint.ServiceEntryPoint;

public class SearchServiceEntryPoint extends ServiceEntryPoint {
	public static void main(String[] args) throws ServiceException {
		new SearchServiceEntryPoint().startService(args);
	}
}
