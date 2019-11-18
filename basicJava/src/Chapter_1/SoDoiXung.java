package Chapter_1;

public class SoDoiXung {

	public void checkSDX(int M) {

		int number = M;
		int temp = 0;
		while (M != 0) {
			temp = (temp * 10) + (M % 10);
			M /= 10;
		}
		if (temp == number)
			System.out.println("So nhap vao la so doi xung!");
		else
			System.out.println("So nhap vao khong phai la so doi xung!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoDoiXung ob = new SoDoiXung();
		ob.checkSDX(696);

	}

}
