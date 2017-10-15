package fr.creperie.dao;

import java.util.ArrayList;
import fr.creperie.model.*;

public class DaoMarchandise {

	ArrayList<Marchandise> produits = new ArrayList<>();
	
	
	ArrayList<Marchandise> show(){
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

	public boolean delete(Marchandise produitSuppr, String code){
		
	 for(Marchandise produit : show()){
		 
		 if(produit.getCode().equals(code)){
			 produits.remove(produitSuppr);
			 return true;
		 }
		 
	 }
	 return false;
		
	}

}
