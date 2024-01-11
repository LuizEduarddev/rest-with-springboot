package br.com.math;

import br.com.exceptions.UnsupportedMathOperationException;

public class Operations extends OperationsValues
{
	public Operations(double n1) {
		super(n1);
	}
	
	public Operations(double n1, double n2) {
		super(n1, n2);
	}

	public double soma(double n1, double n2) {
		return n1 + n2;
	}
	
	public double sub(double n1, double n2) {
		return n1 - n2;
	}
	
	public double mult(double n1, double n2) {
		return n1 * n2;
	}
	
	public double div(double n1, double n2) {
		if (n2 == 0) {
			throw new UnsupportedMathOperationException("Impossível dividir com 0");
		}
		else {
			return n1 / n2;
		}
	}
	
	public double media(double n1, double n2) {
		if (n1 == 0 && n2 == 0) {
			return 0;
		}
		else {
			return (n1 + n2) / 2;
		}
	}
	
	public double raiz(double n) {
		return Math.sqrt(n);
	}
}
