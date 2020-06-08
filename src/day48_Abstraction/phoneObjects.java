package day48_Abstraction;

public class phoneObjects {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("X",1000,"10 inches");
        Iphone iphone2 = new Iphone("9",900,"8 inches");

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.faceTime(265324698);
        iphone1.calling(911);
        iphone1.texting(2365984);

       // iphone1.freezing();

        System.out.println("===============================================================");

      Samsung samsung1  = new Samsung("Note10",1200,"large");

        System.out.println(samsung1);

        samsung1.calling(123654);
       // samsung1.faceTiming(1236544);
        samsung1.freezing();

        samsung1.texting(123654);

    }

}
