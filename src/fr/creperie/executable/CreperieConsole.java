package fr.creperie.executable;

import java.util.HashMap;
import java.util.Locale;
import java.util.*;

import fr.creperie.model.*;
import fr.creperie.dao.*;

public class CreperieConsole {

	public static void main(String[] args) {
		
		// Initialisation
		Scanner questionUser = new Scanner(System.in).useLocale(Locale.US);
		
		DaoMarchandise dao = new DaoMarchandise();
		
		Map<String, DaoMarchandise> options = new HashMap();
		
		//options.put("1", new add(dao, questionUser));
		
		
		
		

	}

}
