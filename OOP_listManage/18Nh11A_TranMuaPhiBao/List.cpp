#include "List.h"

List::List()
{
	this->data = NULL;
	this->size = 0;
}

List::List(int size)
{
	this->size = size;
	this->data = new Phong[this->size];
}

List::List(const List& existList)
{
	this->size = existList.size;
	this->data = existList.data;
}

List::~List()
{
	delete[] this->data;
}

Phong& List::operator[](int i)
{
	Phong* temp = NULL;
	return (i > 0 && i <= this->size) ? *(this->data + (i - 1)) : *temp;
}

ostream& operator<<(ostream& o, const List& p)
{
	for (int i = 0; i < p.size; i++)
		cout << p.data[i] << endl;
	return o;
}

istream& operator>>(istream& i, List& p)
{
	for (int i = 0; i < p.size; i++)
		cin >> p.data[i];
	return i;
}

void List::Show()
{
	cout << "______________________________________________________________________" << endl;
	for (int i = 0; i < this->size; i++)
		cout << this->data[i] << endl;
	cout << "______________________________________________________________________" << endl;
}

void List::Add(const int& position)
{
	Phong* buffer = new Phong[this->size + 1];
	Phong temp;
	cout << "Input value of element add:" << endl;
	cin >> temp;
	for (int i = 0; i < position - 1; i++)
		buffer[i] = this->data[i];
	buffer[position - 1] = temp;
	for (int i = position; i < this->size + 1; i++)
		buffer[i] = this->data[i - 1];
	delete[] this->data;
	this->data = NULL;
	this->size++;
	this->data = new Phong[this->size];
	for (int i = 0; i < this->size; i++)
		this->data[i] = buffer[i];
	delete[] buffer;
	buffer = NULL;
}

void List::Update(const int& position)
{
	Phong* buffer = new Phong[this->size];
	Phong temp;
	cout << "Input data of element update: ";
	cin >> temp;
	for (int i = 0; i < position - 1; i++)
		buffer[i] = this->data[i];
	buffer[position - 1] = temp;
	for (int i = position; i < this->size; i++)
		buffer[i] = this->data[i];
	delete[] this->data;
	this->data = NULL;
	this->data = new Phong[this->size];
	for (int i = 0; i < this->size; i++)
		this->data[i] = buffer[i];
	delete[] buffer;
	buffer = NULL;
}

void List::Delete(const int& position)
{
	Phong* buffer = new Phong[this->size - 1];
	for (int i = 0; i < position - 1; i++)
		buffer[i] = this->data[i];
	for (int i = position - 1; i < this->size - 1; i++)
		buffer[i] = this->data[i + 1];
	delete[] this->data;
	this->data = NULL;
	this->size--;
	this->data = new Phong[this->size];
	for (int i = 0; i < this->size; i++)
		this->data[i] = buffer[i];
	delete[] buffer;
	buffer = NULL;
}

void List::Swap(Phong& a, Phong& b)
{
	Phong temp;
	temp = a;
	a = b;
	b = temp;
}

bool ascending(double& left, double& right)
{

	return left >= right;
}
bool descending(double& left, double& right)
{
	return left <= right;
}

void List::quickSort(bool(*CmpFunc)(double&, double&))
{
	int left = 0;
	int right = this->size - 1;
	if (left >= right)
		return;

	double pivot = this->data[right].priceRoom;
	int i = left, j = right;

	while (i <= j) {
		while (!CmpFunc(this->data[i].priceRoom, pivot)) {
			i++;
		}

		while (!CmpFunc(pivot, this->data[j].priceRoom)) {
			j--;
		}

		if (i <= j) {
			if (i < j)
				Swap(this->data[i], this->data[j]);
			i++;
			j--;
		}
	}

	if (left < j)
		quickSort(CmpFunc);

	if (right > i)
		quickSort(CmpFunc);

}

void List::linearSearch()
{
	int position;
	double priceRoom;
	bool check = false;
	cout << "Please enter the price room to be search : ";
	cin >> priceRoom;
	for (int i = 0; i < this->size; i++)
	{
		if (this->data[i].priceRoom == priceRoom)
		{
			check = true;
			position = i + 1;
			break;
		}
	}
	if (check == false)
	{
		cout << "Can't found the room!" << endl;
	}
	else
	{
		cout << this->data[position] << endl;
	}
}