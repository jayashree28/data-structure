package com.simple.prototype;

public class MainController {

	
	
	public static void main(String[] arg) {
		Rabbit rabit = new Rabbit();
		rabit.setAge(6);
		rabit.setOwner("jayashree");
		Rabbit copyRabit = rabit.clone();
		System.out.println( " original  "+ rabit.getOwner().getName());
		System.out.println(" duplicate "+ copyRabit.getOwner().getName());
		
		copyRabit.getOwner().setName("banashree");
		System.out.println( " original  "+ rabit.getOwner().getName());
		System.out.println(" duplicate   "+ copyRabit.getOwner().getName());
		
		
	}
}
