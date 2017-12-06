package estrutura.de.dados.Vetores;

/**
 *
 * @author danilo silva
 */
public class HighArray {

    private long[] a;   // referência do vetor
    private int nElems; // número de itens de dado

    public HighArray(int max) { // construtor
        a = new long[max];      // cria o vetor
        nElems = 0;             // sem itens ainda
    }

    // Busca
    public boolean find(long valor) {
        int j = 0;
        for (j = 0; j < nElems; j++) //para cada elemento
        {
            if (a[j] == valor) //achou o item?
            {
                break;                      // sai do laço antes do fim
            }
        }
        if (j == nElems) // foi até o fim?
        {
            return false;                   // sim, não pode encontrá-lo
        } else {
            return true;                    // sim, o encontrou
        }
    }

    // Insere
    public void insert(long valor) {
        a[nElems] = valor;                  // insere-o 
        nElems++;                           // aumenta o tamanho
    }

    // Remove
    public boolean delete(long valor) {
        int j;
        for (j = 0; j < nElems; j++) // procurá-lo 
        {
            if (a[j] == valor) {
                break;
            }
        }
        if (j == nElems) // não pode encontrá-lo
        {
            return false;
        } else {
            for (int k = j; k < nElems && ++k < nElems; k++) //move mais altos para baixo(boa abordagem)
            {
                a[k] = a[k + 1];
            }
        }
        nElems--;           // diminui tamanho
        return true;
    }

    // Mostra o conteúdo do vetor
    public void display() {
        for (int j = 0; j < nElems; j++) {  // para cada elemento
            System.out.print(a[j] + "");    // mostrá-lo
            System.out.println("");
        }
    }
} // FIM
