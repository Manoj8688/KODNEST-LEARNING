package doubletrouble;

import java.util.Scanner;

public class doubleTheNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to double");
		int num1 = scan.nextInt();
		int res = doublenumber(num1);
		System.out.println(res);
		scan.close();
		
	}
	public static int doublenumber(int num)
	{
		return num*2;
	}

}
