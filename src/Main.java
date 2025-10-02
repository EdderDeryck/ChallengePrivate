
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Deryck", 18, "Deryck", "12345678909", "87999519795");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Sobrenome: " + pessoa.getSobrenome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Usuário tem CPF válido?: " + pessoa.validarCpf());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("\n");
        pessoa.setIdade(-18);
    }
}