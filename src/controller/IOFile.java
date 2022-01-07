package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Phuc
 */
public class IOFile {

    public static <T> List<T> doc(String fileName) {
        List<T> list = new ArrayList<>();
        try {
            ObjectInputStream i = new ObjectInputStream(new FileInputStream(fileName));
            list = (List<T>) i.readObject();
            i.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        return list;
    }

    public static <T> void ghi(String fileName, List<T> list) {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fileName));
            o.writeObject(list);
            o.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
