package com.t2s.sistemaportuariot2s.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerApp {

	// HOME

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelview = new ModelAndView("index");
		return modelview;
	}

	// SOBRE

	@RequestMapping(value = "/sobre", method = RequestMethod.GET)
	public ModelAndView sobre() {
		ModelAndView modelview = new ModelAndView("sobre");
		return modelview;
	}

}
