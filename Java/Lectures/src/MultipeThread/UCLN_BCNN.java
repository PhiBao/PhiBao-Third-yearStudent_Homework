package MultipeThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UCLN_BCNN {

	public int nhapSo() throws IOException {
		InputStreamReader luongVao = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(luongVao);
		String s = bf.readLine();
		return Integer.parseInt(s);
	}

	public void calculating(int a, int b) {

		int temp = a * b;
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		System.out.println("Ước chung lớn nhất là: " + a);
		System.out.println("Bội chung nhỏ nhất là: " + (temp / a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UCLN_BCNN dt = new UCLN_BCNN();
		int a = 0, b = 0;
		try {
			do {
				System.out.println("Nhập 2 số nguyên dương: ");
				a = dt.nhapSo();
				b = dt.nhapSo();
			} while (a <= 0 || b <= 0);
		} catch (Exception e) {
		}
		System.out.println("Số đã nhập là: " + a + ", " + b);
		dt.calculating(a, b);
	}

}
