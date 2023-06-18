import java.util.Scanner;
public class method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int var;
        int index;
        int qwant;
        int index2;
        String inchar;
        char symb;


        System.out.println("Введіть число:");
        var=input.nextInt();
        System.out.println("Введіть степінь:");
        index=input.nextInt();
        System.out.println(var+" в степені "+index+" = "+stepinj(var,index));




        System.out.println("Введіть кількість зірочок:");
        qwant=input.nextInt();
        zirochka(qwant);



        System.out.println("\nВведіть симол:");
       inchar=input.next();
        System.out.println("Введіть кількість");
        index2=input.nextInt();
        symbol_out(symb=inchar.charAt(0),index2);




    }
    public static long stepinj(int var,int index){

        long res=1;
        for (int i=0;i<index;i++){
            res*=var;

        }
        return res;

    }
    public static void zirochka(int qwant){
        for(int i=0;i<qwant;i++){
            System.out.print("*");
        }
    }
    public static void symbol_out(char symb,int index2){
        for (int i=0; i<index2;i++){
            System.out.print(symb);
        }
    }
}
