import PageObject.ExchangeFreespins;
import PageObject.HomePage;
import PageObject.Registration;
import Utils.ChromeRunner;
import org.testng.annotations.Test;
import static DataObject.LogInData.*;




public class TestWeb extends ChromeRunner {

    @Test
    public void LogInFunctionality() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.userName(useNameInput);
        home.password(passwordInput);
        home.press();
      //  home.setNumber();
       // home.authorization();
        home.closeXBtn();
        home.slotPage();
        home.setSlotName();
        home.scroll();
        home.setPlayBtn();

    }
    @Test
    public void RegistrationFunctionality () throws InterruptedException {
        Registration page = new Registration(driver);
        page.registration();
        page.idInput();
        page.birthday();
        page.birtDayScroll();
        page.userNameInput();
        page.passwordInput();
        page.emailInput();
        page.continueButtonInput();
    }
    @Test
    public void ExchangeFreespin () throws InterruptedException {
        ExchangeFreespins freespins = new ExchangeFreespins(driver);
        freespins.userName(useNameInput);
        freespins.password(passwordInput);
        freespins.press();
        freespins.setNumber();
        freespins.authorization();
        freespins.closeXBtn();
        freespins.userScroll();
        freespins.clickExchange();
        freespins.exchangeBtn2();
        freespins.minusBtn();
        freespins.amountInput();
        freespins.amountInputClear();
        freespins.addAmount();
        freespins.exchangeButton();
        freespins.closeButton();
    }

}
