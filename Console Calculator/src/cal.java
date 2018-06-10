import java.util.Scanner;

/*
 * One of my first program written in Java
 * 
 * Michał Ciołek 2018
 */

public class cal {

	public static void main(String[] args)  {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Kalkulator obsługuje operacje na liczbach stało oraz zmiennoprzecinkowych.");
		System.out.println();
		
		System.out.print("Wprowadz pierwszą liczbe: ");
		
		double firstNum = input.nextDouble();
		
		System.out.print("Wprowadz drógą liczbe: ");

		double secondNum = input.nextDouble();
		
		System.out.println();
		System.out.println("Podaj numer operacji:");
		System.out.println("Dodawanie = 1");
		System.out.println("Odejmowanie = 2");
		System.out.println("Mnożenie = 3");
		System.out.println("Dzielenie = 4");
		
		int operation = input.nextInt();
		
		System.out.println();
		
		switch(operation) {
		case 1:
			System.out.print("Wynik dodawania: ");
			System.out.print(firstNum + secondNum);
			break;
		case 2:
			System.out.print("Wynik odejmowania: ");
			System.out.print(firstNum - secondNum);
			break;
		case 3:
			System.out.print("Wynik monożenia: ");
			System.out.print(firstNum * secondNum);
			break;
		case 4:
			System.out.print("Wynik dzielenia: ");
			System.out.print(firstNum / secondNum);
			break;
		default:
			System.out.print("Nie obsługiwana operacja!");
		
		}
	}
}
