package Chapter_1;

public class SoNguyenTo {

	public void checkSNT(int number) {

		boolean check = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				check = false;
				break;
			}
		}
		if (check == true)
			System.out.println("So nhap vao la so nguyen to!");
		else
			System.out.println("So nhap vao khong phai la so nguyen to!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoNguyenTo ob = new SoNguyenTo();
		ob.checkSNT(11);
		ob.checkSNT(69);

	}

}
