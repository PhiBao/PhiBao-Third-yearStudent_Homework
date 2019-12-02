package Chapter_1;

public class CheckFibonaci {

	public boolean checkFibonaci(int number) {

		if (number == 0)
			return true;
		if (number == 1)
			return true;
		int temp1 = 1;
		int temp2 = 1;
		int temp3;
		do {
			temp3 = temp1 + temp2;
			temp1 = temp2;
			temp2 = temp3;
			if (temp2 == number)
				return true;
		} while (temp2 < number);
		return false;
	}

	public void exercise_17(int number) {

		if (checkFibonaci(number) == true)
			System.out.println("So nhap vao thuoc day Fibonaci");
		else
			System.out.println("So nhap vao khong thuoc day Fibonaci");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckFibonaci ob = new CheckFibonaci();
		ob.exercise_17(69);
		ob.exercise_17(89);

	}

}
