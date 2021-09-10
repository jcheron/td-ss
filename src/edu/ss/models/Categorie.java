package edu.ss.models;

import java.util.ArrayList;
import java.util.List;

public class Categorie {
	private String nom;
	private String descriptif;
	private List<AssureSoc> lesAssures;

	public Categorie(String nom, String descriptif) {
		this.nom = nom;
		this.descriptif = descriptif;
		lesAssures = new ArrayList<>();
	}

	public Categorie(String nom) {
		this(nom, "");
	}

	/**
	 * Ajoute l'assuré passé en paramètre à la liste des assurés de la catégorie
	 * 
	 * @param assureSoc assuré à ajouter
	 */
	public void addAssure(AssureSoc assureSoc) {
		this.lesAssures.add(assureSoc);

	}

	@Override
	public String toString() {
		return this.descriptif;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public List<AssureSoc> getLesAssures() {
		return lesAssures;
	}

	public void setLesAssures(List<AssureSoc> lesAssures) {
		this.lesAssures = lesAssures;
	}
}
