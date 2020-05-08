package day02_Variables;

public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("\tHello");
        System.out.println("\t\t\t\t\tHello");
        //  \t means paragraph space

        System.out.println("Cybertek School");
        System.out.println("Cybertek\nSchool");
        System.out.println("\nMy\nName\nIs\nSha");
        // \n means the new line, starts with the new line

        // print: My favorite TV show is "Game of Thrones"
        System.out.println("My favorite TV show is \"Game of Thrones\"");
           // \" means double quote, prints double quote to the console

        System.out.println("My favorite book is \"Risalei Nur\"");

        System.out.println("\\");
        //  \\ prints a single slash on console

        System.out.println("/");

        System.out.println("My favorite book is 'Risalei Nur'");
        System.out.println("My favorite book is \'Risalei Nur\'");  //  \' prints single quote

    }


}
