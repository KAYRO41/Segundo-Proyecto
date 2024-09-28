package ProductState;

public abstract class ConcreteProduct extends Product {
    public ConcreteProduct(String name, double price) {
        super(name, price);
    }
}

public class Electronics extends ConcreteProduct {
    public Electronics(String name, double price) {
        super(name, price);
    }
}

public class Clothing extends ConcreteProduct {
    public Clothing(String name, double price) {
        super(name, price);
    }
}
