package tests;

import java.util.Arrays;
import java.util.List;

public class Student {

    int age;
    String name;
    int curse;

    public Student(int age, String name, int curse) {
        this.age=age;
        this.name=name;
        this.curse=curse;
    }
    public void printInfo(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nCurse: "+curse);
    }

    public static void main(String[] args){
        Student studentOne = new Student(18, "Maria", 1);
        studentOne.printInfo();

        Student studentTwo = new Student(27, "Viktor", 4);
        studentTwo.printInfo();

        Student studentThree = new Student(20, "Kate", 2);
        studentThree.printInfo();
        Student studentFour= new Student(29, "Kris", 3);
        studentFour.printInfo();
        Student studentFive= new Student(45, "Stanislav", 5);
        studentFive.printInfo();


        }

}
