package com.search;

public class linearSearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]a= {"tapan","rocky","arun","babu","sagar"};
		String find="gudu";int temp=0;
		for (int i=0;i<a.length;i++) {
			if(a[i].equals(find)) {
				System.out.println(("item is "+i+"possition"));
				temp=temp+1;
			}
		}
            if (temp==0) {
            	System.out.println(("sry brother he/she is not here"));
            }
	}

}
