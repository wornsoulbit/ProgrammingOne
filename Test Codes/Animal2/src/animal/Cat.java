
package animal; 

/**
 * A class of cats.
 * 
 * @author Alex Vasil
 */
public class Cat {
    
    private String name;
    private String gender;
    private String breed;
    private String color;
    private int age;

    public Cat() {
        this.name = "";
        this.gender = "";
        this.breed = "";
        this.color = "";
        this.age = -1;
    }
    
    public Cat(String name) {
        this.name = name;
        this.gender = "";
        this.breed = "";
        this.color = "";
        this.age = -1;
    }
    
    public Cat(String name, String gender, String breed, String color, int age) {
        this.name = name;
        this.gender = gender;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }
    
    public void makeSound() {
        System.out.println("Meow!!!, Meow!!!");
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
