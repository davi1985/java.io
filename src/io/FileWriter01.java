package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("learning java and spring boot");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
