#include "MyString.h"

void Menu()
{
	cout << "_________________MENU_______________" << endl;
	cout << "1.Ghi xau:" << endl;
	cout << "2.Noi xau:" << endl;
	cout << "3.So sanh bang:" << endl;
	cout << "4.So sanh lon/be:" << endl;
	cout << "5.Lay ky tu nam trong xau:" << endl;
	cout << "6.Doc xau:" << endl;
	cout << "7.Thoat." << endl;
	cout << "_____________________________________" << endl;
}
int main()
{
	//Tao xau rong
	MyString chain1;
	//Tao xau tu char*
	MyString chain2("Perfect");
	//Tao xau tu ham dung sao chep
	MyString chain3(chain2);
	int choose;
	bool start = true;
	while (start)
	{
		Menu();
		cout << "Choose: ";
		cin >> choose;
		switch (choose)
		{
		case 1:
		{
			cout << "Ghi xau 1:" << endl;
			cin >> chain1;
			break;
		}
		case 2:
		{
			chain3 = chain1 + chain2;
			cout << "Ket qua: " << chain3 << endl;
			break;
		}
		case 3:
		{
			MyString temp;
			cout << "Ghi xau de so sanh: ";
			cin >> temp;
			bool type;
			cout << "0. =" << endl;
			cout << "1. !=" << endl;
			cout << "Chon loai so sanh: "; cin >> type;
			if (type == 0)
			{
				cout << ((temp == chain3) ? "Ket qua dung!" : "Ket qua sai!") << endl;
			}
			else 
			{
				cout << ((temp != chain3) ? "Ket qua dung!" : "Ket qua sai!") << endl;
			}
			break;
		}
		case 4:
		{
			MyString temp;
			cout << "Ghi xau de so sanh: ";
			cin >> temp;
			int type;
			cout << "1. >" << endl;
			cout << "2. >=" << endl;
			cout << "3. <" << endl;
			cout << "4. <=" << endl;
			cout << "Chon loai so sanh: "; cin >> type;
			switch (type)
			{
			case 1:
			{
				cout << ((temp > chain3) ? "Ket qua dung!" : "Ket qua sai!") << endl;
				break;
			}
			case 2:
			{
				cout << ((temp >= chain3) ? "Ket qua dung!" : "Ket qua sai!") << endl;
				break;
			}
			case 3:
			{
				cout << ((temp < chain3) ? "Ket qua dung!" : "Ket qua sai!") << endl;
				break;
			}
			case 4:
			{
				cout << ((temp <= chain3) ? "Ket qua dung!" : "Ket qua sai!") << endl;
				break;
			}
			default:
			{
				cout << "Chon kieu khong dung!" << endl;
				break;
			}
			}
		break;
		}
		case 5:
		{
			int position = 0;
			cout << "Chon vi tri can lay ky tu: 0 -> " << chain3.length() - 1 << endl;
			cin >> position;
			if (position >= 0 && position <= chain3.length() - 1)
				cout << "Ky tu lay duoc: " << chain3[position] << endl;
			else cout << "Vi tri nhap vao khong hop le!" << endl;
			break;
		}
		case 6:
		{
			cout << chain3 << endl;
			break;
		}
		case 7:
		{
			exit(0);
		}
		default:
			start = false;
			break;
		}
	}
	system("pause");
	return 0;
}