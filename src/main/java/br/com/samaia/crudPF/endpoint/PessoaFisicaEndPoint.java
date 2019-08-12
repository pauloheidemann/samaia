package br.com.samaia.crudPF.endpoint;

import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.samaia.crudPF.bean.PessoaFisica;
import br.com.samaia.crudPF.interfaces.IPessoaFisicaService;

@RestController
@RequestMapping("/ws")
public class PessoaFisicaEndPoint {
	
	@Autowired
	private IPessoaFisicaService service;
	
	@GetMapping("healthCheck")
	Response healthCheck() {
		return Response.ok().build();
	}

	@GetMapping(value = "/pessoa/{idPessoaFisica}", produces = "application/json")
	PessoaFisica consultarPessoaFisicaPorId(@PathVariable long idPessoaFisica) {
		try {
			return service.consultarPessoaFisica(idPessoaFisica);
		} catch (Exception e) {
			return null;
		}
	}
	
	@GetMapping(value = "/pessoa", produces = "application/json")
	List<PessoaFisica> consultarPessoaFisica() {
		try {
			return service.consultarTodasPessoasFisicas();
		} catch (Exception e) {
			return null;
		}
	}
	
	@PostMapping(value= "/pessoa", consumes = "application/json")
	Response inserirPessoaFisica(@RequestBody PessoaFisica pessoaFisica) {
		try {
			service.salvar(pessoaFisica);
			return Response.status(Status.CREATED).entity(pessoaFisica.getId()).build();
		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
	@PutMapping(value= "/pessoa", consumes = "application/json", produces = "application/json")
	Response atualizarPessoaFisica(PessoaFisica pessoaFisica) {
		try {
			service.salvar(pessoaFisica);
			return Response.status(Status.CREATED).entity(pessoaFisica.getId()).build();
		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
	@DeleteMapping(value= "/pessoa/{idPessoaFisica}", consumes = "application/json")
	Response removerPessoaFisica(@PathVariable long idPessoaFisica) {
		try {
			PessoaFisica pessoaFisica = service.consultarPessoaFisica(idPessoaFisica);
			service.remover(pessoaFisica);
			return Response.status(Status.CREATED).entity(pessoaFisica.getId()).build();
		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
}