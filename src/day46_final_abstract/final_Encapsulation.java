package day46_final_abstract;

public class final_Encapsulation {

   final private int data1 = 200;


    public int getData1(){
        return  data1;
    }

    /* // If variable is final it can not generate setter

    public void setData1(int data1){
        this.data1 = data1;

    }

     */


    private int data2 = 300;

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }



}
