/**
 * 
 */
package fr.creperie.user;

import java.time.LocalDateTime;

/**
 * @author Pauline J
 *
 */
abstract class Utilisateur {

	protected String identifiant;
	protected String nom;
	protected String prenom;
	//TODO add psw sha
	protected LocalDateTime dateNaiss;
	Sexe sexe;
	protected String numTel;
	protected String mail;
		
	Utilisateur(String identifiant, String nom, String prenom, LocalDateTime dateNaiss, Sexe sexe, String numTel, String mail){
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.sexe = sexe;
		this.numTel = numTel;
		this.mail = mail;
	}
}
