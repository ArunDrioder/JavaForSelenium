package org.example.Collections;

import java.util.ArrayList;

public class ArrayListClass
{

    // can accept duplicate values
    // ArraList,LinkedList,vector- Implementing List interface
    // array have fixed size whereas arraylist can grow dynamically
    // you can access and insert any value in any index
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("rahul");
        aList.add("java");
        aList.add("java");
        System.out.println(aList);
        aList.add(0, "student");
        System.out.println(aList);
        aList.remove(1);
        aList.remove("java");
        System.out.println(aList);

        for (int i = 0; i<=aList.size();i++)
        {
            System.out.println("The element at the position"+" " +i +" " +"is" +" " + aList.get(i));
        }


    }
}

