package br.com.samaia.crudPF.endpoint;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/pessoa/{idPessoaFisica}")
	Response consultarPessoaFisicaPorId(@PathVariable long idPessoaFisica) {
		try {
			PessoaFisica pessoaFisica = service.consultarPessoaFisica(idPessoaFisica);
			return Response.ok(pessoaFisica).build();
		} catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}
	
	
}