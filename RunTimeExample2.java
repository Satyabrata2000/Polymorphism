package Polymorphism;

public class RunTimeExample2  extends RunTimeExample1{

    void use(){
        System.out.println("String 2");
    }

    public static void main(String[] args) {
        RunTimeExample1 obj = new RunTimeExample2(); //upcasting
        obj.use();
    }
}
