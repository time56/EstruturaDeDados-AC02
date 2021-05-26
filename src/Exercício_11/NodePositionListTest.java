package Exerc�cio_11;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class NodePositionListTest {
	@Test
	void test() {
		NodePositionList<Integer> l = new NodePositionList<Integer>();
		l.addFirst(8);
		
		Position<Integer> p1 = l.first();
		l.addAfter(p1, 5);
		
		//Position<Integer> p2 = l.next(p1);
		//l.addBefore(p2, 3);
		
		//l.addFirst(9);
		//assertEquals("[9, 8, 3, 5]", l.toString(), "[9, 8, 3, 5]");
		
		l.inverterLista();
		assertEquals("[5, 8]", l.toString(), "[8, 5]");
	}
}
