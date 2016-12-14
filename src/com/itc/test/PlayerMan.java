package com.itc.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * player human entity
 * 2016-12-13
 * from liguodong
 * */
public class PlayerMan extends Player {

	public Integer result;

	/*
	 * human player make action by input when the input is not the required
	 * value keep asking
	 */
	public Integer makeAction() {

		result = 0;

		while (result == 0) {
			result = getInputChoice();
		}

		System.out.println("ѡ�ֳ���  " + getActionText(result));
		return result;
	}

	/* receive human planyer input */
	public int getInputChoice() {

		BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���ȭ��1.����        2.ʯͷ        3.��");
		try {
			String str = strin.readLine();
			if (CommonFuc.checkStrNum(str)) {

				switch (Integer.valueOf(str)) {
				case ActionStaticParams.PAPERCUTTER:
					return Action.PAPERCUTTER.getType();
				case ActionStaticParams.STONE:
					return Action.STONE.getType();
				case ActionStaticParams.PLANKET:
					return Action.PLANKET.getType();
				default:
					return 0;
				}
			} else {
				return 0;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	/* human player choose character */
	public void chooseCharacter() {
		while (charac == 0) {
			charac = getInputCharacter();
		}

		System.out.println("ѡ�ֽ�ɫ: " + getCharacterText(charac));
	}

	/* human player input character */
	public int getInputCharacter() {

		BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("��ѡ���ɫ��1.��Ѫ��        2.����        3.���ν��");
		try {
			String str = strin.readLine();

			if (CommonFuc.checkStrNum(str)) {
				switch (Integer.valueOf(str)) {
				case RoleStaticParams.VAMPIRE:
					return Role.VAMPIRE.getType();
				case RoleStaticParams.WIREWOLF:
					return Role.WIREWOLF.getType();
				case RoleStaticParams.ROBOTTITAN:
					return Role.ROBOTTITAN.getType();
				default:
					return 0;
				}
			} else {
				return 0;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

}
