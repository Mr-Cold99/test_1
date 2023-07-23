package class_3_homework;

public class Parent_class {
    static {
        System.out.println("Parent static block"+" I");
    }
    {
        System.out.println("Parent instance block"+" III");
    }

    public Parent_class() {
        System.out.println("Parent Constructor"+" IV");
    }
}
