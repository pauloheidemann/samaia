package br.com.samaia.crudPF.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "endereco")
public class Endereco {

	@Id
	@GeneratedValue
	private long id;

	private String logradouro;
	private String cep;
	private Bairro bairro;
	private Cidade cidade;
	private String uf;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", logradouro=" + logradouro + ", cep=" + cep + ", bairro=" + bairro + ", cidade="
				+ cidade + ", uf=" + uf + "]";
	}

}
