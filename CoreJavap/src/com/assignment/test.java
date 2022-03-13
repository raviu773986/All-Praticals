package assignment;
import java.util.*;

class Employee
{
    String name;
    int age;
    int salary;
    String designation;
    public void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your name: ");
        name=in.next();
        System.out.print("Enter your age: ");
        age= in.nextInt();
        System.out.print("Enter your salary: ");
        salary=in.nextInt();
        System.out.print("Enter your designation: ");
        designation =in.next();
    }
    public void display()
    {
        System.out.println("Name is : "+name);
        System.out.println("Age : "+age);
        System.out.println("salary : "+salary);
        System.out.println("Designation : "+designation);
    }

}
class Clerk extends Employee {
    void addClerk()
    {
        input();
    }
    void showClerk()
    {
        display();
    }
}

class Programmer extends Employee {
    void addProgrammer()
    {
        input();
    }
    void showProgrammer()
    {
        display();
    }
}

class Manager extends Employee {
    void addManager()
    {
        input();
    }
    void showManager()
    {
        display();
    }
}
public class test {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int ch=0,ch2=0;

        Clerk c=new Clerk();
        Programmer p=new Programmer();
        Manager m=new Manager();
        do
        {
            System.out.println("*******************************");
            System.out.println("1. Create / New Entry");
            System.out.println("2. Display");
            System.out.println("3 .Exit");
            System.out.println("*******************************");
            System.out.print("Enter Your Choice..");
            ch=in.nextInt();

            if(ch == 1)
                do{
                    System.out.println("*******************************");
                    System.out.println("1. Clerk");
                    System.out.println("2. Programmer");
                    System.out.println("3. Manager");
                    System.out.println("4 .Back");
                    System.out.println("*******************************");
                    System.out.print("Enter Your Choice..");
                    ch2=in.nextInt();
                    switch(ch2)
                    {
                        case 1:
                            c.addClerk();
                            break;
                        case 2:
                            p. addProgrammer();
                            break;
                        case 3:
                            m. addManager();
                            break;
                        default: System.out.println("Please enter Correct Choice.");
                    }
                }while (ch2!=4);

            if(ch == 2)
            {
                int ch3;
                System.out.println("Enter your choice To Display ");
                System.out.println("1. Clerk ");
                System.out.println(" 2. Programmer ");
                System.out.println("3. Manager ");
                ch3=in.nextInt();
                switch (ch3)
                {
                    case 1:
                        c.showClerk();
                        break;
                    case 2:
                        p.showProgrammer();
                        break;
                    case 3:
                        m.showManager();
                        break;
                }

            }
            if(ch>3 || ch<1)
            {
                System.out.println("Please Enter valid Option..!");
            }

        }while (ch!=3);

    }
}

