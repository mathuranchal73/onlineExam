package com.ose.controllers;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String codes[]= {"XROD", "EGPT", "QAUC", "SMZI", "6JLB", "9KWV"};
			
			
			
		 String UUID="";
			for(int i=0;i<5;i++)
			{
				
				int rand= new Random().nextInt(codes.length);
			UUID= UUID+"-"+codes[rand];
			}
			
			System.out.println(UUID);

	}

}
