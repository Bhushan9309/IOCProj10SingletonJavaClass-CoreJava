package com.nt.main;

import com.nt.ston.Printer;

//Client Application
//Main Method Class
public class SingletonTest {

	public static void main(String[] args) {
		//get  or calling singleton class(Printer) object
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		
		System.out.println(p1.hashCode() + "  "+p2.hashCode());
		System.out.println("p1==p2?"+(p1==p2));
		
		System.out.println("================================");
		p1.printMessage("hello");
		p2.printMessage("ramesh");

	}

}
