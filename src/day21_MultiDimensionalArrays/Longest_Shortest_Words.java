package day21_MultiDimensionalArrays;
/*

2. write a program that can return the logest string of text from an array
3. write a program that can return the shortest string of text from an array

 */
public class Longest_Shortest_Words {

    public static void main(String[] args) {

        String [] name = {"Ayna","Mesud","Leyla","Shamuhammet","Patma","Yusup"};

        int maxLengthString = name[0].length(); // 4
        String longestWord = "";

        for (int i = 0; i < name.length; i++){

            if (name[i].length() > maxLengthString){
                maxLengthString = name[i].length();
                longestWord = name[i];
            }
        }

        System.out.println(longestWord);

    }

}
