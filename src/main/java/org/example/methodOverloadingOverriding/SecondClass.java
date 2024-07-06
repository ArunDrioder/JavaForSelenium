package org.example.methodOverloadingOverriding;

public class SecondClass extends MethodOverloading
{
    String name ="QAClickAcademy";

    public SecondClass()
    {
        super();// this should be always be at first line
        System.out.println("child class constructor");
    }

    public static void main(String[] args) {
        SecondClass sc = new SecondClass();
        sc.getStringData();
        sc.getData(2);
    }

    public void getStringData()
    {
        System.out.println(name);
        System.out.println(super.name);
    }


//    public void getData()
//    {
//        super.getData(2);
//        System.out.println("I am in child class");
//    }


}
