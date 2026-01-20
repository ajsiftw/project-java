package tests.testng;

import org.testng.annotations.Test;

public class GroupingTest {

    @Test(groups = {"sanity"})
    public void groupingTest1() {System.out.println("GroupingTest - test1");}

    @Test(groups = {"sanity"})
    public void groupingTest2() {System.out.println("GroupingTest - test2");}

    @Test(groups = {"regression"})
    public void groupingTest3() {System.out.println("GroupingTest - test3");}

    @Test(groups = {"regression"})
    public void groupingTest4() {System.out.println("GroupingTest - test4");}

    @Test(groups = {"sanity", "regression"})
    public void groupingTest5() {System.out.println("GroupingTest - test5");}

}
