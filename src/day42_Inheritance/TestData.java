package day42_Inheritance;

public class TestData extends Data{
    /*
    public static String publicData = "public";
    protected static String protectedDate = "protected";
    static String defaultData = "default";
    private String privateData = "private";
     */

    /*
    public
    default
    protected
     */

    public static void main(String[] args) {

        System.out.println( TestData.publicData);
        System.out.println( TestData.protectedDate);
        System.out.println( TestData.defaultData);
      //  System.out.println( TestData.privateData );   private can never be inherited
    }
}
