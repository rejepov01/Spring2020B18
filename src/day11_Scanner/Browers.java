package day11_Scanner;
/*
 3. write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name

            Note: Do Not use scanner or if statement or ternary for this task
 */

public class Browers {

    public static void main(String[] args) {

        String browserName = "Chrome"; // java is case sensitive if you write chrome it will not read
                                        // but if you write Chrome it will execute because of  or choice

        switch (browserName){

            case"Chrome":
            case "chrome":
                System.out.println("Chrome is opening ...");
                break;

            case "Firefox":
                System.out.println("Firefox is opening ...");
                break;

            case "Safari":
                System.out.println("Chrome is opening ...");
                break;

            case "Opera":
                System.out.println("Opera is opening ...");
                break;

            default:
                System.out.println("Invalid browser name, please give the valid name");

        }
    }
}
