package com.klu;

public class CompoundIntrest {
	public double calculateci(double p,double t,double roi,double n) {
		return p*Math.pow((1+(roi/n)),n*t);
	}
}
