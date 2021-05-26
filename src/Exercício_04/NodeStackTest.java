package Exercício_04;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NodeStackTest {

	Object o;
	static NodeStack<Integer> a = new NodeStack<Integer>();

	@Test
	void pilhaInteiros() {
	
		a.push(7);
		assertEquals("[7]", a.toString(), "Deve imprimir [7]");
		
		a.push(9);
		assertEquals("[9, 7]", a.toString(), "Deve imprimir [9, 7]");
		
		a.push(1);
		assertEquals("[1, 9, 7]", a.toString(), "Deve imprimir [1, 9, 7]");
		
		// b. Inverta os dados de um arranjo usando o TAD Pilha usando LSE.
		a = a.reverseStack();
		assertEquals("[7, 9, 1]", a.toString(), "Deve imprimir [7, 9, 1]");
		
		// c. Verifique se parênteses, colchetes e chaves estão corretos numa expressão
		assertTrue("Verdadeiro", a.avaliarExpressao("()(()){([()])}"));
		assertTrue("Verdadeiro", a.avaliarExpressao("((()(()){([()])}))"));
		assertFalse("Falso", a.avaliarExpressao(")(( )){([( )])}"));
		assertFalse("Falso", a.avaliarExpressao("({[])}"));
		assertFalse("Falso", a.avaliarExpressao("("));
	}
}