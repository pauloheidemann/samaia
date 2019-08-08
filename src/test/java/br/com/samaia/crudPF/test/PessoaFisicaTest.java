package br.com.samaia.crudPF.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.samaia.crudPF.Configurator;
import br.com.samaia.crudPF.bean.PessoaFisica;
import br.com.samaia.crudPF.interfaces.IPessoaFisicaService;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.profiles.active=test", classes = Configurator.class)
@ComponentScan("br.com.dorcas")
@TestPropertySource(locations = "classpath:application-test.properties")
public class PessoaFisicaTest {

	@Autowired
	private PessoaFisica pessoaFisica;
	
	@Autowired
	private IPessoaFisicaService service;
	
	@Test
	public void salvar() {
		
	}
	
	@Test
	public void atualizar() {
		
	}
	
	@Test
	public void remover() {
		
	}
	
	@Test
	public void consultarPorId() {
		
	}
	
	@Test
	public void consultarTodos() {
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void consultarIdInvalido() {
		
	}
	
}