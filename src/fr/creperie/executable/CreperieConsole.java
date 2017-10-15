package fr.creperie.executable;

import java.util.HashMap;
import java.util.Locale;
import java.util.*;

import fr.creperie.ihm.*;
import fr.creperie.model.*;
import fr.creperie.dao.*;

public class CreperieConsole {

	public static void main(String[] args) {
		
		// Initialisation
		Scanner clavier = new Scanner(System.in).useLocale(Locale.US);
		
		DaoMarchandise dao = new DaoMarchandise();
		
		Map<String, Menu> options = new TreeMap<>();
		
		options.put("1", new ListerMarchandise(dao, clavier));

		
		
		
		

	}

}
