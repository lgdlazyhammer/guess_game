package com.itc.test;
/*
 * player action enum
 * 2016-12-13
 * from liguodong
 * */
public enum Action {
	PAPERCUTTER(1,"¼ôµ¶"),
	STONE(2, "Ê¯Í·"),
	PLANKET(3,"²¼");
	
	private final Integer type;
	private final String description;
	
	private Action(Integer type, String description){
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
