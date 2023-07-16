package class_2;

public class Pasanger_Car extends Vehicles{
    public Pasanger_Car(String collor, float engin_volume, short whels_qant) {
        super(collor, engin_volume, whels_qant);
    }

    @Override
    protected String vehicle_type() {
        return "Vehicles is Pasanger Car";
    }
}
