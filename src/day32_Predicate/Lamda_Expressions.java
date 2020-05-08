package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lamda_Expressions {

    public static void main(String[] args) {
        Predicate<Integer> oddNumber = x -> x %2 !=0;

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(oddNumber);

        System.out.println(list);

        System.out.println("================================================");

        Predicate<Integer> lessThan5 = Y -> Y <5;
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(lessThan5);

        System.out.println(list2);

        System.out.println("==================================================");
        Predicate<String> startWithM = s -> !s.startsWith("M");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Murtaza","Mohammed","Boris","Sha","Bilal"));

        System.out.println(names);

        names.removeIf(startWithM);

        System.out.println(names);

        System.out.println("===========================================================");
        // if the name started with M or A, remove the name from the list
        Predicate<String> startsWithMorA = each -> each.startsWith("M") || each.startsWith("A");

        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList("Muhatar","Alex","Asiya","Dilnaz","Radu"));

        nameList.removeIf(startsWithMorA);

        System.out.println(nameList);

        System.out.println("=======================================================");
                            //        c >= 48 && c <= 57
        Predicate<Character> digits = c -> Character.isDigit(c);

        ArrayList<Character> chars = new ArrayList<>();
                  chars.addAll(Arrays.asList('A','B','3','4','5','@','&','Z'));

                  chars.removeIf(digits);

        System.out.println(chars);

        System.out.println("==========================================================");
      //  Predicate<Integer> greaterThan5 = p -> p >5;

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        nums.removeIf( p-> p > 5 );  // you can create Predicate it self like above sample and after put it into brackets

        System.out.println(nums);



    }
}
