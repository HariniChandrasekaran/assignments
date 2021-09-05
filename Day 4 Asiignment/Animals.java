package com.src;

	abstract class Animal
	{
		public abstract void walk();
		public abstract void eat();
	}
	interface Pet
	{
		public void getName();
		public String setName(String name);
		public void play();
	}
	class Cat extends Animal implements Pet{
		private String name;
		public void walk() {
			System.out.println("The Cat Walks By Leg");
		}
		public void eat() {
			System.out.println("The Cat eats: meat");
		}
		public void getName() {
			System.out.println("The Cat Name is: "+name);
		}
		public String setName(String name) {
			return this.name=name;
		}
		public void play() {
			System.out.println("The Cat Plays football");
			
		}
	}

	class Spider extends Animal{

		public void walk() {
			System.out.println("The Spider Walks by legs ");
		}

		public void eat() {
			System.out.println("Spider eats Insects");
			
		}
		
	}

	class Fish extends Animal implements Pet{
		private String name;
		public void walk() {
			System.out.println("The Fish Swims");
		}
		public void eat() {
			System.out.println("The Fish eats: fish food");
		}
		public void getName() {
			System.out.println("The Fish Name is: "+name);
		}
		public String setName(String name) {
			return this.name=name;
		}
		public void play() {
			System.out.println("The Fish Plays in water");
			
		}
	}






//main

package com.src;
public class Animals
{
public static void main(String[] args) 
{

	System.out.println("The Cat:");
	Animal c1=new Cat();
	Pet c2=new Cat();
	c2.setName("Lily");
	c2.getName();
	c2.play();
	c1.walk();
	c1.eat();	
	System.out.println("The Fish:");
	Animal f1=new Fish();
	Pet f2=new Fish();
	f2.setName("Pooh");
	f2.getName();
	f2.play();
	f1.walk();
	f1.eat();
	System.out.println("SPIDER:");
	Animal s=new Spider();
	s.walk();
	s.eat();
}	   
}