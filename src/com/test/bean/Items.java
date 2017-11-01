package com.test.bean;

import lombok.Getter;
import lombok.Setter;

public class Items {
	@Setter@Getter
	private String name;
	@Setter@Getter
	private double price;
	@Setter@Getter
	private String detail;

	@Override
	public String toString() {
		return "Items{" +
				"name='" + name + '\'' +
				", price=" + price +
				", detail='" + detail + '\'' +
				'}';
	}
}
