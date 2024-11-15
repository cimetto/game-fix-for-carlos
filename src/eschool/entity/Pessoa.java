public class Pessoa {
    // nome
    String n;
    String matricula
    // idade
    int i;


    public Pessoa(String n, int i) {
        this.n = n;
        this.i = i;
    }

    protected void vI() {
        if (this.i < 18) {
            System.out.println(nome + " é menor de idade.");
        } else {
            System.out.println(nome + " é maior de idade.");
        }
    }

    // calcular idade
    public int calcI() {
        return 2024 - idade;
    }

    protected void printInfo() {
        System.out.println("Nome completo: " + nome);
        System.out.print("Matricula: " + matricula);
        System.out.println("Idade completa: " + idade);
    }
}