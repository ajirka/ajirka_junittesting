import EmployeeObjects.HourlyEmployee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HourlyEmployeeTest {
    @Test
    void increaseHoursWorkedAndDoNotAllowNegativeNumbers() {
        var emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(4);
        emp.increaseHours(18);
        //Add a negative number to show that it is not counted
        emp.increaseHours(-10);

        assertEquals(25, emp.getHoursWorked());
        //System.out.println(emp.getHoursWorked());
    }
    @Test
    void increaseWage(){
        var emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.annualRaise();
        assertEquals(34.49, emp.getWage());
    }

    @Test
    void calculateWeeklyPayWithIncreaseIfThereIsOvertime(){
        var emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(35);
        assertEquals(1149.75, emp.calculateWeeklyPay());
        emp.increaseHours(10);
        assertEquals(1560.38, emp.calculateWeeklyPay());
    }


}
