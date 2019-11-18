package Chapter_1;

public class Exercise_8 {

	public void exercise_8(int n) {

		float S = 1;
		long factorial = 1;
		for (int i = 3; i < 2 * n; i += 2) {
			factorial *= i * (i - 1);
			S += (float) 1 / factorial;
		}
		System.out.println("Ket qua bang: " + S);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise_8 ob = new Exercise_8();
		ob.exercise_8(20);

	}

}
