package br.com.samaia.crudPF.interfaces;

import java.util.List;
import br.com.samaia.crudPF.bean.PessoaFisica;

/**
 * 
 * @author Paulo Henrique Heidemann
 *
 */
public interface IPessoaFisicaService {
	
	/**
	 * 
	 * @param pessoa
	 * @throws Exception
	 */
	public void salvar(PessoaFisica pessoa) throws Exception ;
	
	/**
	 * 
	 * @param pessoa
	 * @throws Exception
	 */
	public void atualizar(PessoaFisica pessoa) throws Exception;
	
	/**
	 * 
	 * @param pessoa
	 */
	public void remover(PessoaFisica pessoa) throws Exception;
	
	/**
	 * 
	 * @param idPessoaFisica
	 * @return
	 */
	public PessoaFisica consultarPessoaFisica(Long idPessoaFisica) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception 
	 */
	public List<PessoaFisica> consultarTodasPessoasFisicas() throws Exception;

}
