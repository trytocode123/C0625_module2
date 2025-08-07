package ss3_oop.bai_tap;

public class RunFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(true, 10);
        Fan fan2 = new Fan(false, 5);
        fan1.setSpeed(3);
        fan1.setColor("yellow");
        fan2.setSpeed(2);

        System.out.println(fan1);
        System.out.println(fan2);
    }
}
