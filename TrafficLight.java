package Lab01.exercise02;

import java.util.Scanner;

public class TrafficLight {
	public static void trafficLight(String color)
	{
		if(color.equalsIgnoreCase("red"))
		{
			System.out.println("Stop");
		}
		else if(color.equalsIgnoreCase("Yellow"))
		{
			System.out.println("Ready");
		}
		else if(color.equalsIgnoreCase("green"))
		{
			System.out.println("Go ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String color=sc.nextLine();
		trafficLight(color);
	}

}
