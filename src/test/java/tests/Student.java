package tests;

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
        Student student = new Student();
        student.age=18;
        student.name="Maria";
        student.curse=1;
        student.printInfo();

        Student studentNTwo = new Student();
        studentNTwo.age=27;
        studentNTwo.name="Viktor";
        studentNTwo.curse=4;
        studentNTwo.printInfo();

        Student studentNumThree = new Student();
        studentNumThree.age=20;
        studentNumThree.name="Kate";
        studentNumThree.curse=2;
        studentNumThree.printInfo();
        Student studentNumFour= new Student(29, "Kris", 3);
        Student studentNumFive= new Student(45, "Stanislav", 5);

    }
}
