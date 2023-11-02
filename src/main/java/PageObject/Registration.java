package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static DataObject.RegistrationData.*;

public class Registration {
    public static WebElement Betlive;
    WebDriver driver;

    public Registration(WebDriver driver) {
        this.driver = driver;
    }
    By registrationButton = By.xpath("/html/body/app-website-root/app-website-container/div/div[1]/app-website-header/div/div[3]/div[3]/ui-button/button");
    By id = By.id("personalNumber");
    By birthDate = By.xpath("//*[@id=\"cdk-step-content-0-0\"]/registration-first-step/div/form/div/div[2]/registration-select-year/design-system-form-field/div/div/design-system-select/div/div/div[2]/design-system-icon/div/span");
    By birthYear = By.xpath("//*[@id=\"cdk-overlay-3\"]/div/div[2]/design-system-option[1]/div");
    By userName = By.id("username");
    By password = By.id("password");
    By email = By.id("email");
    By continueButton = By.xpath("//*[@id=\"mat-dialog-0\"]/app-website-registration/div/div/div[2]/registration-account-registration/div/div/div/registration-steps/div/div[2]/design-system-button/button");

    public void registration (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement registration = wait.until(ExpectedConditions.elementToBeClickable(registrationButton));
        driver.findElement(registrationButton).click();
    }

    public void idInput(){
        driver.findElement(id).sendKeys(id1);
    }
     public void birthday () {
        driver.findElement(birthDate).click();
     }
     public void birtDayScroll () {
        driver.findElement(birthYear).click();
     }

     public void userNameInput (){
        driver.findElement(userName).sendKeys(userName1);
     }
     public void passwordInput (){
        driver.findElement(password).sendKeys(password1);

     }
     public void emailInput(){
        driver.findElement(email).sendKeys(email1);
     }
     public void continueButtonInput () throws InterruptedException {
        driver.findElement(continueButton).click();
        Thread.sleep(5000);
     }
}
