package Chapter06;

import java.util.Calendar;

public class CalendarEx {
	public static void printCalender(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //컴퓨터의 달은 0~11 인식
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
		int hourOfday = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int milisecond = cal.get(Calendar.MILLISECOND);
		
		System.out.print(msg+" : "+year+"-"+month+"-"+day+" ");
//		System.out.println(dayofweek); //일요일1 월요일2----3    4 
//		System.out.println(Calendar.FRIDAY);
		
		switch (dayofweek) {
		case Calendar.SUNDAY:System.out.print("일요일");break;
		case Calendar.MONDAY:System.out.print("월요일");break;
		case Calendar.TUESDAY:System.out.print("화요일");break;
		case Calendar.WEDNESDAY:System.out.print("수요일");break;
		case Calendar.THURSDAY:System.out.print("목요일");break;
		case Calendar.FRIDAY:System.out.print("금요일");break;
		case Calendar.SATURDAY:System.out.print("토요일");break;
		default:break;
		 }
		System.out.println("("+hourOfday+")"); //24시간 기준.
		
		if (ampm==Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");

		}
		System.out.println(hour+"시"+minute+"분"+second+"초"+milisecond+"밀리초");
	}
	public static void main(String[] args) {
		//avstract class는 new연산자로 객체 생성 할 수 없다.
//		new Calendar();
		Calendar now = Calendar.getInstance();
		printCalender("현재", now);
		Calendar fristDate = Calendar.getInstance();
		fristDate.clear(); //날짜,시간 정보를 삭제
		fristDate.set(2016, 11, 25);
		fristDate.set(Calendar.HOUR_OF_DAY,20);
		fristDate.set(Calendar.MINUTE,30);
		
		printCalender("처음 데이트한 날은", fristDate);

	}
	}
