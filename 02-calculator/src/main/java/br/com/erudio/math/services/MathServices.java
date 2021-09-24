package br.com.erudio.math.services;

import org.springframework.stereotype.Service;

import br.com.erudio.math.exception.UnsuportedMathOperationException;
import br.com.erudio.math.request.converters.NumberConverter;

@Service
public class MathServices {
	
	public Double sum(String one, String two) throws Exception {		
		if(!NumberConverter.isNumeric(one) || !NumberConverter.isNumeric(two)) {
			throw new UnsuportedMathOperationException("Por favor, utilize um valor numérico!");
		}
		Double sum = NumberConverter.convertToDouble(one) + NumberConverter.convertToDouble(two);
		return sum;	
	}
	
	public Double sub(String one, String two) throws Exception {		
		if(!NumberConverter.isNumeric(one) || !NumberConverter.isNumeric(two)) {
			throw new UnsuportedMathOperationException("Por favor, utilize um valor numérico!");
		}
		Double sub = NumberConverter.convertToDouble(one) - NumberConverter.convertToDouble(two);
		return sub;		
	}
	
	public Double mul(String one, String two) throws Exception {		
		if(!NumberConverter.isNumeric(one) || !NumberConverter.isNumeric(two)) {
			throw new UnsuportedMathOperationException("Por favor, utilize um valor numérico!");
		}
		Double mul = NumberConverter.convertToDouble(one) * NumberConverter.convertToDouble(two);
		return mul;		
	}
	
	public Double div(String one, String two) throws Exception {		
		if(!NumberConverter.isNumeric(one) || !NumberConverter.isNumeric(two)) {
			throw new UnsuportedMathOperationException("Por favor, utilize um valor numérico!");
		}else if(NumberConverter.convertToDouble(two) == 0.0){
			throw new UnsuportedMathOperationException("O divisor não pode ser zero!");
		}
		Double div = NumberConverter.convertToDouble(one) / NumberConverter.convertToDouble(two);
		return div;		
	}
	
	public Double media(String one, String two) throws Exception {		
		if(!NumberConverter.isNumeric(one) || !NumberConverter.isNumeric(two)) {
			throw new UnsuportedMathOperationException("Por favor, utilize um valor numérico!");
		}
		Double media = (NumberConverter.convertToDouble(one) + NumberConverter.convertToDouble(two)) / 2;
		return media;	
	}

	public Double raiz(String one) throws Exception {		
		if(!NumberConverter.isNumeric(one)) {
			throw new UnsuportedMathOperationException("Por favor, utilize um valor numérico!");
		}
		Double raiz = Math.sqrt(NumberConverter.convertToDouble(one));
		return raiz;	
	}
}
