package kr.co.kwonshzzang.designpattern.abstractfactory.tablefactory;

import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Item;
import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Page;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();

        builder.append("<html lang='ko'><meta charset='utf-8'><head><title>" + title + "</title></head>\n")
                .append("<body>\n")
                .append("<h1>" + title + "</h1>\n")
                .append("<table width=\"80%\" border=\"3\">\n");

        for(Item item : content) {
            builder.append("<tr>" + item.makeHTML() + "</tr>\n");
        }

        builder.append("</table>\n");
        builder.append("<hr><address>" + author + "</address>\n");
        builder.append("</body></html>\n");

        return builder.toString();
    }
}
