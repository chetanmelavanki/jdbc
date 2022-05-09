package com.xworkz.jdbc;

public enum DriverProperties {

	url("jdbc:mysql://localhost:3306/xworkz_jan15"), userName("root"), passWord("ROOT");

	private String value;

	private DriverProperties(String value) {
		this.value = value;

	}

	public String getValue() {
		return value;
	}

}
