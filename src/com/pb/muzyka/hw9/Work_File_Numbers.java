package com.pb.muzyka.hw9;

public class Work_File_Numbers {
    public static void main(String[] args) {
        FileNumbers f = new FileNumbers("numbers.txt", "odd-numbers.txt");
        f.createNumbersFile(1,99);
        f.createOddNumbersFile();
    }
}
