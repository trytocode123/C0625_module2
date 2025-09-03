package furama.view;

import furama.entity.Facility;

import java.util.LinkedHashMap;
import java.util.Map;


public class FacilityView {
    public static void display(LinkedHashMap<Facility, Integer> facilities) {
        String line = "+------------+-----------------+-------------+-----------------+--------+--------------+-------------------+--------+--------------+-----------+-----------------+----------------+";

        String header = String.format(
                "| %-10s | %-15s | %-11s | %-15s | %-6s | %-12s | %-17s | %-6s | %-12s | %-9s | %-15s | %-14s |",
                "ID", "Name", "Area Use", "Fee Rent", "People", "Type Rent",
                "Standard House", "Floors", "Free Service", "Pool Area", "Standard Villa", "Time of using"
        );

        System.out.println(line);
        System.out.println(header);
        System.out.println(line);

        for (Map.Entry<Facility, Integer> entry : facilities.entrySet()) {
            System.out.println(entry.getKey().toTableRow(entry.getValue()));
        }

        System.out.println(line);
    }
}
