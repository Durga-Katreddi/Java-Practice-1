package Lab01.exercise04;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		for(int i=1; i <= num; i++){

            boolean isPrime = true;

            //check to see if the number is prime
            for(int j=2; j <= i/2 ; j++){

                    if(i % j == 0){
                            isPrime = false;
                            break;
                    }
            }
            // print the number
            if(isPrime)
                    System.out.println(i);
    }
	}

}
