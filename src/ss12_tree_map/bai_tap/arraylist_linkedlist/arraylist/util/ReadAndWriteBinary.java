package ss12_tree_map.bai_tap.arraylist_linkedlist.arraylist.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteBinary {
    public static <T> void writeBinaryFile(String filePath, List<T> objectList) {
        File file = new File(filePath);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectInputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);
            objectInputStream = new ObjectOutputStream(fileOutputStream);
            objectInputStream.writeObject(objectList);
        } catch (FileNotFoundException e) {
            System.out.println("Find not found");
        } catch (IOException e) {
            System.out.println("Error of writing file");
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("Error of closing file");
            }
        }
    }

    public static <T> List<T> readBinaryFile(String pathFile) {
        List<T> list = new ArrayList<>();
        File file = new File(pathFile);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            if (file.length() > 0) {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                list = (List<T>) objectInputStream.readObject();
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException();
        } catch (FileNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error of reading file");
        }
        return list;

    }
}
