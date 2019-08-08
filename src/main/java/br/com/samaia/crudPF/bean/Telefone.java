package br.com.samaia.crudPF.bean;

import javax.persistence.Embeddable;

@Embeddable
public class Telefone {

	private String nrTelefone;

	public String getNrTelefone() {
		return nrTelefone;
	}

	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}

	@Override
	public String toString() {
		return "Telefone [nrTelefone=" + nrTelefone + "]";
	}

}
