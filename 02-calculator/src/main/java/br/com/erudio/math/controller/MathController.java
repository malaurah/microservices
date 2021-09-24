package br.com.erudio.math.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.math.services.MathServices;

@RestController
public class MathController {
	
	@Autowired
	private MathServices services;
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}",method=RequestMethod.GET)	
	public Double sum(@PathVariable("numberOne") String numberOne, 
			@PathVariable("numberTwo") String numberTwo) throws Exception {

		return services.sum(numberOne,numberTwo);
	}
	
	@RequestMapping(value="/sub/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double sub(@PathVariable("numberOne") String numberOne, 
			@PathVariable("numberTwo") String numberTwo) throws Exception {
		
		return services.sub(numberOne,numberTwo);
	}
	
	@RequestMapping(value="/mul/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double mul(@PathVariable("numberOne") String numberOne, 
			@PathVariable("numberTwo") String numberTwo) throws Exception {
			
		return services.mul(numberOne,numberTwo);
	}
	
	@RequestMapping(value="/div/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double div(@PathVariable("numberOne") String numberOne, 
			@PathVariable("numberTwo") String numberTwo) throws Exception {
			
		return services.div(numberOne,numberTwo);
	}

	@RequestMapping(value="/media/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double media(@PathVariable("numberOne") String numberOne, 
			@PathVariable("numberTwo") String numberTwo) throws Exception {
			
		return services.media(numberOne,numberTwo);
	}
	
	@RequestMapping(value="/raiz/{number}",method=RequestMethod.GET)
	public Double raiz(@PathVariable("number") String number) throws Exception {
			
		return services.raiz(number);
	}

}
