package com.arraysandfunctions;

public class AssignAndPrint {
	public static void main(String[] args) {
		int a[]= {1,2,37,45,66,80,100,100};
		int sum=0;
		//for
		for(int i=0;i<a.length;i++) {
			//if(a[i]%2==0)
				sum=sum+a[i];
		//		System.out.println(a[i]+" ");
		}
		System.out.println(sum);
		//for each
		System.out.println("\n");
		sum=0;
		for(int v:a) {
			//if(v%2==0)
				sum=sum+v;
				//System.out.println(v+" ");
		}
		System.out.println(sum);
		float avg=sum/(a.length);
		System.out.println("avg: "+avg);
		//elements greater than avg
		for(int i=0;i<a.length;i++) {
			if(a[i]>avg)
				System.out.println(a[i]);
		}
	
	}

}
