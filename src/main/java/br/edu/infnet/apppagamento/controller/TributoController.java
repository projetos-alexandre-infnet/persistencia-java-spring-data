package br.edu.infnet.apppagamento.controller;

import br.edu.infnet.apppagamento.model.domain.Tributo;
import br.edu.infnet.apppagamento.model.domain.Usuario;
import br.edu.infnet.apppagamento.model.service.TributoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class TributoController {

	private TributoService service;

	public TributoController(TributoService service) {
		this.service = service;
	}

	@GetMapping(value = "/tributo/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", service.obterLista(usuario));
		return "tributo/lista";
	}

	@GetMapping(value = "/tributo")
	public String telaCadastro() {
		return "tributo/cadastro";
	}
	
	@PostMapping(value = "/tributo/incluir")
	public String incluir(Tributo tributo, @SessionAttribute("user") Usuario usuario) {
		tributo.setUsuario(usuario);
		service.incluir(tributo);
		return "redirect:/tributo/lista";
	}
	
	@GetMapping(value = "/tributo/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		service.excluir(id);
		return "redirect:/tributo/lista";
	}
}
