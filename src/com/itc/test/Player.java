package com.itc.test;
/*
 * player entity
 * 2016-12-13
 * from liguodong
 * */
public class Player {
	
	public Integer charac = 0;
	public Integer score = 0;
	
	public Integer makeAction(){
		return 0;
	}
	
	public void chooseCharacter(){
		charac = 0;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getCharac() {
		return charac;
	}

	public void setCharac(Integer charac) {
		this.charac = charac;
	}
	
	public String getCharacterText(Integer type) {

		switch (type) {
		case RoleStaticParams.VAMPIRE:
			return Role.VAMPIRE.getDescription();
		case RoleStaticParams.WIREWOLF:
			return Role.WIREWOLF.getDescription();
		case RoleStaticParams.ROBOTTITAN:
			return Role.ROBOTTITAN.getDescription();
		default:
			return "undefined";
		}
	}
	
	public String getActionText(Integer type) {
		
		switch (type) {
		case ActionStaticParams.PAPERCUTTER:
			return Action.PAPERCUTTER.getDescription();
		case ActionStaticParams.STONE:
			return Action.STONE.getDescription();
		case ActionStaticParams.PLANKET:
			return Action.PLANKET.getDescription();
		default:
			return "undefined";
		}
	}
}
