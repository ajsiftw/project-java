package tests.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "LoginDataProvider")
    public void loginTest(String email, String pwd) {
        System.out.println(email+" "+pwd);

    }

    @Test(dataProvider = "LoginDataProvider", dataProviderClass = CustomDataProvider.class)
    public void loginTestCustom(String email, String pwd) {
        System.out.println(email+" "+pwd);

    }

    @DataProvider(name="LoginDataProvider")
    public Object[][] getData() {
        Object[][] data = {{"abc@gmail.com", "abc"}, {"xyz@g=gmail.com", "xyz"}, {"mno@gmail.com", "mno"}};
        return data;
    }
}
