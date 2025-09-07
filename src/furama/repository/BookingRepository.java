package furama.repository;

import furama.entity.Booking;
import furama.entity.Facility;
import ss8_mvc.bai_1.util.ReadFileAndWriteFile;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingRepository implements IBookingRepository {
    final static TreeSet<Booking> bookingTreeSet = new TreeSet<>(new BookingComparator());
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final static String filePath = "src/furama/data/booking.csv";

    @Override
    public boolean add(Booking booking) {
        return bookingTreeSet.add(booking);
    }

    @Override
    public TreeSet<Booking> findAll() {
        try {
            List<String> strings = ReadFileAndWriteFile.readFileCSV(filePath);
            String[] array = null;
            for (String str : strings) {
                array = str.split(",");
                bookingTreeSet.add(new Booking(LocalDate.parse(array[1], formatter),
                        LocalDate.parse(array[2], formatter), LocalDate.parse(array[3], formatter), array[4], array[5]));
            }
        } catch (IOException e) {
            System.err.println("Error of reading file");
        }
        return bookingTreeSet;
    }

    public void timeRent(LinkedHashMap<Facility, Integer> linkedHashMap) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<Facility, Integer> entry : linkedHashMap.entrySet()) {
            entry.setValue(0);
            for (Booking booking : bookingTreeSet) {
                if (booking.getIDService().equals(entry.getKey().getiD())) {
                    entry.setValue(entry.getValue() + 1);
                }
            }
            stringList.add(entry.getKey().getInfoToCSV() + entry.getValue());
        }
        try {
            ReadFileAndWriteFile.writeFileCSV("src/furama/data/facility.csv", stringList, false);
        } catch (IOException e) {
            System.out.println("Error of writing file");
        }
    }
}
