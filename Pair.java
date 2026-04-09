public class Pair {
    static boolean estPair(int number) {
        return number % 2 == 0;
    }
    public static void main(String[] args) {
        int number = 10;
        if (estPair(number)) {
            System.out.println(number + " est un nombre pair.");
        } else {
            System.out.println(number + " n'est pas un nombre pair.");
        }
    }
}
