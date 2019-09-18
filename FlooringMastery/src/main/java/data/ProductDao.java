package data;

import java.math.BigDecimal;

public interface ProductDao {

    // validate product data
    boolean validateProductData(String type);

    // read material cost
    BigDecimal readMaterialCost(String type);

    // read labor cost
    BigDecimal readLaborCost(String type);
}
