package Exerc�cio_02;

@SuppressWarnings("serial")

public class EmptyStackException
	extends RuntimeException {
	public EmptyStackException(String err) {
		super(err);
	}
}