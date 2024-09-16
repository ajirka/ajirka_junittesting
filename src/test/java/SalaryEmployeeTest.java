import EmployeeObjects.SalaryEmployee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryEmployeeTest {
    @Test
    void calculateWeeklyPayForSalaryEmployee() {
        var emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        assertEquals(1237.02, emp.calculateWeeklyPay());
    }
    @Test
    void calculateHolidayBonus(){
        var emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        assertEquals(2164.54, emp.holidayBonus());
    }

}
