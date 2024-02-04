package HW3.OCP;

class Dog extends Animals {
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    void makeSound() {
        System.out.println("Woof!");
//        return "Woof!";
    }
}
