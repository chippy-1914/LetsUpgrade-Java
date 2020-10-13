package com.assignment;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("Enter "+(i+1)+" number ");
            array[i]=s.nextInt();
        }
        for(int i=0;i<5;i++){
            if(array[i]%2!=0){
                System.out.println(array[i]);
            }
        }

    }
}
