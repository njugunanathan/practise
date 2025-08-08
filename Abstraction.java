package Grid;

	abstract class Animal {
	    abstract void sound();  // abstract method (no body)
	    
	    void breathe() {        // concrete method
	        System.out.println("Breathing...");
	    }
	}

	class Dog extends Animal {
	    @Override
	    void sound() {
	        System.out.println("Barks");
	    }
	}

 public class Abstraction { 
	 public static void main(String[] args) {
		 Dog d=new Dog();
		 d.sound();
		 d.breathe();
	 }
	 
 }