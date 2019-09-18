package data;

import java.math.BigDecimal;

public interface TaxDao {

    // validate tax data
    boolean validateTaxData(String state);

    // set state tax
    BigDecimal setTax(String state);
}
