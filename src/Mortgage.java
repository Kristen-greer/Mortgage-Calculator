import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {
		System.out.print("WHat is your principle");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		String userInput = input;
		double principle= Double.parseDouble(userInput);
		
		
		System.out.print("What is your annual interest");
		String userInterest=scanner.next();
		double realAnnual = Double.parseDouble(userInterest);
		double monthly= ((realAnnual/100)/12);
		
		System.out.println("what is the period");
		String userPeriod = scanner.next();
		double period = Double.parseDouble(userPeriod);
		double monthlyPeriod=(period*12);
		
		//calculate Mortgage
		
		double onePlus = Math.pow((1+monthly), monthlyPeriod);
		double top = monthly*onePlus;
		double bottom = onePlus-1;
		double division = top/bottom;
		double mortgage = principle*division;
		
		NumberFormat morty= NumberFormat.getCurrencyInstance();
		String finalMortgage = morty.format(mortgage);
		
		System.out.println(finalMortgage);
		
		
		
		
	}

}
