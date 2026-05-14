package OOPS;

class Students{
    String name;
    private int rno;
    double cgpa;

    // Getter method to access private variable;
    int getRno(){
        return(rno);
    }
    // Setter method to set private variable values;
    void setRno(int rno){
        this.rno = rno;
    }
    // print All
    void print(){
        System.out.println(name + " " + rno + " " + cgpa);
    }
}
public class PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.cgpa =8.9;
        s1.name = "Uk";

        System.out.println(s1.getRno());
        s1.setRno(2);
        s1.print();

        Students s2 = new Students();
        s2.cgpa =8.0;
        s2.name = "sahil";
        s2.setRno(20);
        s2.print();
    }
}
