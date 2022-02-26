package app;

public class ValorDeducaoInvalidoException extends IllegalArgumentException{


	private static final long serialVersionUID = -1624110845580967622L;

	public ValorDeducaoInvalidoException(String message) {
		super(message);
	}
}
