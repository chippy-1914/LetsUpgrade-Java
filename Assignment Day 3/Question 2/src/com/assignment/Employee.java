package com.assignment;
import java.util.Scanner;
public class Employee {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Employee name: ");
	    String name=s.nextLine();
        System.out.print("Enter Employee Date of birth(01-31): ");
	    int date=s.nextInt();
        System.out.print("Enter Employee Month of birth(01-12): ");
	    int month=s.nextInt();
        System.out.print("Enter Employee Year of birth: ");
	    int year=s.nextInt();
        System.out.print("Enter Employee Monthly salary: ");
	    double sal=s.nextDouble();
	    double tax=0.0;
	    if(sal>=500000){
	        tax=sal*0.2;
	    }
	    else if(sal>=400000){
	        tax=sal*0.15;
        }
	    else if(sal>=300000){
	        tax=sal*0.1;
        }
	    else if(sal>=200000){
	        tax=sal*0.05;
        }
	    int age=2020-year;
	    System.out.println("The employee\nname is "+name+"\nage is "+age+" year "+month+" month and "+date+" days" +
                " old\nMonth salary is "+sal+"\nThe tax amount is "+tax);
    }
}
