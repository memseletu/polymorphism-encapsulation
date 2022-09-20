package Petspackage;

public class Pet {
    private String petname;
    ;

    public Pet(String petname, String speak) {
        this.petname = petname;

    }

    @Override
    public String toString() {
        return "Pet{" +
                "petname='" + petname + '\'' +
                '}';
    }

    public void speak() {
        System.out.println("dog speaks");;
    }

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }
}
