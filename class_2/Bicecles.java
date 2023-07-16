package class_2;

public class Bicecles extends Vehicles{
    public Bicecles(String collor, float engin_volume, short whels_qant) {
        super(collor, engin_volume, whels_qant);
    }

    @Override
    protected String vehicle_type() {
        return "Vehicle is Bicecles";
    }
}
