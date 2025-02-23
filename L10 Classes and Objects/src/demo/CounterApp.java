package demo;

public class CounterApp {
    public static void main(String[] args) {
        Counter c1 = new Counter("Blue");
        System.out.println(c1);
        c1.click();
        c1.click();
        System.out.println("c1 = " + c1);
        Counter c2 = new Counter("Red");
        System.out.println("c2 = " + c2);
        c2.click();
        c2.click();
        c2.click();
        c2.click();
        c2.click();
        System.out.println("c2 = " + c2);
        c2.setColor("Green");
        System.out.println("Color of c2 is "  + c2.getColor());

//        c2.count = 1000;
//        System.out.println("c2.count = " + c2.getCount());
    }

}
