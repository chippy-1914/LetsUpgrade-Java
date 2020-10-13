package com.assignment;

public class Avengers {
        String name,weapon,power;
        int age;
        public void getDetails(int ag,String nam,String weap,String powr) {
            name=nam;
            age=ag;
            weapon=weap;
            power=powr;

        }
        public void displayDetails(){
            System.out.println("The avenger \nname is "+name+"\n age is "+age+"\npower is"+power+"\nweapon is "+weapon);
        }
}
