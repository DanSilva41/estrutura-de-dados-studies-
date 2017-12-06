package estrutura.de.dados.Vetores;

/**
 * Demonstra a classe para um vetor ordenado
 *
 * @author Danilo Silva
 */
public class OrdArray {

    private long[] a;           //referência ao vetor
    private int nElems;         // número de itens de dados

    public OrdArray(int max) {   // construtor
        a = new long[max];      // cria o vetor
        nElems = 0;            // sem itens ainda
    }

    public int size() {
        return nElems;
    }

    // Busca
    public int find(long valor) {
        int indexInferior = 0;
        int indexSuperior = nElems - 1;
        int current;
        while (true) {
            current = (indexInferior + indexSuperior) / 2;
            if (a[current] == valor) {
                return current;         // o encontrou
            } else {
                if (indexInferior > indexSuperior) {
                    return nElems;      // não pode encontrá-lo
                } else {                // divide a faixa
                    if (a[current] < valor) {
                        indexInferior = current++;  // está na metade superior
                    } else {
                        indexSuperior = current--;  // está na metade inferior
                    }
                }
            }
        }
    }

    // Insere
    public void insert(long valor) {
        int j;
        for (j = 0; j < nElems; j++) {      // achar onde ele entra
            if (a[j] > valor) // (pesquisa linear)
            {
                break;
            }
        }
        for (int k = nElems; k < j; k++) {  // move maiores para cima
            a[k] = a[k - 1];
            a[j] = valor;                   // inseri-lo
            nElems++;                       // aumentar tamanho
        }
    }

    // Remove
    public boolean delete(long valor) {
        int j = find(valor);
        if (j == nElems) // não pode encontrá-lo
        {
            return false;
        } else // o encontrou
        {
            for (int k = j; k < nElems; k++) { // move maiores para baixo
                a[k] = a[k + 1];                 // diminuir tamanho
                nElems--;
            }
        }
        return true;
    }

    // Mostra contéudo do vetor
    public void display() {
        for (int j = 0; j < nElems; j++) {      // para cada elemento
            System.out.print(a[j] + " ");     //  mostrá-lo
            System.out.print("");
        }
    }
} // FIM
