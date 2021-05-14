package com.t2s.sistemaportuariot2s.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.t2s.sistemaportuariot2s.model.Movimentacao;
import com.t2s.sistemaportuariot2s.service.MovimentacaoService;

@Controller
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

	@Autowired
	private MovimentacaoService service;

	// GET

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getMovimentacoes() {
		ModelAndView modelview = new ModelAndView("movimentacoes");
		List<Movimentacao> movimentacoes = service.findAll();
		modelview.addObject("movimentacoes", movimentacoes);
		return modelview;
	}

	// POST

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getFormMovimentacao(Model model) {
		model.addAttribute("movimentacao", new Movimentacao());
		return "addmovimentacao";
	}

	@PostMapping(value = "/add")
	public String addMovimentacao(Movimentacao movimentacao, Model model) {
		model.addAttribute("movimentacao", movimentacao);
		service.create(movimentacao);
		return "movimentacaoadicionado";
	}

	// PUT

	@RequestMapping(value = "/att/{id}", method = RequestMethod.GET)
	public ModelAndView attMovimentacao(@PathVariable Long id) {
		ModelAndView modelview = new ModelAndView("attmovimentacao");
		Movimentacao mantigo = service.findById(id);
		modelview.addObject("mantigo", mantigo);
		return modelview;
	}

	@PostMapping(value = "/att/{id}")
	public String attMovimentacao(Movimentacao movimentacao, Model model) {
		model.addAttribute("movimentacao", movimentacao);
		service.update(movimentacao);
		return "movimentacaoatualizado";
	}

	// DELETE

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public String deleteMovimentacao(@PathVariable Long id) {
		service.delete(id);
		return "redirect:/movimentacoes";
	}

}