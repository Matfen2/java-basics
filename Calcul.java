public class Calcul {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        char operator = '/';

        switch (operator) {
            case '+':
                System.out.println("Résultats : " + (a + b));
                break;
            case '-':
                System.out.println("Résultats : " + (a - b));
                break;
            case '*':
                System.out.println("Résultats : " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Résultats : " + (a / b));
                } else {
                    System.out.println("Division par zéro n'est pas autorisée.");
                }
                break;
            default:
                System.out.println("Opérateur non reconnu.");
        }
    }
}
