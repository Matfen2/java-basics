public class CalcTable {
    int[] notes = {10, 15, 20, 5, 12};

    public double calculerMoyenne() {
        int sum = 0;
        for (int note : notes) {
            sum += note;
        }
        return (double) sum / notes.length;
    }

    public static void main(String[] args) {
        CalcTable calcTable = new CalcTable();
        System.out.println("La moyenne des notes est : " + calcTable.calculerMoyenne());
    }
}
