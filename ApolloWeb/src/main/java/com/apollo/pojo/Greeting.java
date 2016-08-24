package com.apollo.pojo;

public class Greeting {
Long id;
String greeting;
public Greeting(Long id, String greeting) {
	super();
	this.id = id;
	this.greeting = greeting;
}
public Long getId() {
	return id;
}
public String getGreeting() {
	return greeting;
}


}
