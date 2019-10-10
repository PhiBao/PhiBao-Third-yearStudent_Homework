#include"List.h"
using namespace std;
bool ascending(double& left, double& right);
bool descending(double& left, double& right);
void Menu()
{
	cout << "_________________MENU_______________" << endl;
	cout << "1.Input objective list:" << endl;
	cout << "2.Add:" << endl;
	cout << "3.Update:" << endl;
	cout << "4.Delete:" << endl;
	cout << "5.Sort:" << endl;
	cout << "6.Search:" << endl;
	cout << "7.Show list:" << endl;
	cout << "8.Exit." << endl;
	cout << "_____________________________________" << endl;
}
int main()
{
	List Array(2);
	int choose;
	bool start = true;
	while (start)
	{
		Menu();
		cout << "Choose it:" << endl;
		cin >> choose;
		switch (choose)
		{
		case 1:
		{
			cout << "Input data:" << endl;
			cin >> Array;
			break;
		}
		case 2:
		{
			int i;
			cout << "Please enter the position of element add:" << endl;
			cout << " (1)-->Fisrt." << " (0)-->Last." << " (Other number)--> position k." << endl;
			cin >> i;
			(i == 0) ? Array.Add(Array.size + 1) : Array.Add(i);
			break;
		}
		case 3:
		{
			int i;
			cout << "Please enter the position of element update:" << endl;
			cout << "________" << 1 << "-->" << Array.size << "________" << endl;
			cin >> i;
			Array.Update(i);
			break;
		}
		case 4:
		{
			int i;
			cout << "Please enter the position of element delete:" << endl;
			cout << " (1)-->Fisrt." << " (0)-->Last." << " (Other number)--> position k." << endl;
			cin >> i;
			(i == 0) ? Array.Delete(Array.size) : Array.Delete(i);
			break;
		}
		case 5:
		{
			bool type;
			cout << "Choosen type of sort:" << endl;
			cout << " (0)-->Ascending." << " (1)-->Descending." << endl;
			cin >> type;
			(type == false) ? Array.quickSort(ascending) : Array.quickSort(descending);
			break;
		}
		case 6:
		{
			Array.linearSearch();
			break;
		}
		case 7:
		{
			Array.Show();
			break;
		}
		case 8:
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