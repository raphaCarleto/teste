import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CasoTeste {

	@Test
	public void testFibonacci() {
		Class1 classe = new Class1();
		assertEquals(1,classe.fibonacci(1));
	}
}
