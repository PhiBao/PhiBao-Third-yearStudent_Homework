#include "Phong.h"

Phong::Phong()
{
	this->roomCode = "7999";
	this->maxResident = 3;
	this->status = true;
	this->receivedDate = Date(6, 6, 2019);
	this->payDate = Date(20, 6, 2019);
	this->priceRoom = 1500000;
}

Phong::Phong(string roomCode, int maxResident, bool status, Date recievedDate, Date payDate, double priceRoom)
{
	this->roomCode = roomCode;
	this->maxResident = maxResident;
	this->status = status;
	this->receivedDate = recievedDate;
	this->payDate = payDate;
	this->priceRoom = priceRoom;
}

Phong::Phong(const Phong& existPhong)
{
	this->roomCode = existPhong.roomCode;
	this->maxResident = existPhong.maxResident;
	this->status = existPhong.status;
	this->receivedDate = existPhong.receivedDate;
	this->payDate = existPhong.payDate;
	this->priceRoom = existPhong.priceRoom;
}

Phong::~Phong()
{}

bool Check_roomCode(string roomCode)
{
	if (roomCode.length() != 4) return false;
	if ((roomCode[0] < '1') || (roomCode[0] > '7')) return false;
	for (int i = 1; i < roomCode.length(); i++)
	{
		if ((roomCode[i] < '0') || (roomCode[i] > '9')) return false;
	}
	return true;
}

ostream& operator<<(ostream& o, const Phong& room)
{
	o << "Ma phong: " << room.roomCode << endl;
	o << "So nguoi luu tru toi da: " << room.maxResident << endl;
	o << "Tinh trang: " << ((room.status == true) ? "dang co nguoi thue" : "trong") << endl;
	o << "Ngay nhan phong: " << room.receivedDate << endl;
	o << "Ngay tra phong: " << room.payDate << endl;
	o << "Gia phong: " << room.priceRoom << endl;
	return o;
}

istream& operator>>(istream& i, Phong& room)
{
	do {
		cout << "Ma phong:";
		i >> room.roomCode;
	} while (!Check_roomCode(room.roomCode));

	do {
		cout << "So nguoi luu tru toi da: ";
		i >> room.maxResident;
	} while (room.maxResident < 1 || room.maxResident > 4);
	cout << "Tinh trang( 1-Dang co nguoi thue, 0-trong ): "; i >> room.status;
	if (room.status == true) {
		room.receivedDate = Date(NULL, NULL, NULL);
		room.payDate = Date(NULL, NULL, NULL);
	} else {
		cout << "Ngay nhan phong: "; i >> room.receivedDate;
		do {
			cout << "Ngay tra phong: ";
			i >> room.payDate;
		} while (room.receivedDate > room.payDate);
	}
	cout << "Gia phong: "; i >> room.priceRoom;
	return i;
}