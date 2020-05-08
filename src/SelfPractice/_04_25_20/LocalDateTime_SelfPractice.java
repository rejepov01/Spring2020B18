package SelfPractice._04_25_20;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_SelfPractice {

    public static void main(String[] args) {

        LocalDateTime dateTime1 = LocalDateTime.of(2020,04,25,3,05,45);
        System.out.println(dateTime1);

        LocalDateTime dt1 = LocalDateTime.now();

        System.out.println(dt1);

        System.out.println();

        // Saturday 04/25/2020 03:10 PM

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE MM/dd/yyyy hh:mm:ss a");

        String str = dt1.format(dtf2);

        String str1 = dateTime1.format(dtf2);

        System.out.println(str);

        System.out.println(str1);

    }

}
