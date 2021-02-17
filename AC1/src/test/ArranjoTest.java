package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import arranjo.Arranjo;

class ArranjoTest {
	@Test
	void test() {
		Arranjo a = new Arranjo();
		
		// Testa se o menor � 510
		assertEquals(510, a.menor(), "O menor deve ser 440");
		
		// Testa se o maior � o 940
		assertEquals(940, a.maior(), "O maior � 940");
		
		// Testa se a soma � 7540
		assertEquals(7540, a.soma(), "A soma � 7040");
		
		
	}

}
