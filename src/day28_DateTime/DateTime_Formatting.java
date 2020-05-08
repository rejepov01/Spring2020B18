package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {

    public static void main(String[] args) {

        LocalDateTime dateTime1 = LocalDateTime.of(2020,04,24,11,40,45);

        System.out.println(dateTime1);

        // 12/25/2015 11:30 am

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, MM/dd/yyyy hh:mm a");

        String str = dateTime1.format(dtf);  // you can do it in this way

        System.out.println(str);
    }
}
