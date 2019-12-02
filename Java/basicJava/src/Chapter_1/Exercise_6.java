package Chapter_1;

public class Exercise_6 {

	public void exercise_6(int n) {

		float S = 0;
		for (int i = 1; i <= n; i++)
			S += (float) 1 / i;
		System.out.println("Ket qua bang: " + S);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise_6 ob = new Exercise_6();
		ob.exercise_6(69);

	}

}
