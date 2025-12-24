package kr.co.kwonshzzang.designpattern.abstractfactory.listfactory;

import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Item;
import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<li>\n")
               .append(caption).append("\n")
               .append("<ul>\n");
        for (Item item : tray) {
            builder.append(item.makeHTML());
        }
        builder.append("</ul>\n")
              .append("</li>\n");
        return builder.toString();
    }
}
