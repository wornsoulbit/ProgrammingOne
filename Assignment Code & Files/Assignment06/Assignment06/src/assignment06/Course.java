package assignment06;

/**
 * A class of a course.
 *
 * @author Alex Vasil
 */
public class Course {

    private String courseName;
    private double credit;
    private double examScore;
    private double assignmentScore;

    /**
     * The default constructor of a course, where the values will be set to: "",
     * 0, 0, 0; courseName, credit, examScore, and assignmentScore respectfully.
     */
    public Course() {
        this.courseName = "";
        this.credit = 0;
        this.examScore = 0;
        this.assignmentScore = 0;
    }

    /**
     * Constructor where a courseName and the number of credits is given.
     *
     * @param courseName the name of the course.
     * @param credit the number of credits a course gives.
     */
    public Course(String courseName, double credit) {
        this.courseName = courseName;
        this.credit = credit;
        this.examScore = 0;
        this.assignmentScore = 0;
    }

    /**
     * Constructor where all values are needed.
     *
     * @param courseName the name of the course.
     * @param credit the number of credits a course gives.
     * @param examScore the mark that is obtained on a exam.
     * @param assignmentScore the mark that is obtained for an assignment.
     */
    public Course(String courseName, double credit, double examScore,
            double assignmentScore) {
        this.courseName = courseName;
        this.credit = credit;
        this.examScore = examScore;
        this.assignmentScore = assignmentScore;
    }

    /**
     * Calculates the final score based on the examScore and assignmentScore.
     *
     * @param examScore the mark that is obtained on a exam.
     * @param assignmentScore the mark that is obtained for an assignment.
     * @return the mark that is obtained.
     */
    public double calcFinalScore(double examScore, double assignmentScore) {
        double examPercentage = 0.6; // 60%
        double assignmentPercentage = 0.4; // 40%
        return (this.examScore * examPercentage)
                + (this.assignmentScore * assignmentPercentage);
    }

    /**
     * Checks to see if the final score is over 60.
     *
     * @param finalScore the final mark that is obtained.
     * @return true or false based on if you obtained over 60.
     */
    public boolean isPassed(double finalScore) {
        double passMark = 60; // 60%
        return finalScore > passMark;
    }

    /**
     * Checks to see if a constructor is equal to another.
     *
     * @param anotherCourse the constructor that is being compared.
     * @return true or false based on if they are equal.
     */
    public boolean equals(Course anotherCourse) {
        return this.courseName == anotherCourse.courseName
                && this.credit == anotherCourse.credit
                && this.examScore == anotherCourse.examScore
                && this.assignmentScore == anotherCourse.assignmentScore;
    }

    /**
     * Formats the data in a table to be outputed.
     *
     * @return the formated table.
     */
    @Override
    public String toString() {
        String message = String.format("%-10s: %s\n", "Course Name", courseName);
        message += String.format("%-10s: %.2f\n", "Credit", credit);
        message += String.format("%-10s: %.2f\n", "Exam Score", examScore);
        message += String.format("%-10s: %.2f\n", "Assignment Score",
                assignmentScore);
        message += String.format("%-10s: %.2f\n", "Final Score",
                calcFinalScore(examScore, assignmentScore));

        return message;
    }

    /**
     * Copies another constructor with the same values.
     *
     * @param otherCourse constructor with the same values as being copied.
     */
    public Course(Course otherCourse) {
        this.courseName = otherCourse.courseName;
        this.credit = otherCourse.credit;
        this.examScore = otherCourse.examScore;
        this.assignmentScore = otherCourse.assignmentScore;
    }

    /**
     * Clones constructors with the same values.
     *
     * @return a new constructor with the same values as the original
     * constructor.
     */
    public Course clone() {
        return new Course(this);
    }

    /**
     * Gets the value of courseName.
     * 
     * @return the value of courseName.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Gets the value of credit.
     * 
     * @return the value of credit.
     */
    public double getCredit() {
        return credit;
    }

    /**
     * Gets the value of examScore.
     * 
     * @return the value of examScore.
     */
    public double getExamScore() {
        return examScore;
    }

    /**
     * Gets the value of assignmentScore.
     * 
     * @return the value of assignmentScore.
     */
    public double getAssignmentScore() {
        return assignmentScore;
    }

    /**
     * Sets the value of courseName.
     * 
     * @param courseName the value of courseName.
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Sets the value of credit.
     * 
     * @param credit the value of credit.
     */
    public void setCredit(double credit) {
        this.credit = credit;
    }

    /**
     * Sets the value of examScore.
     * 
     * @param examScore the value of examScore.
     */
    public void setExamScore(double examScore) {
        this.examScore = examScore;
    }

    /**
     * Sets the value of assignmentScore.
     * 
     * @param assignmentScore the value of assignmentScore.
     */
    public void setAssignmentScore(double assignmentScore) {
        this.assignmentScore = assignmentScore;
    }

}
