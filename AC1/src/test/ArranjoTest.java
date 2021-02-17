package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import arranjo.Arranjo;

class ArranjoTest {
	@Test
	void test() {
		Arranjo a = new Arranjo();
		
		// Testa se o menor é 510
		assertEquals(510, a.menor(), "O menor deve ser 440");
		
		// Testa se o maior é o 940
		assertEquals(940, a.maior(), "O maior é 940");
		
		// Testa se a soma é 7540
		assertEquals(7540, a.soma(), "A soma é 7040");
		
		
	}

}
