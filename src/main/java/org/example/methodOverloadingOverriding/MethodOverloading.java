package org.example.methodOverloadingOverriding;

public class MethodOverloading
{

    String name = "SomeName";
    public static void main(String[] args)
    {
        MethodOverloading mo = new MethodOverloading();
        mo.getData(2);
        mo.getData("hello");
        mo.getData(2,5);

    }

    public void getData(int a)
    {
        System.out.println(a);
    }
    public void getData(String a)
    {
        System.out.println(a);
    }
    public void getData(int a,int b)
    {
        System.out.println(b);
    }
}
