package day39_AccessModifiers;
/*
task:
    create class for Student:
            instance variables:
                    name, id, age, gender, grade, SSN
                    public: name,  gender
                    private: grade, SSN, id, age
 */
public class PersonalInfo {

    public static String name = "Sha";
    public static char gender = 'M';

     static char grade = 'A';
     static int age = 35;

    private static long SSN = 123644598;
    private static long id = 5632145;
}
