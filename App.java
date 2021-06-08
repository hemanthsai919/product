package com.cg.demo.method;

 

public class App {

 

    public static void main(String[] args) {

 

        int num = 10;
        Employee obj=new Employee();
        obj.id = 101;
        obj.name = "Abc";
        obj.salary = 10.5;
        System.out.println(obj.toString());

        Employee obj2= new Employee();
        obj2.id = 102;
        obj2.name = "Kbc";
        obj2.salary = 17.5;
        System.out.println(obj2.toString()); 
        
        Employee obj3= new Employee();
        obj3.id = 103;
        obj3.name = "Bbc";
        obj3.salary = 16.5;
        System.out.println(obj3.toString());
         
        Employee obj4 = new Employee(104,"Ddd",45.5);
        System.out.println(obj4.toString());
        
        Employee obj5 = new Employee(104,"Ddd",45.5);
        System.out.println(obj5.toString());
        
        Employee obj6 = new Employee(104,"Ddd");
        System.out.println(obj6.toString());
    }
    
    
    

 

}