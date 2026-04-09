public class Note {
    public static void main(String[] args) {
        int note = 85;

        if (note >= 90) {
            System.out.println("Excellent");
        } else if (note >= 80) {
            System.out.println("Très bien");
        } else if (note >= 70) {
            System.out.println("Bien");
        } else if (note >= 60) {
            System.out.println("Passable");
        } else {
            System.out.println("Insuffisant");
        }
    }
}
