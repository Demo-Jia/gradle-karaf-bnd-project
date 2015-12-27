package net.sf.greeting.impl;

import aQute.bnd.annotation.component.Component;
import net.sf.greeting.api.GreetingService;

@Component
public class GreetingServiceImpl implements GreetingService{

	public String greet(String name) {
	    return String.format("Hola %s",name);
    }

}