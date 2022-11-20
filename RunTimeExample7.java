package Polymorphism;

//Runtime polymorphism with Multilevel inheritance

public class RunTimeExample7 extends RunTimeExample6{

    void use(){
        System.out.println("String 3");
    }

    public static void main(String[] args) {
        RunTimeExample5 obj1, obj2, obj3;
        obj1 = new RunTimeExample5();
        obj2 = new RunTimeExample6();
        obj3 = new RunTimeExample7();
        obj1.use();
        obj2.use();
        obj3.use();
    }
}
