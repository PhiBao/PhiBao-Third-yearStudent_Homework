#include "MyString.h"

MyString::MyString()
{
	this->data = new char[0];
	this->size = 0;
}

int getSize(const char* data)
{
	int size = 0;
	while (data[size] != NULL)
	{
		size++;
	}
	return size;
}

MyString::MyString(const char* data)
{
	this->size = getSize(data);
	this->data = new char[this->size];
	for (int i = 0; i < this->size; i++)
		this->data[i] = data[i];
}

MyString::MyString(const MyString& data)
{
	this->size = data.size;
	this->data = new char[this->size];
	for (int i = 0; i < this->size; i++)
		this->data[i] = data.data[i];
}

MyString::~MyString()
{
	/*if (this->data != NULL)
	{
		delete[] this->data;
		this->data = NULL;
	}*/
}

int MyString::length()
{
	return this->size;
}

MyString MyString::operator+(const MyString& myString)
{
	MyString temp;
	temp.size = this->size + myString.size;
	temp.data = new char[temp.size];
	for (int i = 0; i < this->size; i++)
		temp.data[i] = this->data[i];
	for (int i = 0; i < myString.size; i++)
		temp.data[this->size + i] = myString.data[i];
	return temp;
}

MyString MyString::operator&(const MyString& myString)
{
	return (*(this) + myString);
}

void MyString::operator=(const MyString& myString)
{
	this->size = myString.size;
	this->data = new char[this->size];
	for (int i = 0; i < this->size; i++)
		this->data[i] = myString.data[i];
}

bool MyString::operator==(const MyString& myString)
{
	if (this->size != myString.size) return false;
	for (int i = 0; i < this->size; i++)
		if (this->data[i] != myString.data[i])
			return false;
	return true;
}

bool MyString::operator!=(const MyString& myString)
{
	return !(*(this) == myString);
}

bool MyString::operator>(const MyString& myString)
{
	for (int i = 0; i < ((this->size <= myString.size) ? this->size : myString.size); i++)
	{
		if (this->data[i] > myString.data[i])
			return true;
		if (this->data[i] < myString.data[i])
			return false;
	}
	if (this->size > myString.size) return true;
	else return false;
}

bool MyString::operator>=(const MyString& myString)
{
	return !(*(this) < myString);
}

bool MyString::operator<(const MyString& myString)
{
	for (int i = 0; i < ((this->size <= myString.size) ? this->size : myString.size); i++)
	{
		if (this->data[i] < myString.data[i])
			return true;
		if (this->data[i] > myString.data[i])
			return false;
	}
	if (this->size < myString.size) return true;
	else return false;
}

bool MyString::operator<=(const MyString& myString)
{
	return !(*(this) > myString);
}

char& MyString::operator[] (int position)
{
	char* temp = NULL;
	return ((position >= 0 && position < this->size) ? this->data[position] : *temp);
}

istream& operator>> (istream& i, MyString& myString)
{
	i >> myString.data;
	myString.size = getSize(myString.data);
	return i;
}

ostream& operator<< (ostream& o, const MyString& myString)
{
	for (int i = 0; i < myString.size; i++)
		o << myString.data[i];
	return o;
}
