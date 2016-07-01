package com.yy.testplatform.config;

import javax.inject.Singleton;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class ApplicationBinder extends AbstractBinder {
	
    @Override
    protected void configure() {
    	// services
        //bind(CustomerServiceImpl.class).to(CustomerService.class).in(Singleton.class);
        
        // dao
        //bind(CustomerDaoImpl.class).to(CustomerDao.class).in(Singleton.class);
    }
}