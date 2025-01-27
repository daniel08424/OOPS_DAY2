package oops_concepts.ClassAndObjects;

class ElectronicsProduct {
    private String productId;
    private String name;
    private double price;

    ElectronicsProduct(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    void applyDiscount(double discountPercentage) {
        price -= price * (discountPercentage / 100);
    }

    double calculateFinalPrice() {
        return price;
    }
}

class Mobile extends ElectronicsProduct {
    private int warrantyPeriod;

    Mobile(String productId, String name, double price, int warrantyPeriod) {
        super(productId, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    void extendWarranty(int additionalYears) {
        warrantyPeriod += additionalYears;
    }

    int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}

public class Example3 {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("1234", "Iphone", 25000, 2);
        mobile.applyDiscount(10);
        System.out.println("Final Price: " + mobile.calculateFinalPrice());
        System.out.println("Warranty Period: " + mobile.getWarrantyPeriod());
        mobile.extendWarranty(1);
        System.out.println("Extended Warranty Period: " + mobile.getWarrantyPeriod());
    }
}
