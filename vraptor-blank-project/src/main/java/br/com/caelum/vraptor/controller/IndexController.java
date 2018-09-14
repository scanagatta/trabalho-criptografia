package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import model.CifraCesar;
import model.CifraVigenere;
import model.Criptografia;

@Controller
@Path("/index")
public class IndexController {

	CifraCesar cifraCesar = new CifraCesar();

	@Inject
	private Result result;

	@Get("/index")
	public void index() {

	}

	@Post("/criptografar")
	public void criptografar(Criptografia criptografia) {
		switch (criptografia.getTipo()) {
		case 1:
			result.include("textoCriptografado", cifraCesar.cifrarCesar(criptografia));
			result.include("texto1", criptografia.getTexto1());
			result.redirectTo(this).index();
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:
			CifraVigenere cv = new CifraVigenere(criptografia.getTexto1(), criptografia.getChave());
			result.include("textoCriptografado", cv.cifrar());
			result.include("chave", criptografia.getChave());
			result.include("texto1", criptografia.getTexto1());
			result.include("criptografia", criptografia);
			result.redirectTo(this).index();
			break;
		default:
			break;
		}
	}

	@Post("/descriptografar")
	public void descriptografar(Criptografia criptografia) {
		switch (criptografia.getTipo()) {
		case 1:
			result.include("textoDescriptografado", cifraCesar.descifrarCesar(criptografia));
			result.include("texto2", criptografia.getTexto2());
			result.redirectTo(this).index();
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:
			CifraVigenere cv = new CifraVigenere(criptografia.getTexto2(), criptografia.getChave());
			result.include("textoDescriptografado", cv.decifrar());
			result.include("chave", criptografia.getChave());
			result.include("texto2", criptografia.getTexto2());
			result.include("criptografia", criptografia);
			result.redirectTo(this).index();
			break;
		default:
			break;
		}
	}
}