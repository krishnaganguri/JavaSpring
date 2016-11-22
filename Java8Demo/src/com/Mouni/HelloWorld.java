package com.Mouni;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
public static void main(String args[]){
	Greeting greet1 = message ->
    System.out.println("Hello " + message);
    greet1.getMessage("World");
    List places = new ArrayList();
	
    places.add("Chicago");
    places.add("Houston");
    places.add("Alabama");
    	
    places.forEach(System.out::println);
}
}
