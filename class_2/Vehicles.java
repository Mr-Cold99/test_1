package class_2;

public class Vehicles  {
    private String Collor;
    private float engin_volume;
    private  short whels_qant;

    public Vehicles(String collor, float engin_volume, short whels_qant) {
        Collor = collor;
        this.engin_volume = engin_volume;
        this.whels_qant = whels_qant;
    }

    public String getCollor() {
        return Collor;
    }

    public void setCollor(String collor) {
        Collor = collor;
    }

    public float getEngin_volume() {
        return engin_volume;
    }

    public void setEngin_volume(float engin_volume) {
        this.engin_volume = engin_volume;
    }

    public short getWhel_qant() {
        return whels_qant;
    }

    public void setWhel_qant(short whel_qant) {
        this.whels_qant = whel_qant;
    }
    protected String vehicle_type(){
        return "Vehicle";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
