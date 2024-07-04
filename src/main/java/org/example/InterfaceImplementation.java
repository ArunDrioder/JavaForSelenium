package org.example;

public class InterfaceImplementation implements CentralTrafficInterfaceDemo,AnotherNewInterface
{
    public static void main(String[] args)
    {
        CentralTrafficInterfaceDemo c = new InterfaceImplementation();
        c.redStop();
        c.orangeListen();
        c.greenGo();

        AnotherNewInterface an = new InterfaceImplementation();
        an.newInterfaceMethod();

        // To call the method created in this class, we again need to create new class variable, since this method
        //is not a part of interface.
        InterfaceImplementation ii = new InterfaceImplementation();
        ii.thisClassMethod();

    }
        @Override
        public void redStop()
        {
            System.out.println("If the light is red., then STOP");

    }

        @Override
        public void orangeListen()
        {
            System.out.println("If the light is orange, then LISTEN");

    }

        @Override
        public void greenGo()
        {
            System.out.println("If the light is Green, then GO");

    }

    public void thisClassMethod()
    {
        System.out.println("I belongs to this class");
    }


    @Override
    public void newInterfaceMethod() {
        System.out.println("I'm from new Interface method");
    }
}
