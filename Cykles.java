import java.util.Scanner;

public class Cykles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        int res;
        System.out.println("input base");
        a=sc.nextInt();
        System.out.println("input stepin");
        b=sc.nextInt();
        res=a;

        for(int i=1; i<b;i++) {
            res=res*a;


        }
        System.out.println(res);
    }
}
