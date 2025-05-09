package io;

import java.io.File;
import java.io.IOException;

public class File02 {
    public static void main(String[] args) throws IOException {
        File dir = new File("folder");
        var created = dir.mkdir();

        File fileInDir = new File(dir, "file.txt");
        fileInDir.createNewFile();

        File renameFile = new File(dir, "file_rename.txt");
        fileInDir.renameTo(renameFile);
        System.out.println(created);

        File renameDir = new File("folder2");
        dir.renameTo(renameDir);
    }
}
