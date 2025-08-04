package ss1_tong_quan_java.thuc_hanh;

import java.util.Date;

public class SystemTime {
    public static Date getDate() {
        Date now = new Date();
        return now;
    }

    public static void main(String[] args) {
        System.out.println("Now is " + getDate());
    }
}
