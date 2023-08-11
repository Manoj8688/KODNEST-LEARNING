package Studentgrading;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Score");
		int score = scan.nextInt();
		Grade S1 = new Grade();
		S1.grading(score);
		scan.close();
		}

}