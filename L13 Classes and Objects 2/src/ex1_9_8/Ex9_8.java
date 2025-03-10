package ex1_9_8;

public class Ex9_8 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1);


        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        System.out.println(fan2);
    }
}
