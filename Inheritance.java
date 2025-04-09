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
        System.out.println("I am inside main class");
        Child c = new Child();
        c.displayP();
        c.displayC();
    }
}
