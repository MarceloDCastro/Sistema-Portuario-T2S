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

import com.t2s.sistemaportuariot2s.model.Container;
import com.t2s.sistemaportuariot2s.service.ContainerService;

@Controller
@RequestMapping("/containers")
public class ContainerController {

	@Autowired
	private ContainerService service;

	// GET

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getContainers() {
		ModelAndView modelview = new ModelAndView("containers");
		List<Container> containers = service.findAll();
		modelview.addObject("containers", containers);
		return modelview;
	}

	// POST

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getFormContainer(Model model) {
		model.addAttribute("container", new Container());
		return "addcontainer";
	}

	@PostMapping(value = "/add")
	public String addContainer(Container container, Model model) {
		model.addAttribute("container", container);
		service.create(container);
		return "containeradicionado";
	}

	// PUT

	@RequestMapping(value = "/att/{id}", method = RequestMethod.GET)
	public ModelAndView attContainer(@PathVariable Long id) {
		ModelAndView modelview = new ModelAndView("attcontainer");
		Container cantigo = service.findById(id);
		modelview.addObject("cantigo", cantigo);
		return modelview;
	}

	@PostMapping(value = "/att/{id}")
	public String attContainer(Container container, Model model) {
		model.addAttribute("container", container);
		service.update(container);
		return "containeratualizado";
	}

	// DELETE

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public String deleteContainer(@PathVariable Long id) {
		service.delete(id);
		return "redirect:/containers";
	}

}