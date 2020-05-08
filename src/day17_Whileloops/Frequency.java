package day17_Whileloops;

public class Frequency {

    public static void main(String[] args) {

        String str = "Java is fun, Java is cool, Java is Java ";

        int count = 0;  // +1+1+1

        while (str.contains("Java")){
            count++;
            str = str.replaceFirst("Java","") ; // after counting the first "Java", we need to remove it from
        }

        System.out.println(count);

    }
}
