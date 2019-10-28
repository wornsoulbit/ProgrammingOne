package animal;

/**
 * Class of a dog.
 *
 * @author Alex Vasil
 */
public class Dog {

    String name;
    String breed;
    String colour;
    char gender;
    int age;

    public Dog() {
        name = null;
        age = 0;
        gender = 0;
        breed = null;
        colour = null;
    }

    public Dog(String name, int age, char gender, String breed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
        this.colour = "white";
    }

    public Dog(String name, int age, char gender, String breed, String colour) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
        this.colour = colour;
    }

}
