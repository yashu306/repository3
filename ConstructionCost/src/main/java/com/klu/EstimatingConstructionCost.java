package com.klu;
import java.util.*;
import org.apache.log4j.Logger;

public class EstimatingConstructionCost {
static final Logger logger=Logger.getLogger(EstimatingConstructionCost.class);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*let the rating of standard material be 100-cost per square feet is 1200
		  and the rating of above standard material be 200-cost per square feet is 1500
		  and the rating of highly standard material be 300-cost per square feet is 1800
		  and the rating of higly standard material with fully auomated be 400-cost per square feet is 2500*/
		System.out.println("Enter the type of material required to construct the house:");
		int rating=sc.nextInt();
		System.out.println("Enter total area of the house:");
        int area=sc.nextInt();
		System.out.println("Enter the type of house you want:");
		String s1=sc.next()+sc.nextLine();
		HouseCost hc=new HouseCost();
		int m=hc.calculatehc(rating,area,s1);
		System.out.println("the estimated cost of the house:"+m);
		// TODO Auto-generated method stub
		logger.debug("sample debug message");
		logger.info("sample info mesasge");
		logger.warn("sample warn message");
		logger.error("sampleerror message");
		logger.fatal("sample fatal message");
		sc.close();
	}

}
