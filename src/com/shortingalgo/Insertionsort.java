package com.shortingalgo;

public class Insertionsort {
	public static void main(String[] args) {
		int[] a= {9,1,0,3};
		sort(a);
		for(int n:a) {
			System.out.println(n);
		}
	}
	public static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int pivot=a[i];
			int j=i-1;
			while(j>=0 && a[j]>pivot) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=pivot;
		}
	}

}
