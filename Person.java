package com.simple.prototype;
/**
 * 
 * @author jayashree.d
 *
 */
public class Person implements Cloneable {
	
	private String name ;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public Person clone() {

		try {
			return (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();

		}

	}
	

}
