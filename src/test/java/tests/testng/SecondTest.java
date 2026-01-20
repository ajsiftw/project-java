package tests.testng;

import org.testng.annotations.*;

public class SecondTest {

    @Test(priority = 4)
    public void  test5() {System.out.println("SecondTest - test5");}

    @Test(priority = 2)
    public void  test6() {System.out.println("SecondTest - test6");}

    @Test(priority = 1)
    public void  test7() {System.out.println("SecondTest - test7");}

    @Test(priority = 3)
    public void  test8() {System.out.println("SecondTest - test8");}

}
