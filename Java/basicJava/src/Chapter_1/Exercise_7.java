package Chapter_1;

public class Exercise_7 {

	public void exercise_7(int n) {

		float S = 15;
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
			if (i % 2 == 0)
				S += (float) 1 / factorial;
			else
				S -= (float) 1 / factorial;
		}
		System.out.println("Ket qua bang: " + S);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise_7 ob = new Exercise_7();
		ob.exercise_7(20);

	}

}
