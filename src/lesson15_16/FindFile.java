package lesson15_16;

import java.io.*;
import java.util.*;

class FindFile {
    public void findFile(String name, File directory) {
        File[] list = directory.listFiles();
        if (list != null)
            for (File file : list) {
                if (file.isDirectory()) {
                    findFile(name, file);
                } else if (name.equalsIgnoreCase(file.getName())) {
                    System.out.println(file.getAbsolutePath());
                }
            }
    }

    public static void main(String[] args) {
        FindFile ff = new FindFile();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String name = scan.next();
        System.out.println("Enter the directory name:");
        String directory = scan.next();
        if (new File(directory).exists()) {
            ff.findFile(name, new File(directory));
        } else {
            System.out.println("Directory does not exist");
        }
    }
}
