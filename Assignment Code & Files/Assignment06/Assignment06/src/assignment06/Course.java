package assignment06;

/**
 *
 * @author Alex Vasil
 */
public class Course {

    private String courseName;
    private double credit;
    private double examScore;
    private double assignmentScore;

    public Course() {
        this.courseName = "";
        this.credit = 0;
        this.examScore = 0;
        this.assignmentScore = 0;
    }

    public Course(String courseName, double credit) {
        this.courseName = courseName;
        this.credit = credit;
        this.examScore = 0;
        this.assignmentScore = 0;
    }

    public Course(String courseName, double credit, double examScore, double assignmentScore) {
        this.courseName = courseName;
        this.credit = credit;
        this.examScore = examScore;
        this.assignmentScore = assignmentScore;
    }

    @Override
    public String toString() {
        String message = String.format("%-10s: %.2f\n", "Course Name", courseName);
        message += String.format("%-10s: %.2f\n", "Credit", credit);
        message += String.format("%-10s: %.2f\n", "Exam Score", examScore);
        message += String.format("%-10s: %.2f\n", "Assignment Score", assignmentScore);
        message += String.format("%-10s: %.2f\n", "Final Score", assignmentScore);

        return message;
    }

    public Course(Course otherCourse) {
        this.courseName = otherCourse.courseName;
        this.credit = otherCourse.credit;
        this.examScore = otherCourse.examScore;
        this.assignmentScore = otherCourse.assignmentScore;
    }
    
    public Course clone() {
        return new Course(this);
    }
    
    public String getCourseName() {
        return courseName;
    }

    public double getCredit() {
        return credit;
    }

    public double getExamScore() {
        return examScore;
    }

    public double getAssignmentScore() {
        return assignmentScore;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }

    public void setAssignmentScore(double assignmentScore) {
        this.assignmentScore = assignmentScore;
    }

}
