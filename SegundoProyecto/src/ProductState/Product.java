package ProductState;

public class Product {
    private String name;
    private double price;
    private ProductState state;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.state = new AvailableState(); // Estado inicial
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    public void checkState() {
        state.handle(this);
    }
}

