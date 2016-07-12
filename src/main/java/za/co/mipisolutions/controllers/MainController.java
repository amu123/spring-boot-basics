package za.co.mipisolutions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import za.co.mipisolutions.service.MainService;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by chrismipi on 2016/07/08.
 */
@Controller
public class MainController {
	private	MainService service;

	@Autowired
	public MainController(MainService service) {
		this.service = service;
	}

	@RequestMapping(value = "/home", method = GET)
	public String home(@RequestParam(value="x", required=false, defaultValue="0") String x,
	                   @RequestParam(value="y", required=false, defaultValue="0") String y,
			Model model) {

		String answer = service.compute(x, y);

		model.addAttribute("xValue", x);
		model.addAttribute("yValue", y);
		model.addAttribute("answer", answer);
		return "home";
	}
}
