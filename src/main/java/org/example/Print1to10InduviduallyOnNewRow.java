package org.example;

public class Print1to10InduviduallyOnNewRow
{
    public static void main(String[] args) {
        for (int i=1; i<=10;i++ )
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print(j);
                //System.out.println(i);

            }

            System.out.print("\t");
            System.out.println("");
        }
    }
}
