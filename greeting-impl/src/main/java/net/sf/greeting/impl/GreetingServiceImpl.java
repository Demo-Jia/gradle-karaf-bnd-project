package net.sf.greeting.impl;

import net.sf.greeting.api.GreetingService;

public class GreetingServiceImpl implements GreetingService{

	public String greet(String name) {
	    return String.format("Hola %s",name);
    }

}