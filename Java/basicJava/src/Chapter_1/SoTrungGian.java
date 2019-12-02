package Chapter_1;

public class SoTrungGian {

	public void timSTG(int a, int b, int c) {

		int max = (a > b && a > c) ? a : ((b > c) ? b : c);
		int min = (a < b && a < c) ? a : ((b < c) ? b : c);
		int mid = a + b + c - max - min;
		System.out.println("So trung gian la: " + mid);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoTrungGian ob = new SoTrungGian();
		ob.timSTG(3, 6, 9);

	}

}
