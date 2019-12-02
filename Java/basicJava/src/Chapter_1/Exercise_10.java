package Chapter_1;

public class Exercise_10 {

	public void exercise_10(int m) {

		int S = 0, P = 1;
		while (m > 0) {
			S += m % 10;
			P *= m % 10;
			m = m / 10;
		}
		System.out.println("Tong cac chu so la " + S);
		System.out.println("Tich cac cho so la " + P);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise_10 ob = new Exercise_10();
		ob.exercise_10(999);

	}

}
