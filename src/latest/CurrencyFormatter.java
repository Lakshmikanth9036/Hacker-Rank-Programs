package latest;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double currency = in.nextDouble();
		Locale indiaLocale = new Locale("en", "IN");
		
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		System.out.println("US: " + us.format(currency));
		System.out.println("India: " + india.format(currency));
		System.out.println("China: " + china.format(currency));
		System.out.println("France: " + france.format(currency));
		in.close();
	}
}
