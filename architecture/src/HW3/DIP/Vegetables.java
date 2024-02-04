package HW3.DIP;

public class Vegetables implements Food{
    @Override
    public void eat() {
        System.out.println("Едим только овощи");
    }
}
