package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class SampleTest {

    @Test
    public void DemoTest1() {
        System.out.println("Demo Test1");
    }

    @Test
    public void DemoTest2() {
        System.out.println("Demo Test2");
    }

    @BeforeMethod
    public void DemoBeforeMethod() {
        System.out.println(" Demo Before Method");
    }

    @Test (groups = "group1")
    public void demoTest() {
        System.out.println("Demo test!");
    }

    @Test (groups = "group2")
    public void demoTest2() {
        System.out.println("Demo test2!");
//        Assert.assertEquals("100", "101");
    }

    @AfterMethod
    public void demoAfter() {
        System.out.println("Demo After Method!");
    }

    @BeforeClass
    public void demoBeforeClass() {
        System.out.println("Demo Before Class!");
    }

    @AfterClass
    public void demoAfterClass() {
        System.out.println("Demo After Class!");

    }

    @BeforeTest
    public void demoBeforeTest() {
        System.out.println("Demo Before Test!");

    }

    @AfterTest
    public void demoAfterTest() {
        System.out.println("Demo After Test!");

    }

    @BeforeSuite
    public void demoBeforeSuit() {
        System.out.println("Demo Before Suit!");
    }

    @AfterSuite
    public void demoAfterSuite() {
        System.out.println("Demo After Suit!");
    }

    @BeforeGroups (groups = "group2")
    public void demoBeforeGroups() {
        System.out.println("Demo Before Groups!");
    }

    @AfterGroups (groups = "group2")
    public void demoAfterGroups() {
        System.out.println("Demo After Groups!");
    }


}



