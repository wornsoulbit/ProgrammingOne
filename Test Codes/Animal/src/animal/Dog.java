package animal;

/**
 * Class of a dog.
 *
 * @author Alex Vasil
 */
public class Dog {

    private String name;
    private String breed;
    private String colour;
    private char gender;
    private int age;

    public Dog() {
        this.name = "";
        this.age = -1;
        this.gender = 0;
        this.breed = "";
        this.colour = "";
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
    
    public Dog (String name) {
        this.name = name;
        this.age = -1;
        this.gender = 0;
        this.breed = "";
        this.colour = "";
    }

    public String getName() {
        return name.substring(0, 1);
    }
    
    public String getBreed() {
        return breed;
    }
    
    public char getGender() {
        return gender;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
}
