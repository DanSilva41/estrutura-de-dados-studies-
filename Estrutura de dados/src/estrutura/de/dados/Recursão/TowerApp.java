package estrutura.de.dados.Recursão;

/**
 *
 * @author danilo silva
 */
public class TowerApp {

    static int nDiscos = 3;

    public static void main(String[] args) {
        doTowers(nDiscos, 'A', 'B', 'C');
    }

    public static void doTowers(int topN, char from, char inter, char to) {
        if (topN == 1) {
            System.out.println("Disco 1 de " + from + " para " + to);
        } else {
            doTowers(topN - 1, from, to, inter);
            System.out.println("Disco " + topN + " de " + from + " para " + to);
            doTowers(topN - 1, inter, from, to);
        }
    }
}
