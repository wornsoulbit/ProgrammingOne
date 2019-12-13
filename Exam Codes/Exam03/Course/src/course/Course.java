package course;

/**
 * A class of a course.
 *
 * @author Alex Vasil
 */
public class Course {

    private String courseName;
    private int credit;
    private Assessment assessment1;
    private Assessment assessment2;
    private Assessment assessment3;
    private Assessment assessment4;

    /**
     * Default constructor of a Course.
     */
    public Course() {
        this.courseName = "";
        this.credit = 0;
        this.assessment1 = new Assessment();
        this.assessment2 = new Assessment();
        this.assessment3 = new Assessment();
        this.assessment4 = new Assessment();
    }

    /**
     * Constructor of a Course with a courseName.
     *
     * @param courseName name of the course.
     */
    public Course(String courseName) {
        this.courseName = courseName;
        this.credit = 0;
        this.assessment1 = new Assessment();
        this.assessment2 = new Assessment();
        this.assessment3 = new Assessment();
        this.assessment4 = new Assessment();
    }

    /**
     * Constructor with all parameters.
     *
     * @param courseName the name of the course.
     * @param credit the amount of credits for the course.
     * @param assessment1 the first assessment.
     * @param assessment2 the second assessment.
     * @param assessment3 the third assessment.
     * @param assessment4 the fourth assessment.
     */
    public Course(String courseName, int credit, Assessment assessment1,
            Assessment assessment2, Assessment assessment3, Assessment assessment4) {
        this.courseName = courseName;
        this.credit = credit;
        this.assessment1 = assessment1;
        this.assessment2 = assessment2;
        this.assessment3 = assessment3;
        this.assessment4 = assessment4;
    }

    /**
     * A shallow copy of a course.
     *
     * @param anotherCourse the course thats being copied.
     */
    public Course(Course anotherCourse) {
        this.courseName = anotherCourse.courseName;
        this.credit = anotherCourse.credit;
        this.assessment1 = anotherCourse.assessment1;
        this.assessment2 = anotherCourse.assessment2;
        this.assessment3 = anotherCourse.assessment3;
        this.assessment4 = anotherCourse.assessment4;
    }

    /**
     * Checks to see if the weights of the assessments are equal to 100.
     *
     * @return if they are equal to 100.
     */
    public boolean isCourseValid() {
        return assessment1.getWeight() + assessment2.getWeight()
                + assessment3.getWeight() + assessment4.getWeight() == 100;
    }

    /**
     * Converts the string to Titlecase.
     *
     * @param strIn the inputed String.
     * @return the string in Title case.
     */
    public String toTitlecase(String strIn) {
        String strOut = "";
        strOut += Character.toUpperCase(strIn.charAt(0));
        for (int i = 1; i < strIn.length(); i++) {
            if (strIn.charAt(i) != ' ') {
                strOut += Character.toLowerCase(strIn.charAt(i));
            } else {
                strOut += " " + Character.toUpperCase(strIn.charAt(i + 1));
                i++;
            }
        }
        return strOut;
    }

    /**
     * Converts the string to camel case.
     *
     * @param strIn the inputed String.
     * @return the string in camel case.
     */
    public String toCamelcase(String strIn) {
        strIn = strIn.trim();
        String strOut = "";
        strOut += Character.toUpperCase(strIn.charAt(0));
        for (int i = 1; i < strIn.length(); i++) {
            if (strIn.charAt(i) != ' ') {
                strOut += strIn.charAt(i);
            } else {
                strOut += Character.toUpperCase(strIn.charAt(i + 1));
                i++;
            }
        }
        return strOut;
    }

    /**
     * Prints an output of the course name, credits, and the 4 assessments.
     *
     * @return the formated string.
     */
    @Override
    public String toString() {
        String strOut = "";
        strOut += String.format("%-15s: %s\n", "Course Name", courseName);
        strOut += String.format("%-15s: %d\n", "Credit", credit);
        strOut += String.format("%-15s: %.2f\n", "Assignment1", assessment1.getWeight());
        strOut += String.format("%-15s: %.2f\n", "Assignment2", assessment2.getWeight());
        strOut += String.format("%-15s: %.2f\n", "Exam1", assessment3.getWeight());
        strOut += String.format("%-15s: %.2f\n", "Exam2", assessment4.getWeight());
        return strOut;
    }

    /**
     * Checks to see if two constructors are equal to each other.
     *
     * @param anotherCourse the course being compared.
     * @return if they are equal to each other.
     */
    public boolean equals(Course anotherCourse) {
        return this.courseName.equals(anotherCourse.courseName)
                && this.credit == anotherCourse.credit
                && this.assessment1.equals(anotherCourse.assessment1)
                && this.assessment2.equals(anotherCourse.assessment2)
                && this.assessment3.equals(anotherCourse.assessment3)
                && this.assessment4.equals(anotherCourse.assessment4);
    }

    /**
     * Gets the course name.
     *
     * @return the course name.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Gets the credits.
     *
     * @return the credits.
     */
    public int getCredit() {
        return credit;
    }

    /**
     * Gets assessment1.
     *
     * @return assessment1.
     */
    public Assessment getAssessment1() {
        return assessment1;
    }

    /**
     * Gets assessment2.
     *
     * @return assessment2.
     */
    public Assessment getAssessment2() {
        return assessment2;
    }

    /**
     * Gets assessment3.
     *
     * @return assessment3.
     */
    public Assessment getAssessment3() {
        return assessment3;
    }

    /**
     * Gets assessment4.
     *
     * @return assessment4.
     */
    public Assessment getAssessment4() {
        return assessment4;
    }

    /**
     * Sets the course name.
     *
     * @param courseName the name of the course.
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Sets the credits.
     *
     * @param credit the credits.
     */
    public void setCredit(int credit) {
        this.credit = credit;
    }

    /**
     * Sets the assessment1.
     *
     * @param assessment1 the value of assessment1.
     */
    public void setAssessment1(Assessment assessment1) {
        this.assessment1 = assessment1;
    }

    /**
     * Sets the assessment2.
     *
     * @param assessment2 the value of assessment2.
     */
    public void setAssessment2(Assessment assessment2) {
        this.assessment2 = assessment2;
    }

    /**
     * Sets the assessment3.
     *
     * @param assessment3 the value of assessment3.
     */
    public void setAssessment3(Assessment assessment3) {
        this.assessment3 = assessment3;
    }

    /**
     * Sets the assessment4.
     *
     * @param assessment4 the value of assessment4.
     */
    public void setAssessment4(Assessment assessment4) {
        this.assessment4 = assessment4;
    }
}
