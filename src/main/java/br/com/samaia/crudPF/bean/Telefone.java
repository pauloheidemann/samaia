package br.com.samaia.crudPF.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "telefone")
public class Telefone {

	@Id
	@GeneratedValue
	private long id;
	private String nrTelefone;

	@ManyToOne
	@JoinColumn(name = "pessoa_fisica_id", nullable = false)
	private PessoaFisica pessoaFisica;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNrTelefone() {
		return nrTelefone;
	}

	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}

	@Override
	public String toString() {
		return "Telefone [nrTelefone=" + nrTelefone + ", pessoaFisica=" + pessoaFisica + "]";
	}

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

}
