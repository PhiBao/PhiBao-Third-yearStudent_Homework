package Chapter_1;

public class NgayTuongUng {

	public void ngayTuongUng(int month, int year) {

		switch (month) {

		case 4: {
			System.out.println("So ngay tuong ung la 30");
			break;
		}

		case 6: {
			System.out.println("So ngay tuong ung la 30");
			break;
		}
		case 9: {
			System.out.println("So ngay tuong ung la 30");
			break;
		}
		case 11: {
			System.out.println("So ngay tuong ung la 30");
			break;
		}
		case 2: {
			int days = 28;
			if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0))
				days++;
			System.out.println("So ngay tuong ung la " + days);
			break;
		}
		default: {
			System.out.println("So ngay tuong ung la 31");
			break;
		}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NgayTuongUng ob = new NgayTuongUng();
		ob.ngayTuongUng(2, 2000);
		ob.ngayTuongUng(2, 1999);
		ob.ngayTuongUng(11, 2019);

	}

}
