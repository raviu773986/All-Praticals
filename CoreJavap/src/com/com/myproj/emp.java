package com.myproj;

import java.util.Scanner;
class Empl
{
    String name;int age;int sal;String desig;
    Empl()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name=sc.next();
        System.out.print("Enter your Age: ");
        age=sc.nextInt();
        System.out.print("Enter your Salary: ");
        sal=sc.nextInt();
        System.out.print("Enter your Designation: ");
        desig=sc.next();
    }
    void display()
    {
        System.out.print("Name:c"+name);
        System.out.print("Age: "+age);
        System.out.print("Salary: "+age);
        System.out.print("Designation: "+desig);
    }
}
class Clerk
{
    String name;int age;int sal;String desig;
    Clerk()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name=sc.next();
        System.out.print("Enter your Age: ");
        age=sc.nextInt();
        System.out.print("Enter your Salary: ");
        sal=sc.nextInt();
        System.out.print("Enter your Designation: ");
        desig=sc.next();
    }
    void display()
    {
        System.out.print("Name:c"+name);
        System.out.print("Age: "+age);
        System.out.print("Salary: "+age);
        System.out.print("Designation: "+desig);
    }
}

class Developer
{
    String name;int age;int sal;String desig;
    Developer()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name=sc.next();
        System.out.print("Enter your Age: ");
        age=sc.nextInt();
        System.out.print("Enter your Salary: ");
        sal=sc.nextInt();
        System.out.print("Enter your Designation: ");
        desig=sc.next();
    }
    void display()
    {
        System.out.print("Name:c"+name);
        System.out.print("Age: "+age);
        System.out.print("Salary: "+age);
        System.out.print("Designation: "+desig);
    }
}

class Tester
{
    String name;int age;int sal;String desig;
    Tester()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name=sc.next();
        System.out.print("Enter your Age: ");
        age=sc.nextInt();
        System.out.print("Enter your Salary: ");
        sal=sc.nextInt();
        System.out.print("Enter your Designation: ");
        desig=sc.next();
    }
    void display()
    {
        System.out.print("Name:c"+name);
        System.out.print("Age: "+age);
        System.out.print("Salary: "+age);
        System.out.print("Designation: "+desig);
    }
}

class Manager
{
    String name;int age;int sal;String desig;
    Manager()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name=sc.next();
        System.out.print("Enter your Age: ");
        age=sc.nextInt();
        System.out.print("Enter your Salary: ");
        sal=sc.nextInt();
        System.out.print("Enter your Designation: ");
        desig=sc.next();
    }
    void display()
    {
        System.out.print("Name:c"+name);
        System.out.print("Age: "+age);
        System.out.print("Salary: "+age);
        System.out.print("Designation: "+desig);
        System.out.println();

    }
}



public class emp
{
    public static void main(String args[])
    {
        Empl e=new Empl();
        e.display();

        Clerk c=new Clerk();
        c.display();

        Developer d=new Developer();
        d.display();

        Tester t=new Tester();
        t.display();

        Manager m=new Manager();
        m.display();

    }
}



