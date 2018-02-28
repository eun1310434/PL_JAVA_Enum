/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/

package com.eun1310434.etc;
enum Enum_Day {
	SUNDAY(0, "��"),
	MONDAY(1, "��"),
	TUESDAY(2, "ȭ"),
	WEDNESDAY(3, "��"),
	THURSDAY(4, "��"),
	FRIDAY(5, "��"),
	SATURDAY(6, "��");
	
	private int position;
	private String dayString;

	Enum_Day(int pos, String word) {
		this.position = pos;
		this.dayString = word;
	}
	
	public int getPosition() { 
		return position;
	}
	
	public String getDayString() {
		return dayString;
	}
	
	
	public String toString() {
		return dayString + "����(" + position + ")";
	}
	
	public static Enum_Day afterDay(Enum_Day eDay, int days) {
		
		int afterDay = eDay.getPosition() + days;
		int requestDay = afterDay % 7;
		
		for(Enum_Day enumDay : Enum_Day.values()) {
			if(enumDay.getPosition() == requestDay) {
				return enumDay;
			}
		}
		return null;
	}
}

public class Enum {
	public static void main(String[] ar) {
		Enum_Day SUNDAY = Enum_Day.SUNDAY;
		Enum_Day afterTen = Enum_Day.afterDay(SUNDAY, 10);		
		System.out.println("10 days after from SUNDAY : " + afterTen.toString());
	}
}
