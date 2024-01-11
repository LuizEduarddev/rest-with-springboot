package br.com.math;

public class OperationsValues {
	
	double n1;
	double n2;
	
	public OperationsValues(double n1) {
		this.n1 = n1;
	}
	
	public OperationsValues(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}
}
