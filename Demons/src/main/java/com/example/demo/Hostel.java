package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Hostel {
        private int rooms;
        
        public int getRooms() {
			return rooms;
		}
		public void setRooms(int rooms) {
			this.rooms = rooms;
		}
		public Hostel()
        {
                    System.out.println("Default Constructor");
        }
        public Hostel(int rooms )
        {
                    System.out.println("One Arg Constructor");
                    this.rooms=rooms;
        }
}


