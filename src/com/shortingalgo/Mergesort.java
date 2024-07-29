package com.shortingalgo;

public class Mergesort {
	public static void main(String[] args) {
		int[] a= {9,1,0,3};
		sort(a);
	}
	public static void sort(int[] a) {
		int[] left=new int[a.length/2];
		int[] right =new int[a.length-left.length];
		System.arraycopy(a,0,left,0,left.length);
		System.arraycopy(a,left.length,right,0,right.length);
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	public static void merge(int[] a,int[] b,int[] c) {
		
	}

}
