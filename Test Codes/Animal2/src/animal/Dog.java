package animal;

/**
 * A class of dogs.
 *
 * @author Alex Vasil
 */
public class Dog {

    private String name;
    private String gender;
    private String breed;
    private String color;
    private int age;

    public Dog() {
        this.name = "";
        this.gender = "";
        this.breed = "";
        this.color = "";
        this.age = -1;
    }

    public Dog(String name) {
        this.name = name;
        this.gender = "";
        this.breed = "";
        this.color = "";
        this.age = -1;
    }

    public Dog(String name, String gender, String breed, String color, int age) {
        this.name = name;
        this.gender = gender;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Woof!!!, Woof!!!");
    }

    @Override
    public String toString() {
        String message = String.format("%-7s: %s\n", "Name", name);
        message += String.format("%-7s: %d\n", "Age", age);
        message += String.format("%-7s: %s\n", "Gender", gender);
        message += String.format("%-7s: %s\n", "Breed", breed);
        message += String.format("%-7s: %s\n", "Color", color);

        return message;
//        return String.format("%s is a %d years old %s %s %s dog",
//                name, age, gender, breed, color);
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
