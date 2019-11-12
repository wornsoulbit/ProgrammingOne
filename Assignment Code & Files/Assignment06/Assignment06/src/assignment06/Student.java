package assignment06;

/**
 * A class of a student.
 *
 * @author Alex Vasil
 */
public class Student {

    private String name;
    private String gender;
    private String email;
    private String course1;
    private String course2;
    private String course3;

    public Student() {
        this.name = "";
        this.gender = "";
        this.email = "";
        this.course1 = "";
        this.course2 = "";
        this.course3 = "";
    }

    public Student(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = "";
        this.course2 = "";
        this.course3 = "";
    }

    public Student(String name, String gender, String email, String course1,
            String course2, String course3) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }

}
