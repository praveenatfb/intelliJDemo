package com.core;

import java.util.Scanner;

public class ProfitOrLoss {

	public static void main(String[] args) {
		int cp,sp,profit,loss;
		Scanner s=new Scanner(System.in);
		System.out.println("enter cp and sp");
		cp=s.nextInt();
		sp=s.nextInt();
		System.out.println(sp+"\n"+cp);
		if(sp>cp) {
			profit=sp-cp;
		System.out.println("profit is:"+profit);
			}
			else {
				loss=cp-sp;
				System.out.println("loss is:"+loss);
			}
		
	}

}
