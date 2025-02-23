package ex4_9_2;

public class TextStock {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);
        System.out.println("Test: " + stock);
        System.out.println();

        double changePercent = stock.getChangePercent();
        System.out.printf("Price-change Percentage %.2f\n", changePercent);
    }
}
