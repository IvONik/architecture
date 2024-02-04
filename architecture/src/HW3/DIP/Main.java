package HW3.DIP;

public class Main {
    public static void main(String[] args) {
        Animals animal1 = new Animals(new Frut());
        Animals animal2 = new Animals(new Vegetables());
        animal1.animalEat();
        animal2.animalEat();

    }
}
