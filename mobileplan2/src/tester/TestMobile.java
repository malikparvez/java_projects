package tester;
import java.util.*;

import mobileplan.MobilePlan;

public class TestMobile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean quit=false;
		while(!quit) {
		MobilePlan.menu();
		
		switch (sc.nextInt()) {
		case 1:
			System.out.println("Enter No of calls, No of sms");
			MobilePlan p1= new MobilePlan('A',1,1,199,sc.nextInt(),sc.nextInt());
			System.out.println(p1);
			p1.callsBill();
			p1.smsBill();
			System.out.println("");
			p1.netBill();
			break;

		case 2:
			System.out.println("Enter No of calls, No of sms");
			p1= new MobilePlan('B',0.8,0.75,299,sc.nextInt(),sc.nextInt());
			System.out.println(p1);
			p1.callsBill();
			p1.smsBill();
			System.out.println("");
			p1.netBill();
			break;	
			
		case 3:
			System.out.println("Enter No of calls, No of sms");
			p1= new MobilePlan('c',0.6,0.50,299,sc.nextInt(),sc.nextInt());
			System.out.println(p1);
			p1.callsBill();
			p1.smsBill();
			System.out.println("");
			p1.netBill();
			break;	
			
		case 4:
			quit=true;
		
			break;	
	
		default:
			System.out.println("Please enter a valid choice");
			break;
		}
		
	
		
		}	
		
		
sc.close();
	}

}
