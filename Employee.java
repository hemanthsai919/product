
package com.cg.demo.method;
/*
 * constructor
 * it is a special type of method in java.
 * it does not have any return type.
 * it is used to create and initialize object.
 * By default java provides one default comstructor.
 * constructor name is same as class name.
 * we can create our own constructor.
 * if we create our own constructors, java does not provide any constructor
 */

public class Employee {

 

    int id;
    String name;
    double salary;

   Employee() {
    	System.out.println("Default Constructor");
  }
    
   Employee(int id, String name) {
    	this.id = id;
    	this.name = name;
    	this.salary = salary;
    	System.out.println("two Parameterized constructor");
    }
   
   Employee(int id, String name, double salary) {
   	this.id = id;
   	this.name = name;
   	this.salary = salary;
   	System.out.println(" three Parameterized constructor");
   }
   
   
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

 

}







