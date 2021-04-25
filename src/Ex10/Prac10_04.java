package Ex10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Prac10_04 {
    public static void main(String[] args) {
        Calendar Date1 = Calendar.getInstance();
        Calendar Date2 = Calendar.getInstance();
    
        Date1.set(2000, 0, 1);
        Date2.set(2016, 0, 29);
    
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("birth day=" + sdf.format(new Date(Date1.getTimeInMillis())));
        System.out.println("today =" + sdf.format(new Date(Date2.getTimeInMillis())));
    
        long diff = (Date2.getTimeInMillis() - Date1.getTimeInMillis())/1000                                                                                               ;
        System.out.println(diff/(24*60*60)+" days");
    }
}






























