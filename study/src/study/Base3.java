package study;

import java.util.Scanner;

public class Base3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ii=0;
		int rem=0;int sum=0;int sum12=0;int num=0;int rem1=0;int sum1=0;//int num1=0;	
		System.out.println("enter any number");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			rem=num%3;
			num=num/3;
			sum=sum*10+rem;	
			sum1=sum;
		}
		
		System.out.println(sum);
		for(ii=0;ii<=sum1;ii++)
		{
			rem1=sum1%10;   //100%10=0; 
			
			sum12=sum12*10+rem1;	//sum12=0;
			sum1=sum1/10;
			ii=0;//sum1=100/10=10
			System.out.print(sum12);
		}
		
		//System.out.println(sum12);
	}
}
