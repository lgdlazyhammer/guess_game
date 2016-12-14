package com.itc.test;
/*
 * player role enum
 * 2016-12-13
 * from liguodong
 * */
public enum Role {
	VAMPIRE(1,"吸血鬼"),
	WIREWOLF(2, "狼人"),
	ROBOTTITAN(3,"变形金刚");
	
	private Integer type;
	private String description;
	
	private Role(Integer type, String description){
		this.type = type;
		this.description = description;
	}

	public Integer getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

}
