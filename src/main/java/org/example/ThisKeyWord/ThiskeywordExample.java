package org.example.ThisKeyWord;

public class ThiskeywordExample
{
    int a = 10;

    public void printInt()
    {
        int a = 3;
        System.out.println(a);//----->This will print 3
        //System.out.println(this.a);--> This will print 10
        //"This" keyword is used to refer to the current class object declared globally (within the class)
        //if we simply use print(a) without "this" keyword., it'll take only the most recent initialization, (i.e, 3)
        int sum = a+this.a;
        System.out.println(sum);
    }

    public static void main(String[] args) {

        ThiskeywordExample teg = new ThiskeywordExample();
        teg.printInt();

    }
}
