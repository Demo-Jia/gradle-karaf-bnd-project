package net.sf.greeting.impl;


import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Component(immediate = true)
@Designate(ocd = BasicComponentCmpn.Config.class)
public class BasicComponentCmpn {
	@ObjectClassDefinition(name = "Server Configuration")
	@interface Config {
		String message() default "Hola hola cocacola";
	}

	Config	config;

	@Activate
	void activate(Config config) {
		this.config = config;
		System.out.println("Cmpn Component: " + config.message());
	}

	@Deactivate
	void deactivate() {
		System.out.println("Bye: " + config.message());
	}


}