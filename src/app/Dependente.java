package app;

public class Dependente {

	private String nome;
	private String DataDeNascimento;

	public Dependente(String nome, String dataDeNascimento) {
		this.nome = nome;
		this.DataDeNascimento = dataDeNascimento;
	}

	public String getnome() {
		return nome;
	}
	public String getdataDeNascimento() {
		return DataDeNascimento;
	}

}