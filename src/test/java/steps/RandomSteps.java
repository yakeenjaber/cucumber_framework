package steps;


import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.Driver;

public class RandomSteps {
    @Test
    public void getRandomDate(){
        Faker faker = new Faker();

        Driver.getDriver().get("https://www.google.com");

        Driver.getDriver().findElement(By.name("q")).sendKeys(faker.gameOfThrones().house() + Keys.ENTER);

        Driver.quitDriver();
    }
}