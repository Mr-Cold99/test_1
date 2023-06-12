import java.util.Scanner;

public class Conditional_Operators {
    public static void main(String[] args) {
        Scanner var=new Scanner(System.in);
        int a;//
        int b;//
        int c;//
        System.out.println("input a variable");
        a= var.nextInt();
        System.out.println("input b variable");
        b= var.nextInt();
        if(a>b){
            System.out.println("Більше число:а= "+a+"\nМеньше число:b= "+b);
        }
        else if(a<b){
            System.out.println("Більше число:b= "+b+"\nМеньше число:a= "+a);
        }
        else {
            System.out.println("Числа а і b рівні");
        }
        System.out.println("Введіть число для первірки на парність");
        c=var.nextInt();
        if(c%2==0){
            System.out.println("Число є парне");

        }
        else {
            System.out.println("Число є не парне");
        }

    }
}
