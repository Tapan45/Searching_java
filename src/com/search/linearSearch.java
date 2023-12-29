package com.search;

public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {5,3,7,8,3,2};
		int find=9;int temp=0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]==find)
			{
				System.out.println("item is present at"+i+"index possition");
				temp=temp+1;
			}
//			if (temp==0) {
//				System.out.println("item is not found in list");
			}
			if (temp==0) {
				System.out.println("item is not found in list");
		}

	}

}
