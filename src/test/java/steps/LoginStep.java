package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;
import runner.RunCucumberTest;

public class LoginStep extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {
        loginPage.acessarTelaLogin();
    }

    @Quando("^eu preencho os campos email e senha validos$")
    public void eu_preencho_os_campos_email_e_senha_validos() {
        loginPage.preencherLogin();
    }

    @Quando("^clico em Login$")
    public void clico_em_Login() {
        loginPage.clicarLogin();
    }

    @Entao("^vejo a mensagem de Login realizado com sucesso$")
    public void vejo_a_mensagem_de_Login_realizado_com_uscesso() {
        loginPage.validarLogin();
    }

}
