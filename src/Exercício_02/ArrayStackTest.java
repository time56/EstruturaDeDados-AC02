package Exercício_02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayStackTest {
	static final ArrayStack<String> a = new ArrayStack<String>(3);
	@Test
	void pilhaStrings() {

		a.push("Felipe");
		assertEquals("[Felipe]", a.toString(), "Deve imprimir [Felipe]");

		a.push("Raquel");
		assertEquals("[Felipe, Raquel]", a.toString(), "Deve imprimir [Felipe, Raquel]");

		a.push("Vinicius");
		assertEquals("[Felipe, Raquel, Vinicius]", a.toString(), "Deve imprimir [Felipe, Raquel, Vinicius]");

		Assertions.assertThrows(FullStackException.class, () -> { a.push("Lucas"); });
		assertEquals("Vinicius", a.pop(), "Deve ter desempilhado Vinicius");

		assertEquals("[Felipe, Raquel]", a.toString(), "Deve imprimir [Felipe, Raquel]");

		assertEquals("Raquel", a.pop(), "Deve ter desempilhado Raquel");

		assertEquals("[Felipe]", a.toString(), "Deve imprimir [Felipe]");

		assertEquals("Felipe", a.pop(), "Deve ter desempilhado Felipe");

		assertEquals("[]", a.toString(), "Deve imprimir []");

		assertTrue(a.isEmpty());

		Assertions.assertThrows(EmptyStackException.class, () -> { a.pop(); });
	}
}
