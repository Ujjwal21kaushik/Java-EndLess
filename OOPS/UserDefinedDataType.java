package OOPS;

public class UserDefinedDataType {
    public static class Student{
        String name;
        int age;
        double cgpa;
        // Now talk about methods in objects
        void print(){
            System.out.println(name + " " + age + " " + cgpa + " ");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "uk";
        s1.age = 25;
        s1.cgpa = 8.5;

        Student s2 = new Student();
        s2.name = "sk";
        s2.age = 18;
        s2.cgpa = 9.5;


        s1.print();
        s2.print();
    }

}
