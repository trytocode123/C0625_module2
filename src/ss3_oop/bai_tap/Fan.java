package ss3_oop.bai_tap;

public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private boolean on = false;
    private int radius = 5;
    private int speed = SLOW;
    private String color = "blue";


    public Fan() {

    }

    public Fan(boolean on, int radius) {
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return this.isOn() ? "Speed: " + this.getSpeed() + "," + " color: " + this.getColor() + ", radius: " + this.getRadius() + ", fan is on " :
                "Speed: " + this.getSpeed() + ", color: " + this.getColor() + ", radius: " + getRadius() + ", fan is off ";
    }


//    @Override
//    public String toString() {
//        return "Fan{" +
//                "on=" + on +
//                ", radius=" + radius +
//                ", speed=" + speed +
//                ", color='" + color + '\'' +
//                '}';
//    }
}
