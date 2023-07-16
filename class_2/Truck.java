package class_2;

public class Truck extends Vehicles{

    public Truck(String collor, float engin_volume, short whels_qant) {
        super(collor, engin_volume, whels_qant);
    }

    @Override
    protected String vehicle_type() {
        return "Vehicles is Truck";
    }
}
