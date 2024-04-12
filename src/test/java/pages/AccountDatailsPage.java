package pages;

import org.openqa.selenium.*;
import runner.RunCucumberTest;
import support.Utils;

import static org.junit.Assert.assertTrue;

public class AccountDatailsPage extends RunCucumberTest {

    private By btnAccountDatailsMenu = By.cssSelector(".dashboard_tab_button a[href='/my-account/customer-account-details']");
    private By btnUpdateAccount = By.cssSelector(".bg-black");
    private By radioBtnMrs = By.cssSelector("input[name='mr']:checked");
    private By fName = By.id("f_name");
    private By secondName = By.cssSelector("input[wfd-id='id10']");
    private By email_address = By.id("email_address");
    private By current_password = By.id("current_password");
    private By new_password = By.id("new_password");
    private By re_password = By.id("re_password");
    private By btnUpdateInfo = By.cssSelector("button.bg-black[type='submit']");
    private By txtProfile = By.cssSelector(".vendors_profiles h4");

    public void realizarLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.acessarTelaLogin();
        loginPage.preencherLogin();
        loginPage.clicarLogin();
        loginPage.validarLogin();
    }

    public void acessarTelaAccoutDetails() {
        Utils.esperarElementoVisivel(btnAccountDatailsMenu, 10);
        getDriver().findElement(btnAccountDatailsMenu).click();
        Utils.esperar(5000);
    }

    public void clicarUpdadeAccount(){
        Utils.esperarElementoVisivel(btnUpdateAccount, 10);
        getDriver().findElement(btnUpdateAccount).click();
    }

    public void preencherDados(){
        Utils.esperarElementoVisivel(fName, 10);
        //getDriver().findElement(radioBtnMrs).click();
        getDriver().findElement(fName).sendKeys("nome");
        getDriver().findElement(secondName).sendKeys("seg test");
        getDriver().findElement(email_address).sendKeys(Utils.getEmailCadastrado());
        getDriver().findElement(current_password).sendKeys("teste123");
        getDriver().findElement(new_password).sendKeys("123teste");
        getDriver().findElement(re_password).sendKeys("123teste");
    }

    public void clicarAtualizarDados() {

        WebElement updateInfoButton = getDriver().findElement(btnUpdateInfo);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", updateInfoButton);
        Utils.esperar(3000);
        updateInfoButton.click();
    }

    public void validarAtualizaçaoDados(){
        Utils.esperarElementoVisivel(txtProfile, 10);
        System.out.println(txtProfile);
        String texto = getDriver().findElement(txtProfile).getText();

        assertTrue("Texto não encontrado", texto.contains("Profile"));
    }


}
