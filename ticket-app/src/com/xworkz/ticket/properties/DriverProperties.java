package com.xworkz.ticket.properties;

public enum DriverProperties {
	url("jdbc:mysql://localhost:3306/xworkz_jan15"), userName("root"), passWord("ROOT"), type("classic");

	private String value;

	private DriverProperties(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;
	}

}
