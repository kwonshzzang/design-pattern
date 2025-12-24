package kr.co.kwonshzzang.designpattern.abstractfactory.tablefactory;

import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Item;
import kr.co.kwonshzzang.designpattern.abstractfactory.factory.Tray;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<td>\n")
            .append("<table width=\"100%\" border=\"1\"><tr>\n")
            .append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + tray.size() + "\"><b>" + caption + "</b></td>\n")
            .append("</tr>\n")
            .append("<tr>\n");

        for(Item item : tray) {
            buffer.append(item.makeHTML());
        }

        buffer.append("</tr></table>\n");
        buffer.append("</td>\n");
        return buffer.toString();
    }
}
