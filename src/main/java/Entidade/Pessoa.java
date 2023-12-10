package Entidade;

public class Pessoa {
	
	private String CPF;
	private String Nome;
	private Double totalLiquido;
	
	public Pessoa(String cPF, String nome, Double totalLiquido) {
		CPF = cPF;
		Nome = nome;
		this.totalLiquido = totalLiquido;
	}

	public String getCPF() {
		return CPF;
	}

	public String getNome() {
		return Nome;
	}

	public Double getTotalLiquido() {
		return totalLiquido;
	}
	
}
