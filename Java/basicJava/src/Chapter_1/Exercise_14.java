package Chapter_1;

public class Exercise_14 {

	public boolean checkSNT(int number) {

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void exercise_14(int n) {

		for (int i = 2; i <= n; i++)
			if (checkSNT(i))
				System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise_14 ob = new Exercise_14();
		ob.exercise_14(69);

	}

}
