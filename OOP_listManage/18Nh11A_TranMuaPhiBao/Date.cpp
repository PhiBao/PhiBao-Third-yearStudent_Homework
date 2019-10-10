#include "Date.h"

Date::Date()
{
	this->day = 29;
	this->month = 2;
	this->year = 2020;
}

Date::Date(int day, int month, int year)
{
	this->day = day;
	this->month = month;
	this->year = year;
}

Date::Date(const Date& existDate)
{
	this->day = existDate.day;
	this->month = existDate.month;
	this->year = existDate.year;
}

Date::~Date()
{}

bool operator>(const Date& dateOne, const Date& dateTwo)
{
	if (dateOne.year > dateTwo.year) return true;
	else if (dateOne.year == dateTwo.year) {
		if (dateOne.month > dateTwo.month) return true;
		else if (dateOne.month == dateTwo.month) {
			if (dateOne.day > dateTwo.day) return true; 
			else return false;
		}
		else return false;
	}
	else return false;
}

ostream& operator<<(ostream& o, const Date& p)
{
	o << p.day << "/" << p.month << "/" << p.year;
	return o;
}

istream& operator>>(istream& i, Date& p)
{
	cout << "Ngay : "; do (i >> p.day); while (p.day > 31);
	cout << "Thang : "; do (i >> p.month); while (p.month > 12);
	cout << "Nam : "; do (i >> p.year); while (p.year < 1950 || p.year > 2020);
	return i;
}