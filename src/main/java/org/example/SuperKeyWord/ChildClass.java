package org.example.SuperKeyWord;

public class ChildClass extends ParentClass
{

    String printString = "I'm from Second Class";

    public void printStringMethod()
    {
        //When both the Parent & child classes are having properties (variables & methods) with same name, if we use "super", then the parent properties
        // will be called
        // if "super" keyword is not used, then child class properties will be called.

        //System.out.println("This String");
        super.printStringMethod();
        System.out.println(printString);

    }


    public static void main(String[] args)
    {
        ChildClass childClass = new ChildClass();
        childClass.printStringMethod();


    }

}
