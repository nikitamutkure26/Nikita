package com.shortingalgo;

public class Selectionsort {
	public static void main(String[] args) {
		int[] a= {9,1,0,3,5,2,4};
		sort(a);
		for(int n:a) {
			System.out.println(n);
		}
	}
	public static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[index]>a[j]) {
					index=j;
				}
			}
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
		}
	}

}
