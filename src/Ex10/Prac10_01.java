package Ex10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Prac10_01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2020, 0, 1); //cal의 날짜를 2020년 1월 1일로 설정합니다.
    
        for (int i = 0; i < 12; i++) {
            int weekday = cal.get(Calendar.DAY_OF_WEEK); //1일의 요일을 구합니다.
            
            //두 번째 일요일은 1일의 요일에 따라 설정
            //1일이 일요일인 경우 두번째 일요일은 8일이고,
            //1일이 다른 요일인 경우 16에서 1일의 요일 (weekday) 빼면
            int secondSunday = (weekday == 1) ? 8 : 16 - weekday;
            //두 번째 일요일(secondSunday)로 cal의 날짜(DAY_OF_WEEK)를 바꾼다.
            cal.set(Calendar.DAY_OF_MONTH, secondSunday);
    
            Date d = cal.getTime(); //Calender를 Date로 변환한다.
            System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
            
            
            //날짜를 다음달 1일로 변경합니다.
            cal.add(Calendar.MONTH, 1);
            cal.set(Calendar.DAY_OF_MONTH, 1);
        }
    }
}















