package Polymorphism;

public class RunTimeExample4 extends RunTimeExample3{

    int a = 20;

    public static void main(String[] args) {

        RunTimeExample3 obj = new RunTimeExample4();
        System.out.println(obj.a);
    }
}
