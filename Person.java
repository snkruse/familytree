import java.util.Scanner;
import java.util.InputMismatchException;


public class Person {
	String name;
	int age;
	
	//Default Constructor
	public Person(){
		this.name = null;
		this.age = 0; 
	}
	
   // Constructor for only 'name'
   public Person(String name){
      this.name = name;
      this.age = 0;
   }
   
   //Constructor for 'name' & 'int'
   public Person(String name, int age){
	   this.name = name;
	   this.age = age;
   }
   
   //Copy Constructor 
   public Person(Person another) {
	    this.name = another.name;
	    this.age  = another.age;
	  }
   
   
   public void print(Person p){
	   System.out.println(name + " " + age);
   }
   
   public Person getPerson(){
	// Initiate a new Scanner
       Scanner userInputScanner = new Scanner(System.in);
       System.out.println("What is your name? ");
       String tempName = userInputScanner.nextLine();
      
       boolean validInput = false;
       while(!validInput){
    	   System.out.println("What is thier age");
       try{
    	   age = userInputScanner.nextInt();
    	   validInput = true;
       }catch(InputMismatchException e){
    	   validInput = false;
    	   userInputScanner.nextLine();
       }
       }
       userInputScanner.close();
       System.out.println(tempName + " " + age);
       Person newPerson = new Person(tempName,age);
       return newPerson;
       
       
   }

}
