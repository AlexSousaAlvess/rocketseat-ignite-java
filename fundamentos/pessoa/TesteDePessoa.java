package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.setCpf("03830919344");
        professor.setNome("Alex");
        professor.setIdade(33);
        professor.setSalario(50000);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();

        aluno.setCpf("123456789");
        aluno.setIdade(19);
        aluno.setNome("Fernanda");
        System.out.println(aluno.imprimirDadosDaPessoa());
        
    }
    
}
