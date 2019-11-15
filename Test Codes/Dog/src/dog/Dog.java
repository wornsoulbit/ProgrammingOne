package dog;

/**
 *
 * @author Alex Vasil
 */
public class Dog {

    private String name;
    private int age;
    private boolean alive;
    private final static int MAX_AGE = 15;

    public Dog() {
        this.name = "";
        this.age = 0;
        this.alive = true;
    }

    public Dog(String name, int age, boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public boolean isAgeValid(int age) {
        return age <= MAX_AGE;
    }

    public Dog(Dog anotherDog) {
        this.name = anotherDog.name;
        this.age = anotherDog.age;
        this.alive = anotherDog.alive;
    }

    @Override
    public String toString() {
        return String.format("%s is a %d years old dog. It is %s",
                name, age, alive ? "still alive" : "X_X");
    }

    public boolean equals(Dog anotherDog) {
        return name.equals(anotherDog.name)
                && age == anotherDog.age
                && alive == anotherDog.alive;
    }

    public void increaseAge() {
        if (!alive) 
            return;
        
        if (age == MAX_AGE) {
            alive = false;
            return;
        }
        age++;
    }

    @Override
    public Dog clone() {
        return new Dog(this);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getAlive() {
        return alive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (isAgeValid(age))
            this.age = age;
    }

    public boolean setAlive(boolean alive) {
        return this.alive = alive;
    }
}
