package Chapter_1;

public class PhuongTrinhBacHai {

	public void giaiPTBN(int a, int b) {

		if (a == 0) {
			if (b == 0)
				System.out.println("Phuong trinh co vo so ngiem");
			else
				System.out.println("Phuong trinh vo nghiem");
		} else
			System.out.println("Phuong trinh co nghiem x = " + (float) (-b / a));

	}

	public void giaiPTBH(int a, int b, int c) {

		float delta = b * b - 4 * a * c;
		if (a == 0)
			giaiPTBN(b, c);
		else if (delta < 0)
			System.out.println("Phuong trinh vo ngiem");
		else if (delta == 0)
			System.out.println("Phuong trinh co nghiem kep x = " + (-b / 2 * a));
		else {
			System.out.println("Phuong trinh co 2 ngiem:");
			System.out.println("x1 = " + (((-b) + Math.sqrt(delta)) / (2 * a)));
			System.out.println("x2 = " + (((-b) - Math.sqrt(delta)) / (2 * a)));

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhuongTrinhBacHai ob = new PhuongTrinhBacHai();
		ob.giaiPTBH(3, -6, 9);
		ob.giaiPTBH(1, -2, -3);
	}

}
