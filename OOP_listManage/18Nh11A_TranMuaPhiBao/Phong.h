#pragma once
#include<iostream>
#include<string>
#include"Date.h"
using namespace std;
class Phong
{
public:
	string roomCode;
	int maxResident;
	bool status;
	Date receivedDate;
	Date payDate;
	double priceRoom;

public:
	Phong();
	Phong(string, int, bool, Date, Date, double);
	Phong(const Phong&);
	~Phong();
	friend ostream& operator<<(ostream&, const Phong&);
	friend istream& operator>>(istream&, Phong&);
};

