package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static DataObject.Exchange.newAmount;
import static DataObject.LogInData.numberId;

public class ExchangeFreespins {
    public static WebElement Betlive;
    WebDriver driver;

    public ExchangeFreespins(WebDriver driver) {
        this.driver = driver;
    }
    By usernameBtn = By.xpath("//*[@id=\"main-username\"]");
    By passwordBtn = By.id("main-password");
    By pressBtn = By.xpath("/html/body/app-website-root/app-website-container/div/div[1]/app-website-header/div/div[3]/div[2]/form/div/div[3]/ui-button/button/div");
    By closeBtn = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-website-request-modal/div/div[1]/div[2]");
    By number = By.id("mobileNumberOrId");
    By aut = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/user-authorization/div/div[2]/common-authorization/div/div/div/mat-horizontal-stepper/div[2]/div[2]/auth-extended/div/form/div[2]/design-system-button/button/div");
    By userPage = By.xpath("/html/body/app-website-root/app-website-container/div/div[1]/app-website-header/div/div[3]/div[2]/div/div[2]");
    By exchange = By.xpath("/html/body/app-website-root/app-website-container/div/div[1]/app-website-header/div/div[3]/div[2]/div/div[3]/div[5]");
    By exchangeButton = By.xpath("/html/body/app-website-root/app-website-container/div/div[2]/app-website-account-container/div/div/div[2]/div[2]/freespins-exchange/div/div/common-provider[5]/div/div[2]/design-system-button/button");
    By specificAmount = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-website-exchange-freespins/div/div[2]/common-exchange/div/div[1]/common-prize[1]/div/div[2]/common-count-control/div");
    By amount = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-website-exchange-freespins/div/div[2]/common-exchange/div/div[1]/common-prize[1]/div/div[2]/common-count-control/div/input");
    By minus = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-website-exchange-freespins/div/div[2]/common-exchange/div/div[1]/common-prize[1]/div/div[2]/common-count-control/div/button[1]");
    By exchangeButton2 = By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-website-exchange-freespins/div/div[2]/common-exchange/div/div[2]/design-system-button/button");
    By closePopUp = By.className("close");

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
    public void setNumber() {
        driver.findElement(number).sendKeys(numberId);
    }
    public void  authorization() throws InterruptedException {
        driver.findElement(aut).click();
        Thread.sleep(2000);
    }
    public void userScroll () {
        driver.findElement(userPage).click();
    }

    public void clickExchange () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement freespinsExchange = wait.until(ExpectedConditions.elementToBeClickable(exchange));
        driver.findElement(exchange).click();
    }
    public void exchangeBtn2 (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement freeBtn = wait.until(ExpectedConditions.elementToBeClickable(exchangeButton));
        driver.findElement(exchangeButton).click();
    }
    public void specificAmountInput (){
        driver.findElement(specificAmount).click();
    }
    public void amountInput () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement registration = wait.until(ExpectedConditions.visibilityOfElementLocated(amount));
        driver.findElement(amount).click();
    }
    public void amountInputClear () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement clear = wait.until(ExpectedConditions.elementToBeClickable(amount));
        driver.findElement(amount).clear();
    }
    public void addAmount () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement addAmounts = wait.until(ExpectedConditions.elementToBeClickable(amount));
        driver.findElement(amount).sendKeys(newAmount);
    }
    public void minusBtn () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement addMinus = wait.until(ExpectedConditions.elementToBeClickable(minus));
        driver.findElement(minus).click();
    }
    public void exchangeButton () {
        driver.findElement(exchangeButton2).click();
    }
    public void closeButton(){
        driver.findElement(closePopUp).click();
    }

}
