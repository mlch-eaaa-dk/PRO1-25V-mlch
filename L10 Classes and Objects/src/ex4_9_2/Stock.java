package ex4_9_2;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = 0;
        this.currentPrice = 0;
    }

    @Override
    public String toString() {
        return String.format("Stock(%s, %s, %.2f, %.2f)",
                this.symbol, this.name, this.previousClosingPrice, this.currentPrice
        );
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return (this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice * 100;
    }
}
