package ss17_binary_file;

import ss8_mvc.bai_1.util.ReadFileAndWriteFile;

import java.io.File;
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
        if (!copy(path1, path2)) {
            System.out.println("Can not copied");
        }
    }

    public static boolean copy(String path1, String path2) {
        List<String> stringList = null;
        File f1 = new File(path1);
        File f2 = new File(path2);
        if (!f1.exists()) {
            System.out.println("File source is not exists");
        } else if (f2.exists()) {
            System.out.println("File write is existed");
            System.out.println("Are you sure to override (Y/N)?");
            Scanner sc = new Scanner(System.in);
            String cf = sc.nextLine().toLowerCase();
            if (cf.equals("y")) {
                stringList = ReadFileAndWriteFile.readBinaryFile(path1);
                ReadFileAndWriteFile.writeBinaryFile(path2, stringList);
                System.out.println(f1.length() + " characters copied");
                return true;
            } else {
                System.out.println("Wrong syntax");
            }
        }
        return false;
    }
}
