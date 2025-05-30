package ex1;

public class Dog {
    private int number;
    private String name;

    public Dog(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog(" + number + ", " + name + ")";
    }
}
