package Polymorphism;

class MethodOverriding4 extends MethodOverriding3{

    void use(){
        System.out.println("String3");
    }

    public static void main(String[] args) {

        MethodOverriding4 obj = new MethodOverriding4();
        obj.use();
    }
}
