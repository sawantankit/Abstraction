package org.ankit.abstractclass;


abstract class Animal{
   
   public abstract void sound();
   
   public void bark()
   {
   System.out.println("I am in Animal Class");
   }


}

public class Dog extends Animal
{

 public void sound()
  {
System.out.println("Woof");
  }
   
   public void bark()
   {
	   
	  System.out.println("Barking");
   }
   
   public static void main(String args[])
   {
	Animal obj = new Dog();
	obj.sound();
	obj.bark();
   }
}