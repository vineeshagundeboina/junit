package com.demo;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo {

	public static void main(String[] args) {
		String str = "99999";
		String str2 = "99";		
		String result = getSumOfTwoString(str,str2);
		System.out.println("Addition of two big numbers "+str +" "+str2+" "+result);
	}
	private static String getSumOfTwoString(String str, String str2) {
		StringBuilder result = new StringBuilder();
		int len1 = str.length()-1;
		int len2 = str2.length()-1;
		int carry = 0;	
		while(len1>=0||len2>=0||carry>0) {
			int number1 = len1>=0?str.charAt(len1)-'0':0;
			int number2 = len2>=0?str2.charAt(len2)-'0':0;
			int sum  = number1+number2+carry;
			result.append(sum%10);
			carry = sum/10;
			len1--;
			len2--;		
		}
		return result.reverse().toString();
	}

}
