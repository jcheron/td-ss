package edu.ss.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import edu.ss.models.AssureSoc;
import edu.ss.models.Categorie;
import edu.ss.models.Ville;

class AssureSocTest {

	private void checkAssureInstance(AssureSoc assure) {
		assertEquals("1", assure.getNumero());
		assertEquals("Dupont", assure.getNom());
		assertEquals(20, assure.getAge());
		assertTrue(assure.getVilleNaissance() instanceof Ville);
		assertEquals("14000", assure.getVilleNaissance().getCp());
	}

	@Test
	void testAssureSocStringStringIntVille() {
		AssureSoc assure = new AssureSoc("1", "Dupont", 20, Ville.getDefault());
		checkAssureInstance(assure);
	}

	@Test
	void testAssureSocStringStringInt() {
		AssureSoc assure = new AssureSoc("1", "Dupont", 20);
		checkAssureInstance(assure);
	}

	@Test
	void testAssureSocStringString() {
		AssureSoc assure = new AssureSoc("1", "Dupont");
		checkAssureInstance(assure);
	}

	@Test
	void testAddToCategory() {
		AssureSoc assure = new AssureSoc("1", "Dupont");
		Categorie cat = new Categorie("Cat-test");
		assertEquals(0, assure.getCategories().size());
		assertEquals(0, cat.getLesAssures().size());
		assure.addToCategory(cat);
		assertEquals(1, assure.getCategories().size());
		assertEquals(1, cat.getLesAssures().size());
		assertTrue(assure.getCategories().contains(cat));
		assertTrue(cat.getLesAssures().contains(assure));
	}

	@Test
	void testToString() {
		AssureSoc assure = new AssureSoc("1", "Dupont");
		assertTrue(assure.toString().contains(assure.getNom()));
		assertTrue(assure.toString().contains("Dupont"));
	}

}
