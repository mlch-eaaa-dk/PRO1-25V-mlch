package ex3;

public class Gift {
    private String description;
    private int price;

    // association Gift --> 1 Person
    private Person giver;

    public Gift(String description, int price, Person giver) {
        this.description = description;
        this.price = price;
        this.giver = giver;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Gift(%s,%d)", description, price);
    }

    public Person getGiver() {
        return giver;
    }

    public void setGiver(Person giver){
        this.giver = giver;
    }
}
