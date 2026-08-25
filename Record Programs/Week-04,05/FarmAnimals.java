package javacore;
class FarmAnimal {

    String name;
    String place;
    String food;

    // Default constructor
    FarmAnimal() {
        name = "Unknown";
        place = "Farm";
        food = "Grass";
    }

    // Parameterized constructor
    FarmAnimal(String name, String place, String food) {
        this.name = name;
        this.place = place;
        this.food = food;
    }

    void display() {
        System.out.println("Animal: " + name);
        System.out.println("Lives in: " + place);
        System.out.println("Eats: " + food);
    }

   
    void sound(String sound) {
        System.out.println("Sound: " + sound);
    }

    // Method overloading
    void sound(String sound, int times) {
        System.out.println("Sound: " + sound);
        System.out.println("Number of times: " + times);
    }
}
public class FarmAnimals {
    public static void main(String[] args) {

        // Objects using parameterized constructor
        FarmAnimal cow = new FarmAnimal(
                "Cow", "Cowshed", "Grass");

        FarmAnimal pig = new FarmAnimal(
                "Pig", "Pigsty", "Corn");

        FarmAnimal horse = new FarmAnimal(
                "Horse", "Stable", "Hay");

        // Display cow details
        cow.display();
        cow.sound("Moo");
        System.out.println();

        // Display pig details
        pig.display();
        pig.sound("Oink");
        System.out.println();

        // Display horse details
        horse.display();
        horse.sound("Neigh", 2);
    }
}

Animal: Cow
Lives in: Cowshed
Eats: Grass
Sound: Moo

Animal: Pig
Lives in: Pigsty
Eats: Corn
Sound: Oink

Animal: Horse
Lives in: Stable
Eats: Hay
Sound: Neigh
Number of times: 2
