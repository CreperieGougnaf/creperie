package fr.creperie.model;

import fr.creperie.model.Marchandise;

public class Crepe extends Marchandise {

	private int id;
	protected static int incrementId = 0;
	
	public Crepe(String name, String code, double price) {
		super(name, code, price);
		
		id = incrementId++;
		
		
		
		
		
	}

}
