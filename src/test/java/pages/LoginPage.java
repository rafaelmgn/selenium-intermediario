package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

import static org.junit.Assert.assertTrue;

public class LoginPage extends RunCucumberTest {

    private By user = By.id("user");
    private By password = By.id("password");
    private By btnLogin = By.id("btnLogin");
    private By msgLoginRealizado = By.className("swal2-icon-success");
    private By btnOk = By.className("swal2-confirm");


    public void acessarTelaLogin() {
        getDriver().get("https://automationpratice.com.br/login");
    }

    public void preencherLogin() {
        System.out.println("Email do metodo get em LoginPage: " + Utils.getEmailCadastrado());

        Utils.esperarElementoVisivel(user, 10);
        getDriver().findElement(user).sendKeys(Utils.getEmailCadastrado());
        getDriver().findElement(password).sendKeys("teste123");

    }

    public void clicarLogin() {
        getDriver().findElement(btnLogin).click();
    }

    public void validarLogin(){
        Utils.esperarElementoVisivel(msgLoginRealizado, 10);
        String validar = getDriver().findElement(msgLoginRealizado).getText();
        assertTrue("Texto não localizado.", validar.contains("Login realizado"));
        Utils.esperarElementoVisivel(btnOk, 10);
        getDriver().findElement(btnOk).click();
    }
}
