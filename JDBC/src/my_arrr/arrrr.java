package my_arrr;

import java.util.Scanner;
public class arrrr{

	public static void main(String args[])

		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the size");
			int size = sc.nextInt();

			int[] arrr = new int[size];

			System.out.println("Enter "+size+" numbers");
			
			for (int i = 0; i<=arrr.length; i++) {
				
				System.out.print("Element " + (i + 1) + ": ");
				arrr[i] = sc.nextInt();
			}	

		}

}