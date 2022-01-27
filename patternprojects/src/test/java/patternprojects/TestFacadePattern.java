package patternprojects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.designpattern.facadepattern.SalesManager;

class TestFacadePattern {

	@Test
	void testClosetTypes() {
		SalesManager slman = new SalesManager();
		
		assertEquals("Linen", slman.ShowClosetTypes());
	}

	@Test
	void testWoodTypes() {
		SalesManager slman = new SalesManager();
		
		assertEquals("Bamboo", slman.ShowWoodTypes());
	}
}
