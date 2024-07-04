package org.example;

public class PrintNumFrom1to10Triangle
{
    public static void main(String[] args)
    {
        int k = 1;

        for (int i = 0; i<5;i++)
        {
            for (int j = 1; j<=i;j++)
            {
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println("");
        }

    }
}
