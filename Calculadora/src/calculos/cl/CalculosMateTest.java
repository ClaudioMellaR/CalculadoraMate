package calculos.cl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class CalculosMateTest {

	@Test
	@DisplayName("testmetodosumar")
	int testSumar() {
		CalculosMate calculo = new.CalculosMate()
		int resultado = CalculosMate.sumar();
		assertEquals(12,resultado,"Falló debió ser 6");
		assertTrue(CalculosMate.sumar()==(3+3));
	}

	@Test
	void testRestar() {
		fail("Not yet implemented");
	}

	@Test
	void testMultiplicar() {
		fail("Not yet implemented");
	}

	@Test
	void testDividir() {
		fail("Not yet implemented");
	}

}
