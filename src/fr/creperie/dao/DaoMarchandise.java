package fr.creperie.dao;

import java.util.ArrayList;
import fr.creperie.model.*;

public class DaoMarchandise {

	ArrayList<Marchandise> produits = new ArrayList<>();
	
	public void initMarchandise(){
		
		Marchandise marchandise1 = new Crepe("La Dame Blanche", "DM", 7);
		produits.add(marchandise1);
		Marchandise marchandise2 = new Crepe("La Belle Hélène", "BH", 6);
		produits.add(marchandise2);
		Marchandise marchandise3 = new Crepe("La Dugesclin", "DG", 8);
		produits.add(marchandise3);
		
		
		
		
	}
	
	public ArrayList<Marchandise> show(){
		return produits;
	}

	public boolean add (Marchandise produit){
		produits.add(produit);
		return true;
	}

	public boolean update(Marchandise newProduit, String code){
		for(Marchandise produit : show()){
			
			if(produit.getCode().equals(code)){
				produits.remove(produit);
				produits.add(newProduit);
				return true;
			}
		}
		return false;
	}

	public boolean delete(String code){
		
	 for(Marchandise produit : show()){
		 
		 if(produit.getCode().equals(code)){
			 produits.remove(produit);
			 return true;
		 }
		 
	 }
	 return false;
		
	}

}
