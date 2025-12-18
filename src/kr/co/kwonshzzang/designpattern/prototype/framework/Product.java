package kr.co.kwonshzzang.designpattern.prototype.framework;

public abstract class Product implements Cloneable {
    public abstract void use(String s);

    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return p;
    }
}
