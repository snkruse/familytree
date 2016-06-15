import java.util.Scanner;
import java.util.*;


public class Person {
	String name;
	int age;
	
	//Default Constructor
	public Person(){
		this.name = null;
		this.age = 0; 
	}
	
   // This is the constructor of the class Employee
   public Person(String name){
      this.name = name;
   }
   
   public Person(String name, int age){
	   this.name = name;
	   this.age = age;
   }
   
   public void getPerson(){
	// Initiate a new Scanner
       Scanner userInputScanner = new Scanner(System.in);
       System.out.print("\nWhat is your name? ");
       String name = userInputScanner.nextLine();
       System.out.println(name);
       userInputScanner.close();
   }

}
