package Exercício_04;


public class NodeStack<E> implements Stack<E> {

	protected Node<E> top; // referência para o nodo cabeça
	protected int size; // quantidade de elementos na pilha

	public NodeStack() { // constrói uma pilha vazia
		top = null;
		size = 0;
	}
	
	public int size() {
		return size; 
	}
	
	public boolean isEmpty() {
		if (top == null) { 
			return true;
		}
		return false;
	}
	
	public void push(E elem) {
		Node<E> v = new Node<E>(elem, top); // cria e encadeia um nodo novo
		top = v;
		size++;
	}
	
	public E top() throws EmptyStackException {
		if (isEmpty()) { 
			throw new EmptyStackException("Stack is empty."); 
		}
		return top.getElement();
	}
	
	public E pop() throws EmptyStackException {
		Node<E> aux = top;
		if (isEmpty()) throw new EmptyStackException("Stack is empty.");
		E temp = top.getElement();
		top = top.getNext(); // desencadeia o nodo topo
		aux.setNext(null);
		size--;
		return temp;
	}
	
	public String toString() {
		String s;
		Node<E> p = top;
		s = "[";
		
		while (p != null) {
			s += p.getElement();
			s += ", ";
			p = p.getNext();
		}
		
		if (s.length() > 1) {
			s = s.substring(0, s.length() - 2);
		}
		return s + "]";
	}
	
	public NodeStack<E> reverseStack() {
        NodeStack<E> newNodeStack = new NodeStack<E>();
        Node<E> last = this.top;
        while (this.size() != newNodeStack.size()) {
            newNodeStack.push(last.getElement());
            if (newNodeStack.top.getNext() != null) {
                newNodeStack.top.setNext(newNodeStack.top.getNext());
            }
            last = last.getNext();
        }
        return newNodeStack;
    }
	
	public boolean avaliarExpressao(String string) {
		NodeStack<String> pilha = new NodeStack<String>();  
		String[] lista = string.split("");
		for (String character : lista) {
			String elem = character;
			if (elem.equals("(") || elem.equals("[") || elem.equals("{")) {
				pilha.push(elem);
			} 
			
			if (elem.equals(")")) {
				if (pilha.isEmpty()) {
					return false;
				} else {
					if (pilha.top().equals("(")) {
						pilha.pop();
						continue;
					} else {
						return false;
					}
				}
			}
		
			if (elem.equals("]")) {
				if (pilha.pop().equals("[")) {
					continue;
				} else {
					return false;
				}
			}
			
			if (elem.equals("}")) {
				if (pilha.pop().equals("{")) {
					continue;
				} else {
					return false;
				}
			}
		}
		if (pilha.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}