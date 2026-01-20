package tests.testng;

import org.testng.annotations.*;

public class FirstTest {

    @BeforeSuite
    public void beforeSuite() {System.out.println("Running BeforeSuite");}

    @AfterSuite
    public void afterSuite() {System.out.println("Running AfterSuite");}

    @BeforeTest
    public void beforeTest() {System.out.println("Running BeforeTest");}

    @AfterTest
    public void afterTest() {System.out.println("Running AfterTest");}

    @BeforeClass
    public void beforeClass() {System.out.println("Running BeforeClass");}

    @AfterClass
    public void afterClass() {System.out.println("Running AfterClass");}

    @BeforeMethod
    public void beforeMethod() {System.out.println("Running BeforeMethod");}

    @AfterMethod
    public void afterMethod() {System.out.println("Running AfterMethod");}

    @Test(priority = 1)
    public void test1() {System.out.println("FirstTest - test1");}

    @Test(priority = 2)
    public void test2() {System.out.println("FirstTest - test2");}

    @Test(priority = 3)
    public void test3() {System.out.println("FirstTest - test3");}

    @Test(priority = 4, enabled = false)
    public void test4() {System.out.println("FirstTest - test4");}

}
