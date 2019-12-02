#pragma once
#include"Phong.h"
class List
{
public:
	Phong* data;
	int size;

public:
	List();
	List(int);
	List(const List&);
	~List();
	Phong& operator[](int);
	friend ostream& operator<<(ostream&, const List&);
	friend istream& operator>>(istream&, List&);
	void Show();
	void Add(const int&);
	void Update(const int&);
	void Delete(const int&);
	void Swap(Phong&, Phong&);
	void quickSort(bool(*)(double&, double&));
	void linearSearch();
};