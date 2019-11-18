package Chapter_1;

public class Exercise_9 {

	public void exercise_9(int n) {

		long S = 1;
		while (n > 0) {
			S *= n;
			n -= 2;
		}
		System.out.println("Ket qua bang: " + S);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise_9 ob = new Exercise_9();
		ob.exercise_9(20);

	}

}
