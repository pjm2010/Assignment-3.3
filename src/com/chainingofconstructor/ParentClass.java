package com.chainingofconstructor;
/*This class in the parent class */
public class ParentClass {

	ParentClass(){ 
		System.out.println("I am the default constructot in the parent class"); //Default Constructor
	}
	
	ParentClass(int x){
	this();
		System.out.println("I am another constructor in the parent class with one argument "); //Constructor with argument

	}
	
}
