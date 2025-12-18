package kr.co.kwonshzzang.designpattern.prototype.anonymous;

import kr.co.kwonshzzang.designpattern.prototype.framework.Manager;
import kr.co.kwonshzzang.designpattern.prototype.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 준비
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 생성
        Product p1 = manager.create("strong message");
        p1.use("Hello, World");
        Product p2 = manager.create("warning box");
        p2.use("Hello, World");
        Product p3 = manager.create("slash box");
        p3.use("Hello, World");

    }
}
