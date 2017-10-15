package fr.creperie.ihm;

import java.util.Scanner;

import fr.creperie.dao.DaoMarchandise;
import fr.creperie.model.Marchandise;

public class ListerMarchandise extends Menu {

	DaoMarchandise dao = null;
	Scanner clavier = null;
	
	public ListerMarchandise(DaoMarchandise dao, Scanner clavier){
		
		this.dao = dao;
		
	}

	
	void execute() {
		
		
	}
	
	
	
	
}
