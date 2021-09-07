package edu.ss.models;

import java.util.ArrayList;
import java.util.List;

public class AssureSoc {
	private String numero;
	private String nom;
	private int age;
	private Ville villeNaissance;
	private List<Categorie> categories;
	private List<Injection> injections;

	public AssureSoc(String numero, String nom, int age, Ville villeNaissance) {
		this.numero = numero;
		this.nom = nom;
		this.age = age;
		this.villeNaissance = villeNaissance;
		this.categories = new ArrayList<>();
		this.injections = new ArrayList<Injection>();
	}

	public AssureSoc(String numero, String nom, int age) {
		this(numero, nom, age, Ville.getDefault());
	}

	public AssureSoc(String numero, String nom) {
		this(numero, nom, 20, Ville.getDefault());
	}

	/**
	 * Retourne le nombre d'injections ayant été réalisées sur l'assuré pour une
	 * maladie
	 * 
	 * @param maladie
	 * @return
	 */
	private int getCountInjections(Maladies maladie) {
		int result = 0;
		for (Injection inj : this.injections) {
			if (inj.getType().equals(maladie)) {
				result++;
			}
		}
		return result;

	}

	/**
	 * Ajoute l'injection passée en paramètre aux injections de l'assuré L'ajoute à
	 * la catégorie 'ps' s'il s'agit de la 2nde injection COVID19
	 * 
	 * @param injection
	 */
	public void faireInjection(Injection injection) {

	}

	public void faireInjection(String produit, Maladies maladie) {

	}

	public void faireInjectionCovid(String produit) {

	}

	public void faireInjectionPfizer() {

	}

	/**
	 * Ajoute l'assuré dans la catégorie passée en paramètre et ajoute la catégorie
	 * à la liste des catégories de l'assuré
	 * 
	 * @param categorie
	 */
	public void addToCategory(Categorie categorie) {
		if (!categories.contains(categorie)) {
			categorie.addAssure(this);
			categories.add(categorie);
		}
	}

	@Override
	public String toString() {
		return "AssureSoc [numero=" + numero + ", nom=" + nom + ", age=" + age + ", villeNaissance=" + villeNaissance
				+ ", categories=" + categories + "]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Ville getVilleNaissance() {
		return villeNaissance;
	}

	public void setVilleNaissance(Ville villeNaissance) {
		this.villeNaissance = villeNaissance;
	}

	public List<Categorie> getCategories() {
		return categories;
	}

	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}
}
