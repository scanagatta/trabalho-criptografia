package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;

@Controller
@Path("/index")
public class IndexController {

	@Get("/index")
	public void index() {

	}

	@Post("/criptografar")
	public void criptografar(String texto1) {

	}

	@Post("/descriptografar")
	public void descriptografar(String texto2) {

	}
}