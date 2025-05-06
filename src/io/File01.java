package io;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class File01 {
    public static void main(String[] args) {
        File file = new File("file01.txt");

        try {
            var fileCreated = file.createNewFile();
            System.out.println("creating file ..." + fileCreated);

            System.out.println("path: " + file.getAbsolutePath());
            System.out.println("is directory: " + file.isDirectory());
            System.out.println("is file: " + file.isFile());
            System.out.println("is hidden: " + file.isHidden());
            System.out.println("last modified: " + Instant.ofEpochMilli(file.lastModified())
                    .atZone(ZoneId.systemDefault())
                    .toLocalDateTime());
            System.out.println("is hidden: " + file.isHidden());

            if (file.isFile()) {
                System.out.println("deleting file ..." + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
