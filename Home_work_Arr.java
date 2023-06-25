import java.util.Arrays;
import java.util.Random;
public class Home_work_Arr {
    private final static Random rnd=new Random();

    public static void main(String[] args) {

        int[] arr=new int[10];


        random(arr);
        min_max_centr(arr);
        System.out.println("Suma elemens Array arr: "+suma(arr));


    }
    public static int[] random(int[]arr){
        for (int i=0;i<arr.length;i++){
            arr[i]=rnd.nextInt(100);

        }
        System.out.println("vector[10] random: "+Arrays.toString(arr));
        return arr;
    }
    public static int[] min_max_centr(int[] arr){
        Arrays.sort(arr);
        System.out.println("vector[10] random_sorted: "+Arrays.toString(arr));
        int min=arr[0];
        int max=arr[arr.length-1];
        int centre=arr[arr.length/2];
        System.out.println("Max element Array arr: "+max);
        System.out.println("Min element Array arr: "+min);
        System.out.println("Centr element Array arr: "+centre);
        return arr;
    }
    public static int suma(int[] arr){
       int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
