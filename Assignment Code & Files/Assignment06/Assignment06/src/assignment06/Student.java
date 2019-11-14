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
    private Course course1;
    private Course course2;
    private Course course3;

    /**
     * Default constructor of a Student.
     */
    public Student() {
        this.name = "";
        this.gender = "";
        this.email = "";
        this.course1 = new Course();
        this.course2 = new Course();
        this.course3 = new Course();
    }

    /**
     * Constructor of a student with a name, gender and email defined.
     * 
     * @param name the name.
     * @param gender the gender.
     * @param email the email.
     */
    public Student(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = new Course();
        this.course2 = new Course();
        this.course3 = new Course();
    }

    /**
     * Constructor of a student with a name, gender, email, course1, course2
     * and course3 defined.
     * 
     * @param name the name.
     * @param gender the gender.
     * @param email the email.
     * @param course1 Course 1.
     * @param course2 Course 2.
     * @param course3 Course 3.
     */
    public Student(String name, String gender, String email, Course course1,
            Course course2, Course course3) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }

    /**
     * Calculates how many courses have been passed.
     * 
     * @return the number of courses passed.
     */
    public int calcPassedCourseNum() {
        int passedCourses = 0;
        if (this.course1.isPassed())
            passedCourses++;
        
        if (this.course2.isPassed())
            passedCourses++;
        
        if (this.course3.isPassed())
            passedCourses++;
        
        return passedCourses;
    }

    /**
     * Calculates how many credits a student gets if they pass a course.
     * 
     * @return the total credits that a student got.
     */
    public double calcTotalCredit() {
        double totalCredits = 0;
        if (this.course1.isPassed()) 
            totalCredits += this.course1.getCredit();
        
        if (this.course2.isPassed()) 
            totalCredits += this.course2.getCredit();
        
        if (this.course3.isPassed()) 
            totalCredits += this.course3.getCredit();
        
        return totalCredits;
    }

    /**
     * Checks to see if the email inputed is valid or not.
     * 
     * @return if its a valid email it'll return true, otherwise false.
     */
    public boolean isValidEmail() {
        int atSignIdx = this.email.indexOf("@");
        int atDotIdx = this.email.lastIndexOf("."); // ww.alex@gmail.qc.ca
        
        if (atSignIdx == -1 || atDotIdx == -1) 
            return false;
        
        return atSignIdx != 0 && atDotIdx - atSignIdx != 1 
                && atDotIdx != this.email.length() - 1;
        }

    /**
     * Copy constructor.
     * 
     * @param otherStudent the copied circle.
     */
    public Student(Student otherStudent) {
        this.name = otherStudent.name;
        this.gender = otherStudent.gender;
        this.email = otherStudent.email;
        this.course1 = otherStudent.course1;
        this.course2 = otherStudent.course2;
        this.course3 = otherStudent.course3;
    }

    /**
     * A copy of Student.
     * 
     * @return a copy of a Student.
     */
    @Override
    public Student clone() {
        return new Student(this);
    }

    /**
     * Checks if two students are the same.
     * 
     * @param otherStudent the other student to compare.
     * @return to check if two students are the same.
     */
    public boolean equals(Student otherStudent) {
        return this.name.equals(otherStudent.name)
                && this.gender.equals(otherStudent.gender)
                && this.email.equals(otherStudent.email)
                && this.course1 == otherStudent.course1
                && this.course2 == otherStudent.course2
                && this.course3 == otherStudent.course3;
    }

    /**
     * To generate a string to represent the student.
     * 
     * @return a generated string.
     */
    @Override
    public String toString() {
        String message = String.format("%-15s: %s\n", "Name", name);
        message += String.format("%-15s: %s\n", "Gender", gender);
        message += String.format("%-15s: %s\n", "Email", email);
        message += String.format("%-16s", "Course");
        message += String.format("%-29s", "Name");
        message += String.format("%-10s", "Credit");
        message += String.format("%s", "Score");
        message += String.format("\n------------------------------------------------------------\n");

        message += String.format("\n%-15s: %-27s %-9.1f %.2f", "Course 1",
                course1.getCourseName(), course1.getCredit(),
                course1.calcFinalScore());

        message += String.format("\n%-15s: %-27s %-9.1f %.2f", "Course 2",
                course2.getCourseName(), course2.getCredit(),
                course2.calcFinalScore());

        message += String.format("\n%-15s: %-27s %-9.1f %.2f\n", "Course 3",
                course3.getCourseName(), course3.getCredit(),
                course3.calcFinalScore());

        message += String.format("\n%-15s: %d", "Passed Course", calcPassedCourseNum());
        message += String.format("\n%-15s: %.2f", "Total Credit", calcTotalCredit());

        return message;
    }

    /**
     * Getter.
     * 
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter.
     * 
     * @return the gender.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Getter.
     * 
     * @return the email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Getter.
     * 
     * @return the values of course1.
     */
    public Course getCourse1() {
        return course1;
    }

    /**
     * Getter.
     * 
     * @return the values of course2.
     */
    public Course getCourse2() {
        return course2;
    }

    /**
     * Getter.
     * 
     * @return the values of course3.
     */
    public Course getCourse3() {
        return course3;
    }

    /**
     * Setter.
     * 
     * @param name the name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter.
     * 
     * @param gender the gender.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Setter.
     * 
     * @param email the email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Setter.
     * 
     * @param course1 the first course.
     */
    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    /**
     * Setter.
     * 
     * @param course2 the second course.
     */
    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    /**
     * Setter.
     * 
     * @param course3 the third course.
     */
    public void setCourse3(Course course3) {
        this.course3 = course3;
    }

}
