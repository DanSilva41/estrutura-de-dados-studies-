package estrutura.de.dados.Vetores;

/**
 *
 * @author danilo silva
 */
public class HighArrayApp {

    public static void main(String[] args) {
        int maxSize = 10;               // tamanho do vetor
        HighArray arr;                  // referência ao vetor
        arr = new HighArray(maxSize);   // cria o vetor

        arr.insert(77);                 // insere 10 elementos
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();                  // mostra os itens

        int itemBuscado = 35;           // pesquisa item
        if (arr.find(itemBuscado)) {
            System.out.println("Encontrado: " + itemBuscado);
        } else {
            System.out.println("Não encontrado: " + itemBuscado);
        }

        arr.delete(00);                 // remove 3 itens
        arr.delete(55);
        arr.delete(99);

        arr.display();                  // mostra itens novamente
    } // fim do main()
} // FIM 
