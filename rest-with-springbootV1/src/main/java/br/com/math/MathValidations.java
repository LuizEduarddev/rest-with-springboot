package br.com.math;

import br.com.exceptions.UnsupportedMathOperationException;

public class MathValidations 
{
	public double validate (String path, String n1, String n2) {
		if (path == null || n1 == null) {
			throw new NullPointerException();
		}
		
		if (n2 == null) {
			if (!isNumeric(n1)) {
				throw new UnsupportedMathOperationException("Por favor, nao insira um valor diferente de numérico");
			}
			else {				
				return tryPath(path, n1);
			}
		} else {
			if (!isNumeric(n1) || !isNumeric(n2)) {
				throw new UnsupportedMathOperationException("Por favor, nao insira um valor diferente de numérico");
			} else {
				return tryPath(path, n1, n2);
			}
		}

	}
	
	private double tryPath(String path, String n1) {
		
		if (path.equals("raiz")) {
			Operations operation = new Operations(objectToDouble(n1));
			return operation.raiz(operation.getN1());
		}
		
		else if (path.equals("soma")) {
			throw new UnsupportedMathOperationException("Operacao nao suportada com apenas um operador");
		}

		else if (path.equals("sub")) {
			throw new UnsupportedMathOperationException("Operacao nao suportada com apenas um operador");
		}
		
		else if (path.equals("mult")) {
			throw new UnsupportedMathOperationException("Operacao nao suportada com apenas um operador");
		}
		
		else if (path.equals("div")) {
			throw new UnsupportedMathOperationException("Operacao nao suportada com apenas um operador");
		}
		
		else if (path.equals("media")) {
			throw new UnsupportedMathOperationException("Operacao nao suportada com apenas um operador");
		}

		else {
			throw new UnsupportedMathOperationException("Coloque uma operacao valida");
		}
	}

	
	private double tryPath(String path, String n1, String n2) {
		if (path.equals("soma")) {
			Operations operation = new Operations(objectToDouble(n1), objectToDouble(n2));
			return operation.soma(operation.getN1(), operation.getN2());
		}

		else if (path.equals("sub")) {
			Operations operation = new Operations(objectToDouble(n1), objectToDouble(n2));
			return operation.sub(operation.getN1(), operation.getN2());
		}
		
		else if (path.equals("mult")) {
			Operations operation = new Operations(objectToDouble(n1), objectToDouble(n2));
			return operation.mult(operation.getN1(), operation.getN2());
		}
		
		else if (path.equals("div")) {
			Operations operation = new Operations(objectToDouble(n1), objectToDouble(n2));
			return operation.div(operation.getN1(), operation.getN2());
		}
		
		else if (path.equals("media")) {
			Operations operation = new Operations(objectToDouble(n1), objectToDouble(n2));
			return operation.media(operation.getN1(), operation.getN2());
		}
		
		else if (path.equals("raiz")) {
			throw new UnsupportedMathOperationException("Operacao nao suportada com dois operadores");
		}
		
		else {
			throw new UnsupportedMathOperationException("Coloque uma operacao valida");
		}
	}
	
	private double objectToDouble(String strNumber) {
		strNumber = strNumber.replace(",", ".");
		return Double.parseDouble(strNumber);
	}
	
	
	private boolean isNumeric(String validate) {
		try {
			if (validate == null) {
				return false;
			}
			validate = validate.replace(",", ".");
			double numero = Double.parseDouble(validate);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
