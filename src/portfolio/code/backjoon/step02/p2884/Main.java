package portfolio.code.backjoon.step02.p2884;

import java.util.Scanner;

/* 알람 시계 (2884) */
/*
 * https://www.acmicpc.net/problem/2884
 */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AlarmManager aM = new AlarmManager(sc.nextInt(), sc.nextInt());
		
		System.out.println(aM.getAlarmHour() + " " + aM.getAlarmMinute());
	}
}

class AlarmManager{
	private final int hour, minute, chMinute = -45;
	
	public AlarmManager(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}

	public int getAlarmHour() {
		int alarmHour = hour + ((minute + chMinute >= 0) ? 0 : -1);
		return (alarmHour >= 0) ? alarmHour : alarmHour+24; 
	}

	public int getAlarmMinute() {
		int alarmMin = minute + chMinute;
		return (alarmMin >= 0) ? alarmMin : alarmMin+60; 
	}
}
