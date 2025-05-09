package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileReader reader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(reader)
        ) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
