package Chapter_1;

public class SoChinhPhuong {

	public void checkSCP(int P) {

		int i = 1;
		while (i * i <= P) {
			if (i * i == P) {
				System.out.println("So nhap vao la so chinh phuong!");
				return;
			}
			i++;
		}
		System.out.println("So nhap vao khong phai la so chinh phuong!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoChinhPhuong ob = new SoChinhPhuong();
		ob.checkSCP(9);
		ob.checkSCP(35);

	}

}
