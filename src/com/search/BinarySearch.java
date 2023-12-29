package com.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int []a= {2,3,5,6,8,12,15,16,18};
		int find =2;
		int li=0;
		int hi =a.length-1;
		int mi=(li+hi)/2;
	       while (li<=hi) {

		if (a[mi]==find)
		{
			System.out.println("the index possition is  "+mi);
			break;
		}
		else if(a[mi]<find) {
			li=mi+1;
		}
		else  {
			hi=mi-1;
		}
			mi=(hi+li)/2;
		
       
		
		if (li>hi)
		{
			System.out.println("sry bro element is not found");
		}		      }
		
}

}
