package MultipeThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNumber {

	public int nhapSo() throws IOException {
		InputStreamReader luongVao = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(luongVao);
		String s = bf.readLine();
		return Integer.parseInt(s);
	}

	public void tongCacChuSo(int m) {

		int S = 0, P = 1;
		while (m != 0) {
			S += m % 10;
			P *= m % 10;
			m /= 10;
		}
		System.out.println("Tổng các chữ số là: " + S);
		System.out.println("Tích các chữ số là: " + P);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputNumber dt = new InputNumber();
		int m = 0;
		try {
			do {
				System.out.println("Nhập một số nguyên dương: ");
				m = dt.nhapSo();
			} while (m <= 0);
		} catch (Exception e) {
		}
		System.out.println("Số đã nhập là: " + m);
		dt.tongCacChuSo(m);
	}

}
