public class Aluno {
    private String nome;
    private int RA;
    private int[]  notas;

    public Aluno (String nome, int RA, int nota1, int nota2, int nota3){
        this.nome = nome;
        this.RA = RA;
        this.notas = new int[] {nota1, nota2, nota3};
    }

    public String falar(){
        return "Aluno: " + nome + "\n" + "RA: " + RA + "\n" + "Nota 1: " + notas[0] + "\n" + "Nota 2: " + notas[1] + "\n" + "Nota 3: " + notas[2] + "\n" + "Total de notas: " + getTotalNotas() + "\n";
    }

    public String getNome() {
        return nome;
    }

    public int getRA() {
        return RA;
    }

    public int getTotalNotas() {
        int total = 0;
        for(int nota : notas){
            total += nota;
        }
        return total;
    }
}