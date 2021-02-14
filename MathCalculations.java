import java.util.Arrays;

public class mathCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//The average temperature from Feb,14 to Feb 20 in Fahrenheit
		double []fList = {37,36,43,37,35,43,34};
		System.out.println("Fahrenheit to Celsius\n");
		for(int i = 0; i < fList.length; i++) {
			System.out.format("%.0fF is %.2fC\n", + fList[i], FtoC(fList[i]));
		}
		System.out.println("\nCelsius back to Fahrenheit\n");
		for(int i = 0; i < fList.length; i++) {
			System.out.format("%.2fC is %.0fF\n", + FtoC(fList[i]), CtoF(FtoC(fList[i])));
		}
		int[]randomNum = new int[30];//random temperature for 30 day
		System.out.println("\nFahrenheit to Celsius\n");
		for(int i = 0; i < randomNum.length; i++) {
			randomNum[i] = (int) getRandom(30,40);
			System.out.format("%dF is %5.2fC\n", + randomNum[i],(FtoC(randomNum[i])));
		}
		System.out.println("\nCelsius back to Fahrenheit\n");
		for(int i = 0; i < randomNum.length; i++) {
			System.out.format("%5.2fC is %.0fF\n", + (FtoC(randomNum[i])), CtoF(FtoC(randomNum[i])));
		}
		
	}
	public static double FtoC(double List1) {
		//Fahrenheit to Celsius Formula
		double c = ((List1 - 32)*5)/9;
		return c;
	}
	public static double CtoF(double List2) {
		//Celsius to Fahrenheit Formula
		double f = (9 * (List2 / 5) + 32);
		return f;
	}
	public static int getRandom(int max, int min) {
		return (int) (((Math.random()*(max - min))) + min);
	}
}
