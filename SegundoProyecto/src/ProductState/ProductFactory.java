package ProductState;

public class ProductFactory {
    public static Product createProduct(String type, String name, double price) {
        switch (type.toLowerCase()) {
            case "electronics":
                return new Electronics(name, price);
            case "clothing":
                return new Clothing(name, price);
            default:
                throw new IllegalArgumentException("Tipo de producto no soportado");
        }
    }
}
