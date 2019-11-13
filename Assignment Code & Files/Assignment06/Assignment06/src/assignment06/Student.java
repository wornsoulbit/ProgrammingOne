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

    public Student() {
        this.name = "";
        this.gender = "";
        this.email = "";
        this.course1 = new Course();
        this.course2 = new Course();
        this.course3 = new Course();
    }

    public Student(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course1 = new Course();
        this.course2 = new Course();
        this.course3 = new Course();
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

    public boolean isValidEmail() {
        int atSignIdx = this.email.indexOf("@");
        int atDotIdx = this.email.lastIndexOf("."); // ww.alex@gmail.qc.ca
        
        if (atSignIdx == -1 || atDotIdx == -1) 
            return false;
        
        return atSignIdx != 0 && atDotIdx - atSignIdx != 1 
                && atDotIdx != this.email.length() - 1;
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
        return this.name.equals(otherStudent.name)
                && this.gender.equals(otherStudent.gender)
                && this.email.equals(otherStudent.email)
                && this.course1 == otherStudent.course1
                && this.course2 == otherStudent.course2
                && this.course3 == otherStudent.course3;
    }

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
