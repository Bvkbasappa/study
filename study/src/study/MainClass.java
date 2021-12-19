package study;

import java.util.Arrays;

public class MainClass {
	public static void main(String args[])
	{
		int[] intarr= {1,5,15,9};
		Arrays.sort(intarr);
		System.out.println(Arrays.toString(intarr));
		Emp[] emparr=new Emp[4];
		emparr[0]=new Emp(1, "A");
		emparr[1]=new Emp(5, "AB");
		emparr[2]=new Emp(15, "AA");
		emparr[3]=new Emp(9, "BC");
		Arrays.sort(emparr,Emp.nameemp);
		System.out.println("Default sorting of Emp List"+Arrays.toString(emparr));
	}
	

}
