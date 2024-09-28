package ProductState;

import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CatalogLoader {

    public List<Product> loadCatalog(String filePath) {
        List<Product> products = new ArrayList<>();

        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            JSONArray jsonProducts = new JSONArray(content);

            for (int i = 0; i < jsonProducts.length(); i++) {
                JSONObject jsonProduct = jsonProducts.getJSONObject(i);
                String type = jsonProduct.getString("type");
                String name = jsonProduct.getString("name");
                double price = jsonProduct.getDouble("price");

                Product product = ProductFactory.createProduct(type, name, price);
                products.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;
    }
}

