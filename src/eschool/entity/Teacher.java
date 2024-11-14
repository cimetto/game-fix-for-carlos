public class Teacher extends Pessoa {
    // matéria que leciona
    String m;

    public Teacher(String n, int i){
        super(n, i);
    }

    public void darNota(Aluno a, double nota){
        a.n = nota;
        a.materia = m;
    }
}