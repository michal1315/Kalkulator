/*
 * One of my first program written in Java
 * 
 * Michał Ciołek 2018 - 2019
 */

public class cal {

	public static void main(String[] args) {

		Operations operation = new Operations();
		Lang pl = new Lang();

		pl.showWelcome();

		pl.showtypefirstNum();
		operation.setfirstNum();
		// operation.showfirstNum();
		pl.showtypesecondNum();
		operation.setsecondNum();
		// operation.showsecondNum();

		pl.showtypeOperation();
		// "There are no answers only choices."
		operation.setcalOperation();
		// operation.showcalOperation();
		int calOperation;
		calOperation = operation.calOperation;

		switch (calOperation) {

		case 1:
			pl.showtextadditionScore();
			operation.addition();
			break;

		case 2:
			pl.showtextsubtractionScore();
			operation.subtraction();
			break;

		case 3:
			pl.showtextmultiplicationScore();
			operation.multiplication();
			break;

		case 4:
			pl.showtextdivisionScore();
			operation.division();
			break;

		default:
			pl.showtextunavailableOperation();

		}

	}
}
