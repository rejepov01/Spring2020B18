package OfficeHours.Practice_05_27_20;

public class methodOverriding2 {

    protected void method1(){}

    public static void method2(){ }
}


class TestClass extends methodOverriding2{

    @Override
    protected void method1(){}

  //  @Override
  //  public static void method2(){ }

}
