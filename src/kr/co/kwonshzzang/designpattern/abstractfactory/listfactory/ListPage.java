package kr.co.kwonshzzang.designpattern.abstractfactory.listfactory;

import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Item;
import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Page;

import java.util.Iterator;

public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();

        builder.append("<html lang='ko'><meta charset='utf-8'><head><title>" + title + "</title></head>\n")
            .append("<body>\n")
            .append("<h1>" + title + "</h1>\n")
            .append("<ul>\n");

        for(Item item : content) {
            builder.append(item.makeHTML());
        }

        builder.append("</ul>\n");
        builder.append("<hr><address>" + author + "</address>\n");
        builder.append("</body></html>\n");

        return builder.toString();
    }
}
