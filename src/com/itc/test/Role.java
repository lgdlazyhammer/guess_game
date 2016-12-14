package com.itc.test;
/*
 * player role enum
 * 2016-12-13
 * from liguodong
 * */
public enum Role {
	VAMPIRE(1,"��Ѫ��"),
	WIREWOLF(2, "����"),
	ROBOTTITAN(3,"���ν��");
	
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
