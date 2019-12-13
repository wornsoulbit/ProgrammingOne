package course;

/**
 * A class of an assessment.
 *
 * @author Alex Vasil
 */
public class Assessment {

    private String name;
    private String category;
    private double weight;

    /**
     * Default constructor of assessment.
     */
    public Assessment() {
        this.name = "";
        this.category = "";
        this.weight = 0;
    }

    /**
     * Constructor with name, category, and weight.
     *
     * @param name the name of the assessment.
     * @param category the category of the assessment.
     * @param weight the weight of the assessment.
     */
    public Assessment(String name, String category, double weight) {
        this.name = name;
        this.category = category;
        this.weight = weight;
    }

    /**
     * A shallow copy of an assessment.
     *
     * @param anotherAssessment the assessment thats being copied.
     */
    public Assessment(Assessment anotherAssessment) {
        this.name = anotherAssessment.name;
        this.category = anotherAssessment.category;
        this.weight = anotherAssessment.weight;
    }

    /**
     * A deep copy of an assessment.
     *
     * @return a new Assessment.
     */
    public Assessment clone() {
        return new Assessment(this);
    }

    /**
     * Prints an output of the name, the category, and the weight of the
     * assessment.
     *
     * @return the formated string.
     */
    @Override
    public String toString() {
        String strOut = "";
        strOut += String.format("%-15s: %s\n", "Assessment Name", name);
        strOut += String.format("%-15s: %s\n", "Category", category);
        strOut += String.format("%-15s: %.2f\n", "Weight", weight);
        return strOut;
    }

    /**
     * Checks to see if two constructors are equal to each other.
     *
     * @param anotherAssessment the course being compared.
     * @return if they are equal to each other.
     */
    public boolean equals(Assessment anotherAssessment) {
        return this.name.equals(anotherAssessment.name)
                && this.category.equals(anotherAssessment.category)
                && this.weight == anotherAssessment.weight;
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
     * @return the category.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Getter.
     *
     * @return the weight.
     */
    public double getWeight() {
        return weight;
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
     * @param category the category.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Setter.
     *
     * @param weight the weight.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
