package class_2;

public class Homework_Class_2 {
    public static void main(String[] args) {
        Vehicles Volvo=new Pasanger_Car("Red",2.4f, (short) 4);
        Vehicles Man=new Truck("Blue", 15.5f,(short) 10);
        Vehicles Ducati=new Bicecles("Yelow",0.125f,(short )2);


        System.out.println(Volvo.vehicle_type());


    }
}
