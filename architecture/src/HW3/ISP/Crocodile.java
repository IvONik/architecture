package HW3.ISP;

public class Crocodile implements CanSwimming, CanWalk{

    @Override
    public void CanSwimm() {
        System.out.println("Крокодилы могут плавать");
    }

    @Override
    public void canWalk() {
        System.out.println("Крокодилы могут ходить");
    }
}
