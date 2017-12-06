package estrutura.de.dados.Vetores;

/**
 * Usa a classe Pessoa
 *
 * @author danilo silva
 */
public class DataArray {

    private Pessoa[] pessoas;
    private int nElems;

    public DataArray(int max) {
        pessoas = new Pessoa[max];
        nElems = 0;
    }

    public Pessoa find(String nome) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (pessoas[j].getUltimo().equals(nome)) {
                break;
            }
        }

        if (j == nElems) {
            return null;
        } else {
            return pessoas[j];
        }
    }

    public void insert(String ultimoNome, String primeiroNome, int idade) {
        pessoas[nElems] = new Pessoa(ultimoNome, primeiroNome, idade);
        nElems++;
    }

    public boolean remove(String nome) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (pessoas[j].getUltimo().equals(nome)) {
                break;
            }
        }

        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems; k++) {
                pessoas[k] = pessoas[k + 1];
                nElems--;
            }
        }
        return true;
    }

    public void display() {
        for (int j = 0; j < 10; j++) {
            pessoas[j].displayPessoa();
        }
    }

    public int getNElems() {
        return nElems;
    }
}
