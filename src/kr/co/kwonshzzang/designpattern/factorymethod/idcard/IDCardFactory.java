package kr.co.kwonshzzang.designpattern.factorymethod.idcard;

import kr.co.kwonshzzang.designpattern.factorymethod.framework.Factory;
import kr.co.kwonshzzang.designpattern.factorymethod.framework.Product;

import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    private final Map<Integer, Product> database = new HashMap<Integer, Product>();
    private int serial = 100;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        database.put(serial++, product);
    }

    public Map<Integer, Product> getOwners() {
        return database;
    }
}
