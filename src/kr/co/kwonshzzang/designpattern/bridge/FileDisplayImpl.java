package kr.co.kwonshzzang.designpattern.bridge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplayImpl extends DisplayImpl{
   private String fileName;
   private BufferedReader reader;
   private final int MAX_READAHEAD_LIMIT = 4096;  //반복표시할 수 있는 상한(버퍼사이즈)

    public FileDisplayImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(fileName));
            reader.mark(MAX_READAHEAD_LIMIT);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("=-=-=-=-=-=- " + fileName + " -=-=-=-=-=-=-="); // 장식선
    }

    @Override
    public void rawPrint() {
        try {
            String line;
            reader.reset();  // mark한 위치까지 되돌린다.
            while((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void rawClose() {
        System.out.println("=-=-=-=-=-=- "); // 장식선
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
