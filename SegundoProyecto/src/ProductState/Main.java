package ProductState;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cargar catálogo desde archivo JSON
        CatalogLoader catalogLoader = new CatalogLoader();
        List<Product> products = catalogLoader.loadCatalog("catalogo.json");

        // Verificar estado de cada producto
        for (Product product : products) {
            product.checkState();
        }

        // Guardar productos en archivo JSON
        FileStorage storage = new FileStorage();
        storage.saveToFile(products, "productos_guardados.json");

        // Simular un cambio de estado para un producto
        if (!products.isEmpty()) {
            Product firstProduct = products.get(0);
            firstProduct.setState(new SoldOutState());
            firstProduct.checkState(); // Revisar el cambio de estado
        }
    }
}

