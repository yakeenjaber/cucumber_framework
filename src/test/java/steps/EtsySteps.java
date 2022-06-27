package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.EtsyHomePage;
import utils.Driver;

import java.util.ArrayList;
import java.util.List;


public class EtsySteps {

    WebDriver driver;
    EtsyHomePage etsyHomePage;

    @Before
    public void setup(){
        driver = Driver.getDriver();
        etsyHomePage = new EtsyHomePage();
    }

    @Then("user should see below menu item links")
    public void user_should_see_below_menu_item_links(DataTable dataTable) {
        for (int i = 0; i < dataTable.asList().size(); i++) {
            if(i == 0){
                Assert.assertNotNull(etsyHomePage.mainNavigationItems.get(i).getText());
                Assert.assertFalse(etsyHomePage.mainNavigationItems.get(i).getText().isEmpty());
            }
            else{
                Assert.assertEquals(dataTable.asList().get(i), etsyHomePage.mainNavigationItems.get(i).getText());
            }
        }
    }
}