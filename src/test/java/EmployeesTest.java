import static org.junit.Assert.*;

/**
 * Created by alex7370 on 11/5/2015.
 */
public class EmployeesTest {
    public Employees employee;

    @org.junit.Before
    public void setUp() throws Exception {
        employee = new Employees();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testGetLevel() throws Exception {
        assertEquals(1, employee.getLevel());
    }

    @org.junit.Test
    public void testGetCurrentXP() throws Exception {
        assertEquals(25, employee.getCurrentXP());
    }

    @org.junit.Test
    public void testAdjustXP() throws Exception {
        employee.adjustXP(500);
        assertEquals(525, employee.getCurrentXP());
        assertEquals(4, employee.getLevel());
    }

    @org.junit.Test
    public void testGetType() throws Exception {
        assertEquals(Employees.TeamType.SDK, employee.getType());
    }
}