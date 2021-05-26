package Exercício_08;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class QueueTest {
	@Test
	void test() {
		QueueArray<Integer> queue = new QueueArray<Integer>(3);
		
		queue.enqueue(5);
		assertEquals("[5]", queue.toString(), "Deve retornar [5]");
		
		queue.enqueue(3);
		assertEquals("[5, 3]", queue.toString(), "Deve retornar [5, 3]");
		
		int retorno = queue.dequeue();
		assertEquals("[3]", queue.toString(), "Deve retornar [3]");
		assertEquals(5, retorno, "Deve retornar o inteiro 5");
		
		queue.enqueue(7);
		assertEquals("[3, 7]", queue.toString(), "Deve retornar [3, 7]");
		
		int retorno1 = queue.dequeue();
		assertEquals("[7]", queue.toString(), "Deve retornar [7]");
		assertEquals(3, retorno1, "Deve retornar o inteiro 3");
		
		int front = queue.front();
		assertEquals("[7]", queue.toString(), "Deve retornar [7]");
		assertEquals(7, front, "Deve retornar o inteiro 7");
		
		int retorno2 = queue.dequeue();
		assertEquals("[]", queue.toString(), "Deve retornar []");
		assertEquals(7, retorno2, "Deve retornar o inteiro 7");
		
		assertEquals(true, queue.isEmpty(), "Deve retornar true");
		
		queue.enqueue(9);
		assertEquals("[9]", queue.toString(), "Deve retornar [9]");
		
		assertEquals(1, queue.size(), "Deve retornar o inteiro 1");
	}
}
