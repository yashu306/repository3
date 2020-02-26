package com.klu;

public class HouseCost {
	int x;
	public int calculatehc(int r,int a,String s1) {
		if(s1.equalsIgnoreCase("fully automated")&&r==400) {
			x=2500*a;
		}
		else {
			if(r==100) {
				x=1200*a;
			}
			else if(x==100) {
				x=1500*a;
			}
			else {
				x=1800*a;
			}
		}
		return x;
	}
	}