public class Status {
    public static void main(String[] args) {
        int age = 30;

        if (age < 18) {
            System.out.println("Vous êtes mineur.");
        } else if (age >= 18 && age < 65) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes senior.");
        }
    }
}
