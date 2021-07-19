import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;
import  org.openqa.selenium.support.ui.Select;
public class RegistrationPageTest
{
    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ola\\Desktop\\chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://ease-demo.lingo24.com/register");

        String actualString = driver.findElement(By.className("class=\"col-md-6 text-white hidden-xs\"")).getText();
        String expectedString = "Welcome to Ease";
        assertTrue(actualString.contains(expectedString));
        driver.findElement(By.id("id=\"register\"")).click();
        String actualRegisterString = driver.findElement(By.className("class=\"col-md-6 text-white hidden-xs\"")).getText();
        String expectedRegisterString = "Register with ease";
        assertTrue(actualRegisterString.contains(expectedRegisterString));
        driver.findElement(By.className("class=\"col-md-6 col-md-offset-3 pad-bottom-lg text-center\"")).isDisplayed();
        driver.findElement(By.id("id=\"emailAddress\"")).sendKeys("test@hotmail.com");
        driver.findElement(By.id("id=\"phone\"")).sendKeys("0786453829");
        driver.findElement(By.id("id=\"mobile\"")).isDisplayed();
        driver.findElement(By.id("id=\"name\"")).sendKeys("test@hotmail.com");
        driver.findElement(By.id("id=\"companyName\"")).sendKeys("PopCola");
        driver.findElement(By.className("class=\"control-label col-md-3\"")).isDisplayed();
        driver.findElement(By.id("id=\"autocomplete\""));
        driver.findElement(By.id("address")).isDisplayed();
        driver.findElement(By.id("postalTown")).sendKeys("Glasgow");
        driver.findElement(By.id("zipCOde")).sendKeys("G44");
        driver.findElement(By.id("region")).isDisplayed();
        driver.findElement(By.id("address")).isDisplayed();
        driver.findElement(By.id("id=\"select2-currency-container\"")).isDisplayed();
        driver.findElement(By.id("id=\"select2-country-container\"")).isDisplayed();
        driver.findElement(By.id("id=\"acceptedTermsAndConditions1\"")).click();
        driver.findElement(By.className("class=\"control-label\"")).click();
        driver.findElement(By.className("class=\"btn btn-width-md-2 btn-aqua margin-lr-15 g-recaptcha\"")).click();
        String ConfirmationString = driver.findElement(By.className("class=\"col-md-6 text-white hidden-xs\"")).getText();
        String expectedConfirmationString = "Thank You";
        assertTrue(ConfirmationString.contains(expectedConfirmationString));
        driver.quit();
    }
}
