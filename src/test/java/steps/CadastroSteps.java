package steps;


import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage(driver);


    @Quando("^eu preencho o formulario de cadastro$")
    public void eu_preencho_o_formulario_de_cadastro() {
        cadastroPage.selectTitle(1);
        cadastroPage.preencheNome("Michael");
        cadastroPage.preencheSobreNome("Couto");
        cadastroPage.preencheSenha("112233");
        cadastroPage.selecionaAniversario(20,3,"1992");
        cadastroPage.preencheEndereco("Rua da Automacão");
        cadastroPage.preencheCidade("São Paulo");
        cadastroPage.selecionaEstado("Colorado");
        cadastroPage.preenchePostalcode("88888");
        cadastroPage.preencheInformacoesAdicionais("Estou automatizando");
        cadastroPage.preenchePhoneMobile("+550489916678");
        cadastroPage.preencheReferences("Meu endereço");
    }

    @E("^clico em registrar$")
    public void clico_em_registrar() throws Throwable {
        cadastroPage.clickRegister();
    }

    @Entao("^vejo cadastro realizado com sucesso$")
    public void vejo_cadastro_realizado_com_sucesso() {
        cadastroPage.validaCadastro("Michael","Couto");
    }

}
