package com.hznu.problem;

import java.awt.event.InputEvent;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hznu.exceptions.BinaryFormatException;
import com.hznu.exceptions.HexFormatException;

public class Main {
	static class User{
		
	}
	public static void main(String[] args){
		/*
		 12.6
		 
		Scanner input=new Scanner(System.in);
		String hex=input.nextLine();
		System.out.println(hex+"转换后为 "+hexToDecimal(hex.toUpperCase()));
		*/
		
		/*
		 12.7
		
		Scanner input=new Scanner(System.in);
		String bin=input.nextLine();
		try {
			System.out.println(bin2Dec(bin));
		} catch (BinaryFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 */
		
		
		/*
		 12.8
		 同12.6
		 */
		
		
		/*
		 12.9
		 同12.7
		 */
		
		/*
		 12.10
		 */
		List <User>list=new ArrayList<User>();
		int i=0;
		while(true) {
			list.add(new User());
			System.out.println(i++);
		}
		
		
	}
	public static int bin2Dec(String bin) throws BinaryFormatException {
		int res=0;
		for(int i=bin.length()-1;i>=0;i--) {
			
			if(bin.charAt(i)=='1'||bin.charAt(i)=='0'){
				res+=(bin.charAt(i)-'0')*Math.pow(2,(bin.length()-(i+1)));
		}
			else {
//		12.7		throw new NumberFormatException("请输入二进制数");
			//12.9
				throw new BinaryFormatException("请输入二进制数");
			}
		}
		return res;
	}
	
    
	public static int hexToDecimal(String hex) {
	int decimalValue=0;
	for(int i=0;i<hex.length();i++) {
		char hexChar=hex.charAt(i);
		try {
			decimalValue=decimalValue*16+hexCharToDecimal(hexChar);
		} catch (HexFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return decimalValue;
}
    
    public static int hexCharToDecimal(char ch) throws HexFormatException {
	if(ch>='A'&&ch<='F') {
		return 10+ch-'A';
	}
	else if(ch<'9'&&ch>'0'){
	return ch-'0';
	}
	else {
		//12.6
//		throw new NumberFormatException("请输入十六进制的数");
		//12.7
		throw new HexFormatException("请输入十六进制的数");
	}
		
	
}

}
