import java.util.Scanner;

public class Cykles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;

        System.out.println("Вивід чисел:\n"+out()+"\n");


        System.out.println("Вивід парних чисел:\n"+even_numbers()+"\n");


        System.out.println("Введіть число для якого шукаємо факторіал!");
        n=sc.nextInt();
        System.out.println("Факторіал числа:"+n+"\n"+factorial(n));
        System.out.println("Рекурсивний факторіал "+fact_rec(n));


        System.out.println("Введіть максимум для чисел фібоначі");
        m=sc.nextInt();
        fibonachi(m);

    }
    //Метод out() виводить числа від одного до десяти
    public static  int out(){
        for(int i=1;i<=10;i++){
            System.out.println(i);

        }
        return 0;
    }
    //Метод виводить парні числа від 2 до 100
    public static  int even_numbers(){
        for(int i=2;i<=100;i+=2){
            System.out.println(i);
        }
        return 0;
    }
    //Метод шукає факторіал ітераційно
    public static long factorial(int n){
        long fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    //метод рекурсивно рахує факторіал
    public static long fact_rec(int n){
        if(n==1){
            return 1;
        }
        return n*fact_rec(n-1);

    }
    public static int fibonachi(int m){
        int fb1=0;
        int fb2=1;
        int res=1;
        System.out.println(fb1);

        while( res<m){
            System.out.println(res);
            res=fb1+fb2;
            fb1=fb2;
            fb2=res;
        }
        return 0;
    }

}
