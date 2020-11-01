import java.util.Scanner;

public class employee{
    public static void main(String[] args){
        // Question 1
    Employee_details Em=new Employee_details();
    Em.get();
    Em.display();
    // question 2,3,4
    // Array of object for doctor
    Doctor[] D=new Doctor[3];
    for (int i=0;i<=2;i++){
        D[i]=new Doctor();
    }
     // Array of object for Engineer
    Engineer[] E=new Engineer[3];
    for (int i=0;i<=2;i++){
        E[i]=new Engineer();
    }
    
     // Array of object for pilot
    pilot[] p=new pilot[3];
    for (int i=0;i<=2;i++){
        p[i]=new pilot();
    }
    //  get of array of child objects
    for (int i=0;i<=2;i++){
        D[i].Doctor_class_get();
        D[i].get();
        E[i].Engineer_class_get();
        E[i].get();
        p[i].pilot_class_get();
        p[i].get();
        
     }
    //  display of array of pilot objects
    for (int i=0;i<=2;i++){
        D[i].Doctor_class_display();
        D[i].display();
        E[i].Engineer_class_display();
       E[i].display();
       p[i].pilot_class_display();
       p[i].display();
    }

    }
}
class Employee_details{
    String name,designation;
    int  age,salary;
    void get(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Employee Name- ");
        name=s.nextLine();
        System.out.print("Enter Employee Age- ");
        age=s.nextInt();
        System.out.print("Enter Employee Salary- ");
        salary=s.nextInt();
        s.nextLine();
        System.out.print("Enter Employee Designation- ");
        designation=s.nextLine();
    }
    void display(){
        System.out.println("Employee\nName is "+name+"\nAge is "+age+"\nSalary is "+salary+"\nDesignation is "+designation);

    }
}
class Doctor extends Employee_details{
   void Doctor_class_get(){
       System.out.println("Enter Doctor details below");
   }
   void Doctor_class_display(){
    System.out.println(" Doctor details below");
}

}
class Engineer extends Employee_details{
    void Engineer_class_get(){
        System.out.println("Enter Engineer details below");
    }
    void Engineer_class_display(){
        System.out.println("Engineer details below");
    }
}
class pilot extends Employee_details{
    void pilot_class_get(){
        System.out.println("Enter Pilot Details Below");
    }
    void pilot_class_display(){
        System.out.println("Pilot Details Below");
    }
}