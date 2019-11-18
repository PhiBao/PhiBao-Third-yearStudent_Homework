package Chapter_1;

public class PhuongTrinhBacNhat {

	public void giaiPTBN(int a, int b) {

		if (a == 0) {
			if (b == 0)
				System.out.println("Phuong trinh co vo so ngiem");
			else
				System.out.println("Phuong trinh vo nghiem");
		} else
			System.out.println("Phuong trinh co nghiem x = " + (float) (-b / a));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhuongTrinhBacNhat ob = new PhuongTrinhBacNhat();
		ob.giaiPTBN(0, 4);
		ob.giaiPTBN(0, 0);
		ob.giaiPTBN(6, 12);

	}

}
