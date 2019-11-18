package Chapter_1;

public class SoHoanHao {

	public boolean checkSHH(int number) {

		int S = 0;
		for (int i = 1; i <= number / 2; i++)
			if (number % i == 0)
				S += i;
		if (S == number)
			return true;
		else
			return false;
	}

	public void exercise_15() {

		for (int i = 1; i < 1000; i++)
			if (checkSHH(i) == true)
				System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoHoanHao ob = new SoHoanHao();
		ob.exercise_15();

	}

}
