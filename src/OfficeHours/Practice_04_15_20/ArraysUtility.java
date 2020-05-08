package OfficeHours.Practice_04_15_20;
import java.util.Arrays;
public class ArraysUtility {
    /*
    Arrays.sort(arr): sorts the array in Ascending order
    Arrays.equal(arr1, arr2):    arr1 == arr2
    Arrays.toString(): converts single dimensional array to string

    Arrays.deepToString(): converts multi dimensional array to string
     */

    public static void main(String[] args) {
        int [] arr = {9,10,8,65,8,6,5};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);   //  [5, 6, 8, 8, 9, 10, 65]

        System.out.println(Arrays.toString(arr));

        int [] salaries ={10000,200000,3000,5000,432,123547,2000000};
        int length = salaries.length;
        int lastIndex = length-1;

        Arrays.sort(salaries); // ascending

        System.out.println(Arrays.toString(salaries));  // [432, 3000, 5000, 10000, 123547, 200000, 2000000]
        System.out.println("Minimum salary: "+salaries[0]);
        System.out.println("Maximum salary: "+salaries[lastIndex]);


        System.out.println("=====================================================");

        int [] arr1 = {3,2,1};
        int [] arr2 = {2,3,1}; // i changed to {2,3,1} {1,2,3} so result returned to false

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1,arr2));  // true

    }
}
