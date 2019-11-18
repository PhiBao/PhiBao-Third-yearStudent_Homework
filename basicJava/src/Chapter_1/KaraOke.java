package Chapter_1;

public class KaraOke {

	public void payKaraoke(int a, int b) {

		double hours = b - a + 1;
		if (hours < 18)
			System.out.println("So tinh thanh toan la: " + (int) hours * 45000 + "VND");
		else
			System.out.println("So tinh thanh toan la: " + (int) hours * 60000 + "VND");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KaraOke ob = new KaraOke();
		ob.payKaraoke(1, 20);
		ob.payKaraoke(20, 22);

	}

}
