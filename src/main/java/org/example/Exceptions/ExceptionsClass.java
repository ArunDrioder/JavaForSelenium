package org.example.Exceptions;

public class ExceptionsClass
{
    public static void main(String[] args)
    {
        int b=7; int c=0;
        try {
            int k=b/c;
             int[] arr =new int[5];
            System.out.println(arr[7]);
             }
             catch(ArithmeticException et)
             {
         System.out.println("I catched the Arthimetic/exception");
             }
             catch(IndexOutOfBoundsException ets)
             {
             System.out.println("I catched the IndexBound/exception");
             } catch(Exception e)
             {
            System.out.println("I catched the error/exception");
              }
              finally
              {
            System.out.println("delete cookies");
            // THis block is executed irrespective of exception thrown or not
             }

        }
    }

