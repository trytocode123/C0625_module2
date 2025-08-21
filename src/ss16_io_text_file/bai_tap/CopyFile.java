package ss16_io_text_file.bai_tap;

import ss8_mvc.bai_1.util.ReadFileAndWriteFile;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Copy file, enter path 1 and path 2:");
        System.out.println("Path 1");
        String path1 = sc.nextLine();
        System.out.println("Path 2");
        String path2 = sc.nextLine();
        if (copy(path1, path2)) {
            System.out.println("Copied");
        } else {
            System.out.println("Can not copied");
        }
    }

    public static boolean copy(String path1, String path2) {
        List<String> stringList = null;
        try {
            stringList = ReadFileAndWriteFile.readFileCSV(path1);
            ReadFileAndWriteFile.writeFileCSV(path2, stringList, true);
            return true;
        } catch (IOException e) {
            System.out.println("Error of reading file");
        }
        return false;
    }
}
