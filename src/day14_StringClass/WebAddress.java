package day14_StringClass;
/*
        write a program that can validate if a web address is valid
            valid web address:
                    MUST start with www.
                    Must ends with  .com, or .edu, or .net, or .Gov

 */
public class WebAddress {

    public static void main(String[] args) {

        String WebAddress = "Www.cybertek.Gov";

        WebAddress =WebAddress.toLowerCase();

        boolean validAddress = WebAddress.endsWith("com") || WebAddress.endsWith("edu")
                || WebAddress.endsWith("net") || WebAddress.endsWith("gov");

        if(WebAddress.startsWith("www") && validAddress){

            System.out.println("Valid address");

        }else {
            System.out.println("Invalid address");
        }

    }

}
