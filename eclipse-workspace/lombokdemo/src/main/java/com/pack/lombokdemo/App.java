package com.pack.lombokdemo;

import lombok.NonNull;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Emp e1 = new Emp("Aditya",21,50000,"Tester");
        //Emp e2 = new Emp("Aditya",21,50000,"Tester");
        //e1=null;
        App.display(e1);
        
  
        //System.out.println(e1);
        //System.out.println(e2);
        //System.out.println(e1.equals(e2));
    }
    public static void display(@NonNull Emp e) {
    	System.out.println("-----EMPLOYEE DETAILS-----");
    	System.out.println(e);
    }
}
