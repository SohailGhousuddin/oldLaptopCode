package com.PDF.Artifacts;

import org.springframework.stereotype.Service;

@Service
public class InputMap {
	public String getName() {
		return Name;
	}

	public InputMap()
	{}
	public InputMap(String name, String address) {
		super();
		Name = name;
		Address = address;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	private String Name;
	private String Address;

}
