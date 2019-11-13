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
    private Course course1 = new Course();
    private Course course2 = new Course();
    private Course course3 = new Course();

    public Student() {
        this.name = "";
        this.gender = "";
        this.email = "";
        this.course1 = null;
        this.course2 = null;
        this.course3 = null;
    }

    public Student(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = null;
        this.course2 = null;
        this.course3 = null;
    }

    public Student(String name, String gender, String email, Course course1,
            Course course2, Course course3) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }

    public int calcPassedCourseNum(Course course) {
        int passedCoursesNum = 0;
        return passedCoursesNum;
    }
    
//    public double calcTotalCredit(Course course) {
//        
//    }
    
    public boolean isValidEmail(String email) {
        
        int atSignIdx = this.email.indexOf("@");
        String atSignEmail = this.email.substring(atSignIdx);
        if (atSignEmail.contains("@") && atSignEmail.contains(".")) {
            if (atSignEmail.substring(atSignEmail.indexOf("."), atSignEmail.length()).equals(".")) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
    
    public Student(Student otherStudent) {
        this.name = otherStudent.name;
        this.gender = otherStudent.gender;
        this.email = otherStudent.email;
        this.course1 = otherStudent.course1;
        this.course2 = otherStudent.course2;
        this.course3 = otherStudent.course3;
    }
    
    @Override
    public Student clone() {
        return new Student(this);
    }
    
    public boolean equals(Student otherStudent) {
        return this.name == otherStudent.name 
                && this.gender == otherStudent.gender 
                && this.email == otherStudent.email
                && this.course1 == otherStudent.course1
                && this.course2 == otherStudent.course2
                && this.course3 == otherStudent.course3;
    }
    
    public String toString() {
        String message = String.format("%-10s: %s\n", "Name", name);
        message += String.format("%-10s: %s\n", "Gender", gender);
        message += String.format("%-10s: %s\n", "Email", email);
//        message += String.format("%-10s: %.2f\n");
//        message += String.format("%-10s: %.2f\n", "Passed Courses");
//        message += String.format("%-10s: %.2f\n", "Total Credits");

        return message;
    }
    
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public Course getCourse1() {
        return course1;
    }

    public Course getCourse2() {
        return course2;
    }

    public Course getCourse3() {
        return course3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    public void setCourse3(Course course3) {
        this.course3 = course3;
    }
    
}
