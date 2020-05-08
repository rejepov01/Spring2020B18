package SelfPractice._04_12_20;

import java.util.Scanner;

public class Replit049 {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Status Code: ");
        int status = scan.nextInt();

        switch (status){
            case 200:
                System.out.println("Ok");
                break;
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 301:
                System.out.println("Moved Permanently");
                break;
            case 303:
                System.out.println("See Other");
                break;
            case 304:
                System.out.println("Not Modified");
                break;
            case 307:
                System.out.println("Temporary Redirect");
                break;
            case 400:
                System.out.println("Bad Request");
                break;
            case 401:
                System.out.println("Unauthorized");
                break;
            case 403:
                System.out.println("Forbidden");
                break;
            case 404:
                System.out.println("Not Found");
                break;
            case 410:
                System.out.println("Gone");
                break;
            case 500:
                System.out.println("Internal Server Error");
                break;
            case 503:
                System.out.println("Server Unavailable");
                break;
            default:
                System.out.println("Invalid status code!");
                break;

        }



    }

}
