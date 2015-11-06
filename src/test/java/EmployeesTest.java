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
        assertEquals(2, employee.getLevel());
    }

    @org.junit.Test
    public void testGetType() throws Exception {
        assertEquals(Employees.TeamType.SDK, employee.getType());
    }

    @org.junit.Test
    public void testGetName() throws Exception {
        assertEquals("David", employee.getName());
    }

    @org.junit.Test
    public void testConstructors() throws Exception {
        Employees emp1 = new Employees("Kwasi");
        assertEquals("Kwasi", emp1.getName());
        assertEquals(Employees.TeamType.SDK,emp1.getType());
        assertEquals(1, emp1.getLevel());
        assertEquals(25, emp1.getCurrentXP());

        Employees emp2 = new Employees("Kwasi",937);
        assertEquals("Kwasi", emp2.getName());
        assertEquals(937, emp2.getCurrentXP());
        assertEquals(3, emp2.getLevel());
        assertEquals(Employees.TeamType.SDK,emp2.getType());
    }
}
