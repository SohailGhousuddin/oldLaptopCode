package com.example.demo;

public class Room {
	
	private int roomNumber;
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Room()
	{
		System.out.println("From default constructor of room");
	}
	
	public Room(int roomNo)
	{
		System.out.println("From one arg constructor of room");
		this.roomNumber=roomNo;
	}
	
	

}
