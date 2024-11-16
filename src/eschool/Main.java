package eschool;

import eschool.entity.Student;
import eschool.entity.Teacher;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("João da Silva", 15, "12345");
        Student student2 = new Student("Maria Oliveira", 16, "67890");

        Teacher teacherMath = new Teacher("Carlos Henrique", 40, "T001", "Mathematics");
        Teacher teacherPortuguese = new Teacher("Carlos Rodolfo", 32, "T002", "Portuguese");
        Teacher teacherChemistry = new Teacher("Vitor Ferreira", 65, "T003", "Chemistry");
        Teacher teacherPhysics = new Teacher("Gabriela Araújo", 27, "T004", "Physics");

        teacherMath.assignMathGrade(student1, 8.5);
        teacherMath.assignMathGrade(student2, 7.2);

        teacherPortuguese.assignPortugueseGrade(student1, 6);
        teacherPortuguese.assignPortugueseGrade(student2, 7.8);

        teacherChemistry.assignChemistryGrade(student1, 10);
        teacherChemistry.assignChemistryGrade(student2, 8);

        teacherPhysics.assignPhysicsGrade(student1, 9.1);
        teacherPhysics.assignPhysicsGrade(student2, 7);

        System.out.println("Grades for all students:");
        student1.displayGrades();
        System.out.println("-----------------------------------------");
        student2.displayGrades();
    }
}
