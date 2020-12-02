package ch08.ch05.ch06;

public class AnimalMain {
    static void greet(Animal animal) {
    	  if(animal instanceof Dog) {
    	     Dog dog=(Dog)animal;//Animal -> Dog
    	     dog.say();
    	  }else if(animal instanceof Cat) {
    		 ((Cat)animal).say();
    	  }
    }
	
	public static void main(String[] args) {
         greet(new Dog());//Dog -> Animal	
         
         greet(new Cat());//Cat -> Animal

	}

}
