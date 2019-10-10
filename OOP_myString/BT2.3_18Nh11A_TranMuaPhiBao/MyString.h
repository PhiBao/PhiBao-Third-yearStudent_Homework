#pragma once
#include<iostream>
using namespace std;

class MyString
{

private:

	char* data;
	int size;

public:

	MyString();
	MyString(const char*);
	MyString(const MyString&);
	~MyString();

	int length();
	MyString operator+ (const MyString&);
	MyString operator& (const MyString&);
	void operator= (const MyString&);
	bool operator== (const MyString&);
	bool operator!= (const MyString&);
	bool operator> (const MyString&);
	bool operator>= (const MyString&);
	bool operator< (const MyString&);
	bool operator<= (const MyString&);
	char& operator[] (int);
	friend istream& operator>> (istream&, MyString&);
	friend ostream& operator<< (ostream&, const MyString&);
};

