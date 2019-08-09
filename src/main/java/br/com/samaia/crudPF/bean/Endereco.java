package br.com.samaia.crudPF.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "endereco")
public class Endereco {

	@Id
	@GeneratedValue
	private long id;
	
	private String logradouro;
	private String cep;
	
	@ManyToOne
	@JoinColumn(name = "bairro_id", nullable = false)
	private Bairro bairro;
	
	private String uf;

	@ManyToOne
	@JoinColumn(name = "pessoa_fisica_id", nullable = false)
	private PessoaFisica pessoaFisica;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", logradouro=" + logradouro + ", cep=" + cep + ", bairro=" + bairro + ", uf="
				+ uf + ", pessoaFisica=" + pessoaFisica + "]";
	}

}
