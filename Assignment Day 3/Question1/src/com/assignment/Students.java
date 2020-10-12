package com.assignment;
import java.util.Scanner;
public class Students {

    public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter Subject 1 marks ");
	    double subj1=s.nextDouble();
        System.out.print("Enter Subject 2 marks ");
        double subj2=s.nextDouble();
        System.out.print("Enter Subject 3 marks ");
        double subj3=s.nextDouble();
        System.out.print("Enter Subject 4 marks ");
        double subj4=s.nextDouble();
        System.out.print("Enter Subject 5 marks ");
        double subj5=s.nextDouble();
        double per=(subj1+subj2+subj3+subj4+subj5)/5;
        String grade;
        if(per>=90){
            grade="A+";
        }
        else if(per>=80){
            grade="A";
        }
        else if(per>=70){
            grade="B+";
        }
        else if(per>=60){
            grade="B";
        }
        else if(per>=50){
            grade="C+";
        }
        else if(per>=45){
            grade="C";
        }
        else {
            grade="F";
        }
        if(grade!="F"){
            System.out.println("Congratulations, you are passed with grade "+grade+" and percentage "+per);
        }
        else {
            System.out.println("Sorry You are failed with grade F and percentage "+per+" \n Try your best next time");
        }
    }
}
