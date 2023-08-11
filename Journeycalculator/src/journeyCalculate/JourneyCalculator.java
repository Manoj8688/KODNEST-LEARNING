package journeyCalculate;

import java.util.Scanner;

public class JourneyCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter speed and time taken");
		double speed = scan.nextDouble();
		double time = scan.nextDouble();
		JourneycalculatorApp j1 = new JourneycalculatorApp();
		System.out.println(j1.calculateDistance(speed,time));
		
	}
	
	

}
