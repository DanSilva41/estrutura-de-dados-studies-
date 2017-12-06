package estrutura.de.dados.Vetores;

/**
 * Campo-chave = ultimoNome
 *
 * @author danilo silva
 */
public class Pessoa {

    private String ultimoNome;
    private String primeiroNome;
    private int idade;

    public Pessoa(String ultimoNome, String primeiroNome, int idade) {
        this.ultimoNome = ultimoNome;
        this.primeiroNome = primeiroNome;
        this.idade = idade;
    }

    public void displayPessoa() {
        System.out.println("Último nome: " + ultimoNome);
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
    }

    public String getUltimo() {
        return ultimoNome;
    }
}
