package Homework3;
//Make a method that accepts an array of animals and prints out what each animal eats!
public class Animals {
    String name;
    String foodType;
    public static void animalArray(String[] animalType){
        int an = 0;
        String foodType = null;
        while(an<animalType.length){
            System.out.println(foodType);
            an++;
        }



    }

    public static void main(String[] args) {
       String animals []= {"cats", "dogs"};
        animalArray(animals);
        //animalArray(an1);
    }
}
