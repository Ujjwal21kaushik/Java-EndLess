package OOPS;

public class PolyMorphism {
    // many forms ---> single name can refer to multiple forms

    public static class Dog{
        void speak(){
            System.out.println("Bhau-Bhau");
        }
    }

    public static class Cat{
        void speak(){
            System.out.println("Meow-Meow");
        }
    }

    public static class Humans{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Humans h = new Humans();
        d.speak();
        c.speak();
        h.speak();
    }
}
