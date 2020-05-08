package day21_MultiDimensionalArrays;

public class Zoo {

    public static void main(String[] args) {

        String [] WildAnimals = {"Tiger","Lion","Monkey","Turtle","Corcodile"};

        String [] birds = {"Eagle","Ducks","Peacock","Chicken"};
        //                   0         1        2         3

        String [] [] zoo = { WildAnimals ,birds};
             //                  0          1

        String kfc = zoo [1] [3];  // chicken

        System.out.println(kfc);


        System.out.println("=============================================================");

        for (String eachBirds : zoo[1]){
            if (eachBirds.equals("Chicken")){  // 4
                continue;
            }

            System.out.println(eachBirds);
        }

        System.out.println("=======================================================");

        for (String each : zoo[0]){ // 5
            if (each.equals("Turtle")){
                continue;
            }
            System.out.println(each);
        }

    }

}
