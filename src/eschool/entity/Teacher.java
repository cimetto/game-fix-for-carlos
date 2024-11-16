package eschool.entity;

public class Teacher extends Person {
    private String matter;

    public Teacher(String name, int age, String registration, String matter) {
        super(name, age, registration);
        this.matter = matter;
    }
    
    @Override
    public void infoPerson() {
        super.infoPerson();
        System.out.format("Matter: %s\n", matter);
    }

    public void assignMathGrade(Student student, double grade) {
        student.setMathGrade(grade);
    }

    public void assignPortugueseGrade(Student student, double grade) {
        student.setPortugueseGrade(grade);
    }

    public void assignChemistryGrade(Student student, double grade) {
        student.setChemistryGrade(grade);
    }

    public void assignPhysicsGrade(Student student, double grade) {
        student.setPhysicsGrade(grade);
    }
}
