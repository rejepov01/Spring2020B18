package OfficeHours.Practice_05_06_20;

public class Tester {

    String name;
    String jobTitle;
    double salary;
    long employeeID;

    public void setInfo(String name,String jobTitle,double salary, long employeeID){
        this.name = name;  // user given argument name is assigned to instance variable name
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;

    }

    public String toString (){
        return "Name: "+name+", job title "+jobTitle
                +", salary $"+salary+ ", ID: "+employeeID;
    }

    public void smokeTesting(){
        int name = 100;
        System.out.println(this.name+ " is doing smoke test");
    }

    public void creatingTicket (){
        System.out.println(name+" is creating ticket on Jira");
    }

}
