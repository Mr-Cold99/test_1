package interface_homevork;

public class Homosapiens implements Drive,Fly{

    @Override
    public void Drive() {
        System.out.println("I can Drive");
    }

    @Override
    public void Fly() {
        System.out.println("I can Fly");

    }
}
