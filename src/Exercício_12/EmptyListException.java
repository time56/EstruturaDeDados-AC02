package Exerc�cio_12;

/* Exce��o lan�ada se a lista estiver vazia e tentar, por exemplo, 
 * obter o primeiro elemento da lista usando o m�todo first. */
@SuppressWarnings("serial")
public class EmptyListException extends RuntimeException {
	public EmptyListException(String err) { super(err); }
}
