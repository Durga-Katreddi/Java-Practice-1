package Lab01.Exercise01;

import java.util.Scanner;

public class SumOfCubes {
	public static int sumOfCubes(int number)//since it is static no need to create object in main
	{
		int sum=0,rem;
		while(number>0)
		{
			rem=number%10;
			sum=sum+(rem*rem*rem);
			number=number/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int result = sumOfCubes(n);//since method is static no object needed to call
		System.out.println("Result: "+result);
	}

}
