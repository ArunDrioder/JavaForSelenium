package org.example.Arrays;

public class SingleDimensionalArray
{
    public static void main(String[] args) {
        int a[] = new int[5];// Delcares an aray and allocates memory for the values
        a[0]= 2;
        a[1]=6;
        a[2]=1;
        a[3]=9;
        a[4]=12;//initilased values into that array

        int b[] = {1,4,3,5,7,8};

        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
// retrieve values present in this array/
    }
}
}
