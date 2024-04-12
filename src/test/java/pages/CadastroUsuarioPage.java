package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;


import static org.junit.Assert.assertTrue;

public class CadastroUsuarioPage extends RunCucumberTest {


    private By user = By.id("user");
    private By email = By.id("email");
    private By password = By.id("password");
    private By btnRegister = By.id("btnRegister");
    private By msgCadastroRealizado = By.className("swal2-icon-success");


    public void acessarTelaCadastroUsuaro() {
        getDriver().get("https://automationpratice.com.br/register");
        Utils.esperarElementoVisivel(user,10);
    }

    public void preencherFormularioCadastro(String valueUser, String valuePassword) {
        System.out.println("Email do metodo get em CadastroPage: " + Utils.getEmailCadastrado());
        getDriver().findElement(user).sendKeys(valueUser);
        getDriver().findElement(email).sendKeys(Utils.getEmailCadastrado());
        getDriver().findElement(password).sendKeys(valuePassword);
    }

    public void clicarCadastrar() {
        getDriver().findElement(btnRegister).click();
    }

    public void validarCadastro() {
        String validar = getDriver().findElement(msgCadastroRealizado).getText();
        assertTrue("Texto não encontrado", validar.contains("Cadastro realizado!"));
    }



}
