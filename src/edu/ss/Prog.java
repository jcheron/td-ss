package edu.ss;

import java.util.ArrayList;
import java.util.List;

import edu.ss.models.AssureSoc;
import edu.ss.models.Categorie;

public class Prog {
	
	private static List<Categorie> categories;
	private static List<AssureSoc> assures;
	
	/**
	 * Charge des assurés et des catégories (en dur)
	 */
	private static void loadDatas() {
		assures=new ArrayList<>();
		assures.add(new AssureSoc("20014", "MARIE"));
		assures.add(new AssureSoc("10150", "OMER"));
		categories=new ArrayList<>();
		categories.add(new Categorie("pv", "Assurés primo-vaccinés"));
		categories.add(new Categorie("ps", "Assurés ayant le Pass sanitaire"));
		
	}
	
	public static void main(String[] args) {
		loadDatas();
		assures.get(0).addToCategory(categories.get(1));
		assures.get(0).addToCategory(categories.get(1));
		System.out.println(assures.get(0));
		System.out.println(categories.get(1));
	}

}
