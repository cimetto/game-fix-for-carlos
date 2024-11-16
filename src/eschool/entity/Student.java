package eschool.entity;

public class Student extends Person {
    private String matter;
    private double mathGrade;
    private double portugueseGrade;
    private double chemistryGrade;
    private double physicsGrade;

    public Student(String name, int age, String registration) {
        super(name, age, registration);
    }
    
    public void displayGrades() {
        System.out.println("Student: " + getName());
        System.out.println("Math: " + mathGrade);
        System.out.println("Portuguese: " + portugueseGrade);
        System.out.println("Chemistry: " + chemistryGrade);
        System.out.println("Physics: " + physicsGrade);
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getPortugueseGrade() {
        return portugueseGrade;
    }

    public void setPortugueseGrade(double portugueseGrade) {
        this.portugueseGrade = portugueseGrade;
    }

    public double getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(double chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public double getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(double physicsGrade) {
        this.physicsGrade = physicsGrade;
    }  
}