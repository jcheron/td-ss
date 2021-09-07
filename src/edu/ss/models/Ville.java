package edu.ss.models;

public class Ville {
	private String cp;
	private String nom;

	public Ville(String cp, String nom) {
		this.cp = cp;
		this.nom = nom;
	}

	public static Ville getDefault() {
		return new Ville("14000", "CAEN");
	}

	@Override
	public String toString() {
		return cp + " " + nom;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
