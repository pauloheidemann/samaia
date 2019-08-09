package br.com.samaia.crudPF.bean;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

@Entity(name = "pessoa_fisica")
public class PessoaFisica {

	@Id
	@GeneratedValue
	private long id;

	private String nome;
	private String cpf;
	private String email;
	private LocalDate dataNascimento;
	
	@CreationTimestamp
	private LocalDate dataCadastro;
	
	@OneToMany(mappedBy = "pessoaFisica")
	private List<Endereco> enderecos;
	
	@OneToMany(mappedBy = "pessoaFisica")
	private List<Telefone> telefones;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	@Override
	public String toString() {
		return "PessoaFisica [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", dataNascimento="
				+ dataNascimento + ", dataCadastro=" + dataCadastro + ", enderecos=" + enderecos + ", telefones="
				+ telefones + "]";
	}

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
		PessoaFisica other = (PessoaFisica) obj;
		if (id != other.id)
			return false;
		return true;
	}

}