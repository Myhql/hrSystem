package com.hr.test;

import org.junit.Test;

public class TestClass {

	@Test
	public void test() {
		for(int i=0; i<5; ){
			i++;
			System.out.print(i);
		}
		System.out.println("");
		for(int i=0; i<5; ){
			++i;
			System.out.print(i);
		}
	}
	
	@Test
	public void test2() {
		int t1 = "abc".length();
		int[] a = new int[3];
		a[1] = 1;
		int t2 = a.length;
		char c = 17;
	}
	
	@Test
	public void test3(){
		String a = null;
		System.out.println(a.length());
	}
	
	@Test
	public void test4(){
		int a = 2;
		
	}

	final int  i = 5 ;
	
	public int a(final int i){
		return i;
	}

}
