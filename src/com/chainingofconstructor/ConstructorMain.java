package com.chainingofconstructor;

public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SameClassConstructorChaining same=new SameClassConstructorChaining();//Calls the default constructor 
		System.out.println("*****************************");
		
		SameClassConstructorChaining sam1=new SameClassConstructorChaining(1);//Calls the constructor with argument
		System.out.println("*****************************");
		
		
		SameClassConstructorChaining sam2=new SameClassConstructorChaining(1,2);//Calls the constructor with argument
		System.out.println("*****************************");
		ChildClass child=new ChildClass();			//Calls the child constructor without argument
		System.out.println("*****************************");
		ChildClass child1=new ChildClass(4);	//Calls the constructor with argument
		System.out.println("*****************************");
		ChildClass child2=new ChildClass(4,5); 		//Calls the child class with arguments
		
	}

}
