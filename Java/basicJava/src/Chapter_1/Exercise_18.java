package Chapter_1;

public class Exercise_18 {

	public void exercise_18(int a, int b) {

		int temp = a * b;
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		System.out.println("Uoc chung lon nhat la " + a);
		System.out.println("Boi chung nho nhat la " + (temp / a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise_18 ob = new Exercise_18();
		ob.exercise_18(12, 18);

	}

}
