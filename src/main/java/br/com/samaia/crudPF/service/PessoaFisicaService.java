package br.com.samaia.crudPF.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.samaia.crudPF.bean.PessoaFisica;
import br.com.samaia.crudPF.interfaces.IPessoaFisicaRepository;
import br.com.samaia.crudPF.interfaces.IPessoaFisicaService;

@Service
public class PessoaFisicaService implements IPessoaFisicaService {

	@Autowired
	private IPessoaFisicaRepository repository;

	public void salvar(PessoaFisica pessoa) throws Exception {
		validarPessoa(pessoa);
		repository.save(pessoa);
	}

	public void atualizar(PessoaFisica pessoa) throws Exception {
		validarPessoa(pessoa);
		repository.save(pessoa);
	}

	public void remover(PessoaFisica pessoa) throws Exception {
		repository.delete(pessoa);
	}

	public PessoaFisica consultarPessoaFisica(Long idPessoaFisica) throws Exception {
		Optional<PessoaFisica> pessoaFisica = repository.findById(idPessoaFisica);
		if(pessoaFisica.isPresent())
			return pessoaFisica.get();
		else
			throw new IllegalArgumentException("O ID para busca da pessoa � inv�lido");
	}

	public List<PessoaFisica> consultarTodasPessoasFisicas() throws Exception {
		return repository.findAll();
	}
	
	private void validarPessoa(PessoaFisica pessoa) {
		validarCPF(pessoa.getCpf());
	}

	private void validarCPF(String cpf) {
		// TODO Auto-generated method stub
	}
	
}