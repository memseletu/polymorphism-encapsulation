package Petspackage;

public class Dog extends Pet{
    public Dog(String petname, String speak) {
        super(petname, speak);
    }
    public void speak() {
        System.out.println("woof woof");
    }

}
