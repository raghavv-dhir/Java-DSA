package oops;

import java.util.Scanner;

public class interfaces {
    public static void main(String[] args) {
        Client obj = new Raj();
        obj.input();
        obj.output();
    }
}

interface Client{
    abstract void input(); //By default, public and abstract
    // All methods in an interface are abstract by default, so no need to use the 'abstract' keyword
    abstract void output();
}
class Raj implements Client{
    String username;
    int salary;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        username = sc.next();
        System.out.println("Enter salary: ");
        salary = sc.nextInt();
    }
    public void output(){
        System.out.println("Username: " + username);
        System.out.println("Salary: " + salary);
    }
}

/*
Interface in Java

An interface in Java is like a contract or blueprint for a class.

It contains abstract methods (by default) and constants (public static final).

A class that implements an interface must provide the method implementations.

Used for 100% abstraction (until Java 8) — from Java 8 onwards, it can also have default and static methods.
 */
