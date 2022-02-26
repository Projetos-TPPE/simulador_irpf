package app;

public class ValorPensaoInvalidoException extends IllegalArgumentException{

	private static final long serialVersionUID = 1172004729557787955L;

	public ValorPensaoInvalidoException(String message) {
		super(message);
	}
}

