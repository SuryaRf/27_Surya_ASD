package Praktikum09;

public class ScavengerMain27 {
    public static void main(String[] args) {
        ScavengerHunt27 hunt = new ScavengerHunt27();

        // Add points to the scavenger hunt
        hunt.addPoint("Di manakah ibu kota Indonesia?", "Jakarta");
        hunt.addPoint("Apa nama gunung tertinggi di dunia", "Gunung everest");
        hunt.addPoint("Apa nama planet terbesar di tata surya", "Jupiter");

        // Start the scavenger hunt
        hunt.startHunt();
    }
}
