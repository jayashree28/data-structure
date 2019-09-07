package com.simple.prototype;

public class Rabbit implements Cloneable{

	public enum Breed{
		HIMALAYAN,
		AMERICAN,
		INDIAN;
		
	}
	
	
	private int age ;
	private Breed breed ;
	private Person owner;
	
	public Person getOwner() {
		return owner;
	}


	public void setOwner(String name) {
		Person owner = new Person(name);
		this.owner = owner;
	}


	public Rabbit() {
		
	}
	
	
	public void setAge( int age) {
		this.age = age ;
	}

	
	public int getAge() {
		return age ;
	}

	public Breed getBreed() {
		return breed;
	}


	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	
	public Rabbit clone() {
		try {
			Rabbit rabit = (Rabbit) super.clone();
			rabit.owner = owner.clone();
			return rabit ;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
	
	
}
