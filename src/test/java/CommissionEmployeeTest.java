import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import EmployeeObjects.CommissionEmployee;
public class CommissionEmployeeTest {
    @Test
    void checkSalesValuesWithPositiveAndNegativeValuesButOnlyAllowPositiveValues(){
        var emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

        emp.increaseSales(-20);
        emp.increaseSales(-12);
        emp.increaseSales(11);
        emp.increaseSales(18);
        emp.increaseSales(-6);

        assertEquals(29, emp.getSales());

    }
    @Test
    void 
}
