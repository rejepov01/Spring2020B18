package day41_Inheritance.Task01;
/*
create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering
     		create a constructor that can initialize all the attributes of businessAnalyst
 */
public class BusinessAnalyst extends Employee {

    /*
    salary    (inherited)
    name      (inherited)
    id        (inherited)
    jobTitle  (inherited)
    gender    (inherited)

    writingRequirements()
    gathering()
    toString()  (inherited)
     */

    public BusinessAnalyst(String name, double salary,long id,String jobTitle, char gender ){
        this.name =name;
        this.salary = salary;
        this.id = id;
        this.jobTitle = "Business Analyst";
        this.gender = gender;
    }

    public void writingReq(){
        System.out.println(name + " is writing requirements");
    }

    public void gathering(){
        System.out.println(name + " is gathering requirements");
    }
}
