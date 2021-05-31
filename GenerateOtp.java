package project;
import java.util.*;
public class GenerateOtp {
	  
	    static char[] OTP(int len)
	    {
	        System.out.println("Generating OTP using random() : ");
	        System.out.print("You OTP is : ");
	  
	        String numbers = "0123456789";
	  
	      
	        Random generate = new Random();
	  
	        char[] otp = new char[len];
	  
	        for (int i = 0; i < len; i++)
	        {
	           
	            otp[i] =
	             numbers.charAt(generate.nextInt(numbers.length()));
	        }
	        return otp;
	    }
	    public static void main(String[] args)
	    {
	        int length = 4;
	        System.out.println(OTP(length));
	    }
	}