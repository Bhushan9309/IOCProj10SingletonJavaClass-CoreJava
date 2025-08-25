package com.nt.ston;
//Singleton Java Class
public class Printer 
{
      private static Printer INSTANCE; //private static reference variable of current class type
      
      //private constructor
      private Printer()
      {
    	  System.out.println("Printer : : 0-param constructor");
      }
      //static factory method having singleton logic
      public static Printer getInstance() {
    	  if(INSTANCE==null)
    		  INSTANCE= new Printer();
    	  
    	  return INSTANCE;
      }
      
      //business method
      public void printMessage(String msg) {
    	  System.out.println("Printer.printMessage()");
    	  System.out.println(msg);
      }
      
}
