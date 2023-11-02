package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static DataObject.LogInData.numberId;

public class HomePage {
    public static WebElement Betlive;
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    By usernameBtn = By.xpath("//*[@id=\"main-username\"]");
    By passwordBtn = By.id("main-password");
    By pressBtn = By.xpath("/html/body/app-website-root/app-website-container/div/div[1]/app-website-header/div/div[3]/div[2]/form/div/div[3]/ui-button/button/div");
    By slotPage = By.xpath("/html/body/app-website-root/app-website-container/div/div[1]/app-website-header/div/div[2]/a[3]/div");
    By closeBtn = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-website-request-modal/div/div[1]/div[2]");
    By number = By.id("mobileNumberOrId");
    By aut = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/user-authorization/div/div[2]/common-authorization/div/div/div/mat-horizontal-stepper/div[2]/div[2]/auth-extended/div/form/div[2]/design-system-button/button/div");
    By slotName = By.xpath("/html/body/app-website-root/app-website-container/div/div[2]/app-website-slots/div/div/div[3]/common-filter/div/div[3]");
    By playBtn = By.xpath("/html/body/app-website-root/app-website-container/div/div[2]/app-website-slots/div/div/div[4]/div[1]/div[1]/game-item-card[1]/div/div[1]/div[1]/div") ;


    public void userName(String useNameInput) throws InterruptedException {
        driver.findElement(usernameBtn).sendKeys(useNameInput);
        Thread.sleep(2000);
    }

    public void password(String passwordInput) {
        int timeoutInSeconds = 10;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(passwordBtn));
        driver.findElement(passwordBtn).sendKeys(passwordInput);
    }

    public void press() throws InterruptedException {
        driver.findElement(pressBtn).click();
        Thread.sleep(2000);
    }

    public void closeXBtn(){
        driver.findElement(closeBtn).click();
    }

    public void slotPage() throws InterruptedException {
        driver.findElement(slotPage).click();
        Thread.sleep(2000);
    }

    public void setNumber() {
        driver.findElement(number).sendKeys(numberId);
    }
    public void  authorization() throws InterruptedException {
        driver.findElement(aut).click();
        Thread.sleep(2000);
    }

    public void setSlotName() {
        driver.findElement(slotName).click();
    }

    public void scroll () throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,280)","");
        Thread.sleep(3000);
    }


    public void setPlayBtn() throws InterruptedException {
        WebElement hoverElement = driver.findElement(playBtn);
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement catchElement = wait.until(ExpectedConditions.visibilityOfElementLocated(playBtn));
        driver.findElement(playBtn).click();
        Thread.sleep(10000);
    }



}
