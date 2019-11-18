package Chapter_1;

public class Fibonaci {

	public void fibonaci(int n) {

		int number1 = 1;
		int number2 = 1;
		int number3;
		for (int i = 1; i <= n; i++) {
			System.out.println(number1);
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonaci ob = new Fibonaci();
		ob.fibonaci(35);

	}

}
