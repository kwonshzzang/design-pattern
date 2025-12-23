package kr.co.kwonshzzang.designpattern.builder.order;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {
    private String filename;                    // 작성할 파일명
    private PrintWriter writer;                 // 파일에 기술할 PrintWriter

    @Override
    protected void buildTitle(String title) {
        filename = "data/" + title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        writer.println("<html lang='ko'><meta charset='utf-8'><head><title>" + title + "</title></head>");
        writer.println("<body>");               // 타이틀 출력
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    protected void buildString(String str) {    // HTML 파일에서의 문자열
        writer.println("<p>" + str + "</p>");   // <p> 태그로 출력
    }


    @Override
    protected void buildItems(String[] items) {
        writer.println("<ul>");                 // <ul>과 <li>로 출력
        for(String item : items) {
            writer.println("<li>" + item + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    protected void buildDone() {
        writer.println("</body></html>");       // 태그를 닫는다
        writer.close();
    }

    public String getResult() {                 // 완성한 문서
        return filename;                        // 파일명을 반환한다.
    }
}
