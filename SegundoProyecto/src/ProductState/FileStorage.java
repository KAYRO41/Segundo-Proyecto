package ProductState;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileStorage {

    public void saveToFile(List<Product> products, String filePath) {
        JSONArray jsonProducts = new JSONArray();

        for (Product product : products) {
            JSONObject jsonProduct = new JSONObject();
            jsonProduct.put("name", product.getName());
            jsonProduct.put("price", product.getPrice());
            // Guardamos el tipo según la clase concreta
            jsonProduct.put("type", product instanceof Electronics ? "electronics" : "clothing");

            jsonProducts.put(jsonProduct);
        }

        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonProducts.toString(4)); // Con formato
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

