public class Price {
    public static void main(String[] args) {
        double articlePrice = 19.99;
        double tva = 0.20;
        double quantity = 3;

        double totalPrice = articlePrice * quantity * (1 + tva);
        double montantTva = articlePrice * quantity * tva;
        double ttcPrice = articlePrice * quantity + montantTva;
        System.out.println("Le prix total TTC est : " + ttcPrice);
        System.out.println("Le montant de la TVA est : " + montantTva);
        System.out.println("Le prix total est : " + totalPrice);
    }

}
