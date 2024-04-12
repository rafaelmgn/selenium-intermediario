package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroUsuarioPage;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroUsuarioStep extends RunCucumberTest {

    CadastroUsuarioPage cadastroUsuarioPage = new CadastroUsuarioPage();

    @Dado("^que estou na tela de cadastro$")
    public void que_estou_na_tela_de_cadastro() {
        cadastroUsuarioPage.acessarTelaCadastroUsuaro();
    }

    @Quando("^eu preencho o formulario de cadastro$")
    public void eu_preencho_o_formulario_de_cadastro() {
        cadastroUsuarioPage.preencherFormularioCadastro("teste","teste123");
    }

    @Quando("^clico em cadastrar$")
    public void clico_em_cadastrar() {
        cadastroUsuarioPage.clicarCadastrar();
    }

    @Entao("^vejo a mensagem de cadastro realizado com sucesso$")
    public void vejo_a_mensagem_de_cadastro_realizado_com_sucesso() {
        cadastroUsuarioPage.validarCadastro();
    }


}
