package ex1_9_8;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        //this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    @Override
    public String toString() {
        String speedStr;
        if (speed == SLOW) speedStr = "slow";
        else if (speed == MEDIUM) speedStr = "medium";
        else if (speed == FAST) speedStr = "fast";
        else speedStr = "Error"; // should never happen

//        String speedStr = switch (speed) {
//            case SLOW -> "slow";
//            case MEDIUM -> "medium";
//            case FAST -> "fast";
//            default -> "Error"; // should never happen
//        };

        if (on) {
            return String.format("Fan(%s, %s, %.0f)", speedStr, color, radius);
        } else {
            return String.format("Fan(fan is off, %s, %.0f)", color, radius);
        }
    }

    public int getSpeed() {
        return speed;
    }

    /** Pre: speed is SLOW(1), MEDIUM(2) or FAST(3). */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    /** Pre: radius > 0. */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
