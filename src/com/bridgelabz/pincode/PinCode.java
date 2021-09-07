package com.bridgelabz.pincode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PinCode 
{
	
	static String pinCodePattern="[0-9]{3}[ ]?[0-9]{3}$";
	
	public static void vaildatePinCode(String pincode)
	{
		
		Pattern pattern = Pattern.compile(pinCodePattern);
		Matcher matcher = pattern.matcher(pincode);
		boolean matchFound = matcher.find();

		if(matchFound) 
		{
			System.out.println("Pin Code "+pincode+" is  valid");
		} 
		else
		{
			System.out.println("Pin Code "+pincode+" is not valid");
		}
		
		
	}

	public static void main(String[] args) 
	{
		System.out.println("welcome to pincode problem");
		
		vaildatePinCode("400088");
		vaildatePinCode("A40088");
		vaildatePinCode("400088B");
		vaildatePinCode("400 088");
		
		
		
		

	}

}
