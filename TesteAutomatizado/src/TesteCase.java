import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCase {

	@Test
	void test() {
		Class1 c = new Class1();
		assertEquals(1, c.fibonacci(4));

	}
	
	@Test
	void test2() {
		Class1 c = new Class1();
		assertEquals(1, c.fibonacci(1));
		assertEquals(1, c.fibonacci(2));
		assertEquals(2, c.fibonacci(3));
		assertEquals(3, c.fibonacci(4));
		assertEquals(5, c.fibonacci(5));
	}

}
