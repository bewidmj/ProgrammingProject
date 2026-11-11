package vending_machine;

import java.util.List;

public class VendingMachineDemo {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.buy(100, Catalog.CANDY);
        vm.buy(100, Catalog.CHIPS);
    }
}

class VendingMachine {
    private List<Product> productList;

    public Product buy(int money, String productName) {
        Product product = null;
        if (money > 0 && null != productName) {
            product = getIfProductPresentForMoney(productName, money);
            if (null != product) {
                return product;
            }
        }
        return null;
    }

    private Product getIfProductPresentForMoney(String productName, int money) {
        Product prdt = productList.stream().filter(product -> product.getName()
                .equals(productName) && product.getPrice() <= money)
                .findFirst().get();
        productList.remove(prdt);
        return prdt;
    }

}

class Catalog {
    public final static String CANDY = "CANDY";
    public final static String CHIPS = "CHIPS";
    public final static String CHOCOLATE = "CHOCOLATE";
    public final static String FRIES = "FRIES";
}

class Product {
    private int id;
    private String name;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
