package MultipeThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputString {

	public String nhapChuoi() throws IOException {
		InputStreamReader luongVao = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(luongVao);
		String s = bf.readLine();
		return s;
	}

	public void daoChoi(String st) {

		String temp = "";
		char c;
		for (int i = st.length() - 1; i >= 0; i--) {
			c = st.charAt(i);
			temp += c;
		}
		System.out.println(temp);
	}

	public void chuoiHoa(String st) {

		String temp = "";
		char c;
		for (int i = 0; i <= st.length() - 1; i++) {
			c = st.charAt(i);
			if (c >= 97 && c <= 122)
				c -= 32;
			temp += c;
		}
		System.out.println(temp);
	}

	public void chuoiThuong(String st) {

		String temp = "";
		char c;
		for (int i = 0; i <= st.length() - 1; i++) {
			c = st.charAt(i);
			if (c >= 65 && c <= 90)
				c += 32;
			temp += c;
		}
		System.out.println(temp);
	}

	public void chuoiVuaHoaVuaThuong(String st) {

		String temp = "";
		char c;
		for (int i = 0; i <= st.length() - 1; i++) {
			c = st.charAt(i);
			if (c >= 97 && c <= 122)
				c -= 32;
			else if (c >= 65 && c <= 90)
				c += 32;
			temp += c;
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputString dt = new InputString();
		String st = "";
		try {
			do {
				System.out.println("Nhập một chuỗi: ");
				st = dt.nhapChuoi();
			} while (st == "");
		} catch (Exception e) {
		}
		System.out.println("Chuỗi đã nhập là: " + st);
		dt.chuoiHoa(st);
		dt.chuoiThuong(st);
		dt.chuoiVuaHoaVuaThuong(st);
	}

}
