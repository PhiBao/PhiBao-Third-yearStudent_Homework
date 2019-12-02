//this program active good in devC++, but have some error in Visual Studio 2019
#include<iostream>
#include<iomanip>
using namespace std;
void Input(int* pointer, int& n)
{
	cout << "Please enter value of element in array" << endl;
	for (int i = 0; i < n; i++)
	{
		cout << "Number " << (i + 1) << " : ";
		cin >> pointer[i];
	}
	cout << endl;
}
void Show(int* pointer, int& n)
{
	cout << "________________________________________________________________" << endl;
	cout << "A[] = {" << endl;
	for (int i = 0; i < n; i++)
		cout << pointer[i] << setw(5);
	cout << "\n}" << endl;
	cout << "________________________________________________________________" << endl;
}
//This function sometimes to be dangling pointer, I can't fix though I tried out for many way.
//Can't understand why it active quite good if n =4.
void Add(int* pointer, int& n, int& k)
{
	int* buffer = new int[n + 1];
	int temp;
	cout << "Input value of element add:" << endl;
	cin >> temp;
	for (int i = 0; i < k - 1; i++)
		buffer[i] = pointer[i];
	buffer[k - 1] = temp;
	for (int i = k; i < n + 1; i++)
		buffer[i] = pointer[i - 1];
	delete[] pointer;
	pointer = NULL;
	n++;
	pointer = new int[n];
	for (int i = 0; i < n; i++)
		pointer[i] = buffer[i];
	delete[] buffer;
	buffer = NULL;
}
//This function cause exception if n < k, sometimes n = k.
void Delete(int* pointer, int& n, int& k)
{
	int* buffer = new int[n - 1];
	for (int i = 0; i < k - 1; i++)
		buffer[i] = pointer[i];
	for (int i = k - 1; i < n - 1; i++)
		buffer[i] = pointer[i + 1];
	delete[] pointer;
	pointer = NULL;
	n--;
	pointer = new int[n];
	for (int i = 0; i < n; i++)
		pointer[i] = buffer[i];
	delete[] buffer;
	buffer = NULL;
}
void Swap(int& a, int& b)
{
	int temp;
	temp = a;
	a = b;
	b = temp;
}
bool ascending(int& left, int& right)
{
	return left >= right;
}
bool descending(int& left, int& right)
{
	return left <= right;
}
void quickSort(int* pointer, int& n, int left, int right, bool (*CmpFunc)(int&, int&))
{
	if (left >= right)
		return;

	int pivot = pointer[right];
	int i = left, j = right;

	while (i <= j) {
		while (!CmpFunc(pointer[i], pivot)) {
			i++;
		}

		while (!CmpFunc(pivot, pointer[j])) {
			j--;
		}

		if (i <= j) {
			if (i < j)
				Swap(pointer[i], pointer[j]);
			i++;
			j--;
		}
	}

	if (left < j)
		quickSort(pointer, n, left, j, CmpFunc);

	if (right > i)
		quickSort(pointer, n, i, right, CmpFunc);
}
void LinearSearch(int* pointer, int& n)
{
	int number, position;
	bool check = false;
	cout << "Please enter the number to be search : ";
	cin >> number;
	for (int i = 0; i < n; i++)
	{
		if (pointer[i] == number)
		{
			check = true;
			position = i + 1;
			break;
		}
	}
	if (check == false)
	{
		cout << "Can't found the number!" << endl;
	}
	else
	{
		cout << "A[" << position << "] = " << number << endl;
	}
}
void Update(int* pointer, int& n, int& k)
{
	int* buffer = new int[n];
	int temp;
	cout << "Input data of element update: ";
	cin >> temp;
	for (int i = 0; i < k - 1; i++)
		buffer[i] = pointer[i];
	buffer[k - 1] = temp;
	for (int i = k; i < n; i++)
		buffer[i] = pointer[i];
	delete[] pointer;
	pointer = NULL;
	pointer = new int[n];
	for (int i = 0; i < n; i++)
		pointer[i] = buffer[i];
	delete[] buffer;
	buffer = NULL;
}
void Menu()
{
	cout << "_________________MENU_______________" << endl;
	cout << "1.Input objective list:" << endl;
	cout << "2.Add:" << endl;
	cout << "3.Delete:" << endl;
	cout << "4.Sort:" << endl;
	cout << "5.Search:" << endl;
	cout << "6.Update:" << endl;
	cout << "7.Show list:" << endl;
	cout << "8.Exit." << endl;
	cout << "_____________________________________" << endl;
}
int main()
{
	int n = 0, k = 0;
	cout << "Please enter length of array: ";
	cin >> n;
	do {
		cout << "Please enter element k (k<=n): ";
		cin >> k;
	} while (k > n || k <= 0);
	int* A = new int[n];
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
			cout << "Input data:" << endl;
			Input(A, n);
			break;
		}
		case 2:
		{
			Add(A, n, k);
			Show(A, n);
			break;
		}
		case 3:
		{
			Delete(A, n, k);
			Show(A, n);
			break;
		}
		case 4:
		{
			bool type;
			cout << "Choosen type of sort:" << endl;
			cout << " (0)-->Ascending." << " (1)-->Descending." << endl;
			cin >> type;
			(type == false) ? quickSort(A, n, 0, n - 1, ascending) : quickSort(A, n, 0, n - 1, descending);
			Show(A, n);
			break;
		}
		case 5:
		{
			LinearSearch(A, n);
			break;
		}
		case 6:
		{
			Update(A, n, k);
			Show(A, n);
			break;
		}
		case 7:
		{
			Show(A, n);
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