package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.AccountDatailsPage;
import runner.RunCucumberTest;

public class AccountDetailsStep extends RunCucumberTest {

    AccountDatailsPage accountDatailsPage = new AccountDatailsPage();

    @Dado("^que estou logado na QazandoShop$")
    public void que_estou_logado_na_QazandoShop() {
        accountDatailsPage.realizarLogin();
    }

    @Quando("^eu acessar Account Details$")
    public void eu_acessar_Account_Details() {
        accountDatailsPage.acessarTelaAccoutDetails();

    }

    @Quando("^clicar em Update Account$")
    public void clicar_em_Update_Account() {
        accountDatailsPage.clicarUpdadeAccount();

    }

    @Quando("^alterar meus dados cadastrais$")
    public void alterar_meus_dados_cadastrais() {
        accountDatailsPage.preencherDados();

    }

    @Quando("^clicar em Update Information$")
    public void clicar_em_Update_Information() {
        accountDatailsPage.clicarAtualizarDados();

    }

    @Entao("^vejo a tela de Profile$")
    public void vejo_a_tela_de_Profile() {
        accountDatailsPage.validarAtualizaçaoDados();
    }
}