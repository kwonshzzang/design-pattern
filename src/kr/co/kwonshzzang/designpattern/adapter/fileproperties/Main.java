package kr.co.kwonshzzang.designpattern.adapter.fileproperties;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();

        try {
            f.readFromFile("data/file.txt");
            f.setValue("year", "2025");
            f.setValue("month", "12");
            f.setValue("day", "12");
            f.writeToFile("data/newfile.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
