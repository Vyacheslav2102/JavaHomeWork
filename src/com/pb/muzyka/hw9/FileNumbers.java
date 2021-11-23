package com.pb.muzyka.hw9;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

public class FileNumbers {
    private String numPath;
    private String oddNumPath;

    public FileNumbers(String path, String oddNumPath) {
        this.numPath = path;
        this.oddNumPath = oddNumPath;
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
    }

    public boolean createNumbersFile(int from, int to) {

        try (FileWriter writer = new FileWriter(numPath, false)) {
            for (int i = from; i <= to; i++)
                if (i % 10 != 0) {
                    writer.write(i + "\t");
                } else {
                    writer.write(i + "\n");
                }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean createOddNumbersFile() {
        try (Scanner reader = new Scanner(new File(numPath)); FileWriter writer = new FileWriter(oddNumPath, false)) {
            while (reader.hasNextInt()) {
                int i = reader.nextInt();
                StringBuilder s = new StringBuilder();
                s.append(i % 2 == 0 ? 0 : i);
                s.append(i % 10 == 0 ? "\n" : "\t");
                writer.write(s.toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

}
