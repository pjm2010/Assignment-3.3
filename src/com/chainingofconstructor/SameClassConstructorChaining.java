package com.chainingofconstructor;
/*This class will explain about the chain constructor calling within the same class*/
public class SameClassConstructorChaining {

	SameClassConstructorChaining(){
		System.out.println("The default constructor is being called"); 
	}
	
	SameClassConstructorChaining(int x){
		this(); // Calls the default constructor
		System.out.println("I am the constructor with one argument");
		
	}
	
	SameClassConstructorChaining(int x,int y){
	this(4); // Calls the default constructor
		System.out.println("I am the constructor with two arguments");
		
	}
}
