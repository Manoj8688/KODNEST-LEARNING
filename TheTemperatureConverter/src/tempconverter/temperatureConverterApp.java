package tempconverter;

import java.util.Scanner;

public class temperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter body temperature in fahreinheit");
		double f1 =scan.nextDouble();
		temperatureConverter fahreinheit = new temperatureConverter();
		System.out.println(fahreinheit.convertFahrenheitToCelsius(f1));
		scan.close();
		
	}

}
