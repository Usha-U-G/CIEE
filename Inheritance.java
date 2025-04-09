package java;

class Parent {
    void displayP() {
        System.out.println("I am parent class");
    }
}

class Child extends Parent {
    void displayC() {
        System.out.println("I am child class");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.displayP();
        c.displayC();
    }
}