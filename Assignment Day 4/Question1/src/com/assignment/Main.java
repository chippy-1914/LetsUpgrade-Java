package com.assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Avengers[] A=new Avengers[5];
        int age;
        String power,name,weapon;
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            A[i]=new Avengers();
        }
        for(int i=0;i<5;i++){
            System.out.print("Enter a name ");
            name=s.nextLine();
            System.out.print("Enter a weapon ");
            weapon=s.nextLine();
            System.out.print("Enter a power ");
            power=s.nextLine();
            System.out.print("Enter a age ");
            age=s.nextInt();
            s.nextLine();
            A[i].getDetails(age,name,weapon,power);
        }
        for(int i=0;i<5;i++){
            A[i].displayDetails();
        }
    }

}
