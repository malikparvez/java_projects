package project;
import java.util.*;
public class Otp {

	public static long  number(){
	long number=(long)(Math.random()*9*Math.pow(10, 15)*Math.pow(10, 15));
	System.out.println();
	return number;
	}
	
	public static void main(String[] args) {
		
		String password="";
		long number=number();
		for(long num=number;num!=0;num/=100) {
			long temp = num%100;
			
			if(temp<=90) 
			temp=temp+32;	
			char ch=(char)temp;
			
			password=password + ch;
		}
	System.out.println(password);
	}	
}
