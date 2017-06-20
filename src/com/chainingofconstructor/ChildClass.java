package com.chainingofconstructor;

public class ChildClass extends ParentClass{
/*This class is a Child Class whose constructors will call the constructor of the parent class*/
	ChildClass(){
		super();		//Calling the default parent constructor 
		System.out.println("I am the default constructor of the child class");
	}
	
	ChildClass(int x){
		
		super(4); 		//Will call the one argument parent of the parent  class
	 }
	
	ChildClass(int x,int y){
		
		this();	//Will call the constructor of child class
	}
}
