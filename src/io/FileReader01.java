package io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader reader = new FileReader(file)) {
//            char[] in = new char[30];
//            reader.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;

            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
