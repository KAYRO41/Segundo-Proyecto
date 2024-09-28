package ProductState;

public class AvailableState implements ProductState {
    @Override
    public void handle(Product product) {
        System.out.println(product.getName() + " está disponible.");
    }
}
