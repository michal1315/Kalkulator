
public class Lang {

	
	String welcome = "Kalkulator obsługuje operacje na liczbach stało oraz zmiennoprzecinkowych.";
	String typefirstNum = "Wprowadz pierwszą liczbe: ";
	String typesecondNum = "Wprowadz drugą liczbe: ";
	String typeOperation = "Podaj numer operacji: \nDodawanie = 1\nOdejmowanie = 2\nMnożenie = 3\nDzielenie = 4";
	String textadditionScore = "Wynik dodawania: ";
	String textsubtractionScore = "Wynik odejmowania: ";
	String textmultiplicationScore = "Wynik mnożenia: ";
	String textdivisionScore = "Wynik dzielenia: ";
	String textunavailableOperation = "Nie obsługiwana operacja!";

	
	public void showWelcome() {

		System.out.println(welcome);
		System.out.println();

	}

	public void showtypefirstNum() {

		System.out.print(typefirstNum);

	}

	public void showtypesecondNum() {

		System.out.print(typesecondNum);

	}

	public void showtypeOperation() {
		System.out.println();
		System.out.print(typeOperation);
		System.out.println();

	}

	public void showtextadditionScore() {
		System.out.println();
		System.out.print(textadditionScore);

	}

	public void showtextsubtractionScore() {
		System.out.println();
		System.out.print(textsubtractionScore);

	}

	public void showtextmultiplicationScore() {
		System.out.println();
		System.out.print(textmultiplicationScore);

	}

	public void showtextdivisionScore() {
		System.out.println();
		System.out.print(textdivisionScore);

	}

	public void showtextunavailableOperation() {
		System.out.println();
		System.out.print(textunavailableOperation);

	}

}