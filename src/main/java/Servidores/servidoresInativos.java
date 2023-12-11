package Servidores;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import Entidade.Pessoa;

@Entity
public class servidoresInativos extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Vinculo;

	public servidoresInativos(Integer id,String cPF, String nome, Double totalLiquido, String vinculo) {
		super(cPF, nome, totalLiquido);
		this.id = id;
		Vinculo = vinculo;
		}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVinculo() {
		return Vinculo;
	}

	public void setVinculo(String vinculo) {
		Vinculo = vinculo;
	}
}