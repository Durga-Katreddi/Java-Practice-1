package Lab01.Exercise03;

import java.util.Scanner;

public class FibonacciSeries {
	static int nFib(int n)
	{
		int a = 0, b = 1, c=0;
		if(n == 1)
		return 0;
		else if(n == 2)
		return 1;
		else
		{
			for(int i = 2; i < n; i++)
			{
				c = a+b;
				a = b;
				b = c;
			}
			return c;
		}
	}
	static int rFib(int n)
	{
		if(n == 1)
		return 0;
		else if(n == 2)
		return 1;
		else
		{
			return rFib(n-1)+rFib(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		int res1=nFib(n);
		int res2=rFib(n);
		System.out.println("Non Recursion: "+res1);
		System.out.println("Recursion: "+res2);
		
		
	}

}
