package beans;

import javax.inject.Named;

@Named
public class HelloBean {


	public String getGreeting() {
		return "Hello World!";
	}
}
