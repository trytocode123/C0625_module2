package furama.view;

import furama.entity.Facility;

import java.util.LinkedHashMap;
import java.util.Map;


public class FacilityView {
    public static void display(LinkedHashMap<Facility, Integer> facilities) {
        for (Map.Entry<Facility, Integer> entry : facilities.entrySet()) {
            System.out.println(entry.getKey() + "Time of using: " + entry.getValue() + (entry.getValue() <= 1 ? " time" : " times"));
        }
    }
}
