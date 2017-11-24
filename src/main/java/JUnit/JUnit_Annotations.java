package JUnit;


import org.junit.*;
import org.junit.rules.Timeout;

public class JUnit_Annotations {

    public  static printNumbers cal = null;


    @BeforeClass
    public static void JUnit_BeforeClass(){
        System.out.println("This is Before Class Method.....");
    }

        @Before
        public void JUnit_Before(){
            System.out.println("This is Before Method.....");

            cal = new printNumbers();
        }

            @Test
            public void JUnit_Test1(){
                System.out.println("This is TEST1 Method.....");
                cal.printNumbers(4);
            }

            @Ignore
            @Test(timeout=100)
            public void JUnit_Test2(){
                try {
                    System.out.println("This is TEST2 Method.....");
                    cal.printNumbers(2000000);
                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                }finally {
                    System.out.println("");
                }
            }

        @After
        public void JUnit_After(){
            System.out.println("This is After Method.....");
        }

    @AfterClass
    public static void JUnit_AfterClass(){
        System.out.println("This is After Class Method.....");
    }

}
