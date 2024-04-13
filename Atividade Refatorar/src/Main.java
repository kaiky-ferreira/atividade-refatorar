public class Main {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("João", 123456, 25,  30, 35);
        Aluno aluno2 = new Aluno("Maria", 654321, 20, 30, 40);

        System.out.println(aluno1.falar());
        System.out.println(aluno2.falar());

    }
}