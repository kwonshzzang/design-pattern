package kr.co.kwonshzzang.designpattern.prototype.anonymous;

import kr.co.kwonshzzang.designpattern.prototype.framework.Product;

public class MessageBox extends Product {
    private final char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;

        for(int i = 0; i < length; i++) {
            System.out.print(decochar);
        }
        System.out.println(" ");
        System.out.println(decochar + " " + s + " " + decochar);
        for(int i = 0; i < length; i++) {
            System.out.print(decochar);
        }
        System.out.println(" ");
    }

}
