package chap17_usefulclass;

import java.util.Calendar;
import java.util.Scanner;

public class _05_LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요. :");
		int year = sc.nextInt();
		
		if(isLeapYear(year)){
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
	}
	
	public static boolean isLeapYear(int year) {
		// 윤년의 조건
		// 년도가 400으로 나누어 떨어지거나 4로는 나누어떨어지면서 100으로는 나눠떨어지지 않는 년도
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) { // 윤년
			return true;
		}
		else { // 윤년이 아님
			return false;
		}
	}

}
