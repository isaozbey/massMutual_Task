package massMutual.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import massMutual.pages.taskPage;
import massMutual.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class task_StepDef {
    WebDriver driver= Driver.getDriver();
    taskPage taskPage=new taskPage();
    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {
        driver.get("http://www.exercise1.com/values");
    }
    @Then("Verify the right count of values appear on the screen")
    public void verify_the_right_count_of_values_appear_on_the_screen() {
        String expected_value_1= "$122,365.21";
        Assert.assertEquals(expected_value_1,taskPage.value_1.getText());
        String expected_value_2= "$599.00";
        Assert.assertEquals(expected_value_2,taskPage.value_2.getText());
        String expected_value_3= "$850,139.39";
        Assert.assertEquals(expected_value_3,taskPage.value_3.getText());
        String expected_value_4= "$23,359.20";
        Assert.assertEquals(expected_value_4,taskPage.value_4.getText());
        String expected_value_5= "$566.27";
        Assert.assertEquals(expected_value_5,taskPage.value_5.getText());
    }
    @Then("Verify the values on the screen are greater than {int}")
    public void verify_the_values_on_the_screen_are_greater_than(Integer int1) {
       Assert.assertTrue(Double.parseDouble(taskPage.value_1.getText())>int1);

       Assert.assertTrue(Double.parseDouble(taskPage.value_2.getText())>int1);

       Assert.assertTrue(Double.parseDouble(taskPage.value_3.getText())>int1);

       Assert.assertTrue(Double.parseDouble(taskPage.value_4.getText())>int1);

       Assert.assertTrue(Double.parseDouble(taskPage.value_5.getText())>int1);


    }
    @Then("Verify the values are formatted as currencies")
    public void verify_the_values_are_formatted_as_currencies() {
        Assert.assertTrue(taskPage.value_1.getText().contains("$"));
        Assert.assertTrue(taskPage.value_2.getText().contains("$"));
        Assert.assertTrue(taskPage.value_3.getText().contains("$"));
        Assert.assertTrue(taskPage.value_4.getText().contains("$"));
        Assert.assertTrue(taskPage.value_5.getText().contains("$"));
    }
    @Then("verify the total balances matches the sum of values")
    public void verify_the_total_balances_matches_the_sum_of_values() {
     String expectedTotal_value="1,000,000.00";

     Assert.assertEquals(expectedTotal_value,taskPage.totalValue.getText());
    }
}
