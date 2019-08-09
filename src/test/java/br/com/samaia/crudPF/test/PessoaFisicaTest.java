package br.com.samaia.crudPF.test;

import java.time.LocalDate;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.samaia.crudPF.Configurator;
import br.com.samaia.crudPF.bean.PessoaFisica;
import br.com.samaia.crudPF.interfaces.IPessoaFisicaService;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.profiles.active=test", classes = Configurator.class)
@TestPropertySource(locations = "classpath:application-test.properties")
public class PessoaFisicaTest {

	private PessoaFisica pessoaFisica;

	@Autowired
	private IPessoaFisicaService service;
	
	@Before
	public void init() {
		pessoaFisica = new PessoaFisica();
	}

	@Test
	public void salvar() {
		try {
			mockPessoaFisica();
			service.salvar(pessoaFisica);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void atualizar() {
		try {
			pessoaFisica = service.consultarPessoaFisica(1L);
			service.atualizar(pessoaFisica);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void remover() {
		try {
			mockPessoaFisica();
			service.salvar(pessoaFisica);
			service.remover(pessoaFisica);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void consultarPorId() {
		try {
			pessoaFisica = service.consultarPessoaFisica(1L);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void consultarTodos() {
		try {
			List<PessoaFisica> pessoasFisicas = service.consultarTodasPessoasFisicas();
			if(pessoasFisicas.isEmpty())
				Assert.fail("Não retornou todas as pessoas físicas");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void consultarIdInvalido() throws Exception {
		service.consultarPessoaFisica(9999999999L);
	}

	private void mockPessoaFisica() {
		pessoaFisica.setCpf("05577477913");
		pessoaFisica.setDataNascimento(LocalDate.now());
		pessoaFisica.setEmail("paulo.heidemann@gmail.com");
		pessoaFisica.setNome("Paulo Henrique Heidemann");
	}

}