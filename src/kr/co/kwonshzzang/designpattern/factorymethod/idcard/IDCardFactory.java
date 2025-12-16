package kr.co.kwonshzzang.designpattern.factorymethod.idcard;

import kr.co.kwonshzzang.designpattern.factorymethod.framework.Factory;
import kr.co.kwonshzzang.designpattern.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private final List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
