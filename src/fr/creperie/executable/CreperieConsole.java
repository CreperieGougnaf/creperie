package fr.creperie.executable;


import java.util.*;

import fr.creperie.ihm.*;
import fr.creperie.model.*;
import fr.creperie.dao.*;

public class CreperieConsole {

	public static void main(String[] args) {
		
		// Initialisation
		Scanner clavier = new Scanner(System.in).useLocale(Locale.US);
		
		DaoMarchandise dao = new DaoMarchandise();
		dao.initMarchandise();
		
		
		for(Marchandise produit : dao.findAll()){
			
			System.out.println(produit);
		}
		
		Map<String, Menu> options = new TreeMap<>();
		
		options.put("1", new ListerMarchandise(dao, clavier));
		
		
		
		
		

	}

}
