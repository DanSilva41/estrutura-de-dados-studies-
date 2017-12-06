package estrutura.de.dados.Vetores;

/**
 *
 * @author danilo silva
 */
public class DataArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Jose", 29);
        arr.insert("Velasquez", "Henry", 75);
        arr.insert("Lamarque", "Minh", 54);
        arr.insert("Creswell", "Lucinda", 18);
        arr.insert("Vang", "Mui", 45);

        arr.display();
        System.out.println("Numero de elementos: " + arr.getNElems());

        String nomeASerProcurado = "Stimson";
        Pessoa encontrada = arr.find(nomeASerProcurado);

        if (encontrada != null) {
            System.out.println("Encontrada!");
            encontrada.displayPessoa();
        } else {
            System.out.println("Não encontrada: " + nomeASerProcurado);
        }

        System.out.println("Deletando Lorraine, Yee abd Lucinda");

        arr.remove("Lorraine");
        arr.remove("Yee");
        arr.remove("Lucinda");

        arr.display();
        System.out.println("Numero de elementos: " + arr.getNElems());
    }
}
