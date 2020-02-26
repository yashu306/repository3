package com.klu;
import java.util.*;
import org.apache.log4j.Logger;

public class IntrestCalculation {
static final Logger logger=Logger.getLogger(IntrestCalculation.class);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose an option fron the below displayed menu:");
		System.out.println("\t\t\t\1.SimpleIntrest\t\t\t");
		System.out.println("\t\t\t\2.CompoundIntrest\t\t\t");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter the principle amount:");
			double principle=sc.nextDouble();
			System.out.println("Enter the period in years:");
			double time=sc.nextDouble();
			System.out.println("Enter the rate of intrest:");
			double rateofintrest=sc.nextDouble();
			SimpleIntrest si=new SimpleIntrest();
			System.out.println("the Simple intrest is:"+si.calculatesi(principle, time, rateofintrest));
			break;
		case 2:
			System.out.println("Enter the principle amount:");
			double p=sc.nextDouble();
			System.out.println("Enter the period in years:");
			double t=sc.nextDouble();
			System.out.println("Enter the rate of intrest:");
			double roi=sc.nextDouble();
			System.out.println("enter number of times intrest applied for time period:");
			double n1=sc.nextDouble();
			CompoundIntrest ci=new CompoundIntrest();
			System.out.println("the Simple intrest is:"+ci.calculateci(p, t, roi,n1));
			break;
			default:
				break;
		}
		// TODO Auto-generated method stub
		logger.debug("sample debug message");
		logger.info("sample info mesasge");
		logger.warn("sample warn message");
		logger.error("sampleerror message");
		logger.fatal("sample fatal message");
		sc.close();
	}
	
}
