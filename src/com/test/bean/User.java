package com.test.bean;

import lombok.Getter;
import lombok.Setter;

public class User {
	@Getter@Setter
	private String userName;
	@Getter@Setter
	private String password;

	@Override
	public String toString() {
		return "User{" +
				"userName='" + userName + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
