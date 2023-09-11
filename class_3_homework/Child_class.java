package class_3_homework;

public class Child_class extends Parent_class{
    static {
        System.out.println("Child static block"+" II");
    }
    {
        System.out.println("Child instance block"+" V");
    }

    public Child_class() {
        System.out.println("Child Constructor"+" VI");
    }

}
