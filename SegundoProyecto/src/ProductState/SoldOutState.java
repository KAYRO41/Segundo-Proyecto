package ProductState;

public class SoldOutState implements ProductState {
    @Override
    public void handle(Product product) {
        System.out.println(product.getName() + " está agotado.");
    }
}


