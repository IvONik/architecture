package HW3.OCP;

class Cat extends Animals {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    void makeSound() {
        System.out.println("meow");
//        return voice;
    }
}
