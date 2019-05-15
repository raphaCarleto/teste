

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeUnitario {

	@Test
	void test() {
		calculo calc = new calculo();
		assertEquals(5, calc.somar(2, 3));
	}
}
