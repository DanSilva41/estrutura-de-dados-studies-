package estrutura.de.dados.Vetores;

/**
 *
 * @author danilo silva
 */
public class OrdArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;               // tamanho do vetor
        OrdArray arr;                  // referência ao vetor
        arr = new OrdArray(maxSize);   // cria o vetor

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

        int itemBuscado = 37;           // pesquisa item
        if (arr.find(itemBuscado) != arr.size()) {
            System.out.println("Encontrado: " + itemBuscado);
        } else {
            System.out.println("Não encontrado: " + itemBuscado);
        }

        arr.display();                  // mostra os itens

        arr.delete(00);                 // remove 3 itens
        arr.delete(55);
        arr.delete(99);

        arr.display();                  // mostra itens novamente
    } // fim do main()
} // FIM 
