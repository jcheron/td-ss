package edu.ss.models;

public class Injection {
	private String produit;
	private Maladies type;

	public Injection(String produit, Maladies type) {
		super();
		this.produit = produit;
		this.type = type;
	}

	public Injection(String produit) {
		this(produit, Maladies.COVID19);
	}

	public Injection() {
		this("Pfizer", Maladies.COVID19);
	}

	public String getProduit() {
		return produit;
	}

	public void setProduit(String produit) {
		this.produit = produit;
	}

	public Maladies getType() {
		return type;
	}

	public void setType(Maladies type) {
		this.type = type;
	}
}
