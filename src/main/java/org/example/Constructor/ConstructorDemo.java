package org.example.Constructor;

public class ConstructorDemo
{
    public ConstructorDemo()
    {
        System.out.println(" I am in the constructor");
        System.out.println(" I am in the constructor lecture 1");
    }

    public ConstructorDemo(int a, int b)
    {
        System.out.println(" I am in the parameterized constructor");
        int c=a+b;
        System.out.println(c);
    }

    public ConstructorDemo(String s)
    {
        System.out.println(s);
    }

    public void getData()
    {
        System.out.println("I am the method");
    }

    public static void main(String[] args)
    {
        ConstructorDemo cd= new ConstructorDemo();
        ConstructorDemo cds= new ConstructorDemo("hello");
        ConstructorDemo c= new ConstructorDemo(4,5);

        // compiler will call implict constructor if you have not defined constructor block
        // whenever you create an object constructor is called
        // block of code when ever an object is created

    }
}
