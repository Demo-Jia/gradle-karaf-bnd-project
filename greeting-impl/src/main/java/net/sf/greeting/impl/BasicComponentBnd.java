package net.sf.greeting.impl;



import java.util.Map;

import aQute.bnd.annotation.component.Activate;
import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.ConfigurationPolicy;
import aQute.bnd.annotation.component.Modified;
import aQute.bnd.annotation.metatype.Configurable;


@Component(designate = BasicComponentBnd.Config.class, configurationPolicy = ConfigurationPolicy.require)

public class BasicComponentBnd {
	@interface Config {
		String message() default "Hola hola cocacola";
	}

	Config	config;

	@Activate
	void activate(Map<String,Object> props) {
		modified(props);
		System.out.println("Bnd Component: " + config.message());
	}

	@Modified
	void modified(Map<String,Object> props) {
		config = Configurable.createConfigurable(Config.class, props);
	}

}