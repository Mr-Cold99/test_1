import java.util.Scanner;

public class zirochky_pljusyky {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int high; //висота малюнка
        int widh;//ширина малюнка
        int target;//модифікована лінійка

        System.out.println("Введіть висоту:");
        high=in.nextInt();
        System.out.println("Введіть ширину:");
        widh=in.nextInt();
        System.out.println("Введіть номер лінійки яку потрібно модифікувати:");
        target=in.nextInt();

        engine(high,target,widh); //engine метод який все збирає

        }
        public static void first_last_line(int widh){// перша і остання лінійка
        for (int i=0;i<widh;i++){
            System.out.print("-");
        }
            System.out.print("\n");
    }
        public static void main_line(int widh){ // основна лінійка
            System.out.print("|");
            for (int i=1;i<widh-1;i++){
                System.out.print("*");
            }
            System.out.print("|\n");
        }
        public static void target_line(int widh){ //модифікована лінійка
            for (int i=0;i<widh;i++){
                System.out.print("+");
            }
            System.out.print("\n");
        }
        public static void engine(int height,int target,int widh){//збирає все
            first_last_line(widh);
            for(int i=1;i<height-1;i++){
                if(i==target-1){
                    target_line(widh);
                }
                else{
                    main_line(widh);
                }
            }
            first_last_line(widh);
        }
}
