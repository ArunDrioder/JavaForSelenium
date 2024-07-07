package org.example.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintUniqueNumberOfDuplicatedInArray
{
    //Java program to print the duplicated numbers in the array & it'll also print how many times the number is
    //being duplicated.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of integer array");
        int arraySize = scanner.nextInt();

        int[] integerArray = new int[arraySize];

        System.out.println("Enter the elements");

        ArrayList<Integer> al = new ArrayList<Integer>();

       for (int i = 0; i<integerArray.length;i++)
       {

           int k = 0;
           integerArray[i] = scanner.nextInt();

           if (!al.contains(integerArray[i]))
           {
               al.add(integerArray[i]);

               for (int j = i+1; j< integerArray.length;j++)
               {
                   if (integerArray[i] == integerArray[j])
                   {
                       k++;

                   }
               }
//               System.out.println(integerArray[i]);
//               System.out.println(k);
               if (k==1)
                   System.out.println(integerArray[i]+" "+"  "+"is my unique number");

           }

       }
    }
}
