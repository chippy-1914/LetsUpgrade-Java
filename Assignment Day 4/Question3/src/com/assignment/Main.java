package com.assignment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array=new int[5];
        int sum=0;
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter "+(i+1)+" number ");
            array[i]=s.nextInt();
            sum=sum+array[i];
        }

                System.out.println("The sum is "+sum);



    }
}
