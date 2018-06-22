package com.thousandnameprintwithoutloop;

public class NamePrintWithoutLoop {
	public void print1(){
		System.out.println("Saurabh");
	}
	
	public void print3(){
		print1();
		print1();
		print1();
	}
	public void print10(){
		print3();
		print3();
		print3();
		print1();
	}
	public void print30(){
		print10(); print10(); print10();
	}
	public void print100(){
		print30(); print30(); print30(); print10();
	}
	public void print300(){
		print100(); print100(); print100();
	}
	public void print1000(){
		print300(); print300(); print300(); print100();
	}
	public static void main(String[] args){
		//NamePrintWithoutLoop nm = new NamePrintWithoutLoop();
		//nm.print1000();
		//System.out.println(String.format("%01000d", 0).replace("0", "Saurabh\n"));
		String s1 = "Saurabh\n";
		String s3 = s1 + s1 + s1;
		String s10 = s3 +  s3 +  s3 +s1;
		String s30 = s10 + s10 + s10;
		String s100 = s30 + s30 + s30 + s10;
		String s300 = s100 + s100 + s100;
		String s1000 = s300 + s300 + s300 + s100;
		System.out.println(s1000);
	}
}
