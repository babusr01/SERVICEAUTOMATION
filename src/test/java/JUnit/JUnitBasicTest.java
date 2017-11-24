package JUnit;

import org.junit.*;

import static org.junit.Assert.*;

public class JUnitBasicTest {

    @Before
    public void setUp(){
        System.out.println("    This is Before.....");
    }

    @After
    public void teadDown(){
        System.out.println("    THis is After.......");
    }

    @BeforeClass
    public void setUp_BEforeclass(){
        System.out.println("THis is Before class....");
    }

    @AfterClass
    public  void tearDown_afterClass(){
        System.out.println("THis is After class......");
    }



    @Test
    public  void a_InterValueAssertion(){

        System.out.println("        This is Method.....");
        long longvalue1 = 10;
        long longvalue2 = 10;
        assertEquals(longvalue1, longvalue2);
        assertEquals("Two long values", longvalue1, longvalue2);
    }

    @Test
    public void a_doublevalueAssertion(){
        System.out.println("        This is Method.....");
        double dValue1 = 10.0;
        double dValue2 = 10.01;

        assertEquals("Pass with delta", dValue1, dValue2, 0.01);

    }


}