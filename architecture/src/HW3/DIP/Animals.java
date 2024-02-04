package HW3.DIP;

public class Animals {
    Food food;

    public Animals(Food food) {
        this.food = food;
    }
    void animalEat(){
        food.eat();
    }
}
