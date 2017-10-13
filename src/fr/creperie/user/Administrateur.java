package fr.creperie.user;

import java.time.LocalDateTime;

public class Administrateur extends Utilisateur{

	Administrateur(String identifiant, String nom, String prenom, LocalDateTime dateNaiss, Sexe sexe, String numTel,
			String mail) {
		super(identifiant, nom, prenom, dateNaiss, sexe, numTel, mail);
		// TODO Auto-generated constructor stub
	}

}
