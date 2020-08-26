import java.util.Scanner;

public class Operations {

	Scanner input = new Scanner(System.in);
	int calOperation;
	double firstNum;
	double secondNum;

	public void setfirstNum() {

		firstNum = input.nextDouble();
	}

	public void setsecondNum() {

		secondNum = input.nextDouble();

	}

	public void setcalOperation() {

		calOperation = input.nextInt();

	}

	public void showfirstNum() {

		System.out.println(firstNum);

	}

	public void showsecondNum() {

		System.out.println(secondNum);

	}

	public void showcalOperation() {

		System.out.println(calOperation);

	}

	public void addition() {

		double addScore = firstNum + secondNum;
		System.out.println(addScore);
	}

	public void subtraction() {

		double subScore = firstNum - secondNum;
		System.out.println(subScore);
	}

	public void multiplication() {

		double multiScore = firstNum * secondNum;
		System.out.println(multiScore);
	}

	public void division() {

		double divScore = firstNum / secondNum;
		System.out.println(divScore);
	}

}