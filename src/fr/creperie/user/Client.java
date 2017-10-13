package fr.creperie.user;

import java.time.LocalDateTime;

public class Client extends Utilisateur {
	

	Client(String identifiant, String nom, String prenom, LocalDateTime dateNaiss, Sexe sexe, String numTel,
			String mail) {
		super(identifiant, nom, prenom, dateNaiss, sexe, numTel, mail);
		// TODO Auto-generated constructor stub
	}
	
	
	public void ShowCrepe() {
		
	}
	
	public void BuyCrepe() {
		
	}

}
