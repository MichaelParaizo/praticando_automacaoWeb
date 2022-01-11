package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.MessagePage;
import runner.RunCucumberTest;

public class MessageSteps extends RunCucumberTest {

    MessagePage messagePage = new MessagePage(driver);
    @Dado("^que estou na tela de mensagens$")
    public void que_estou_na_tela_de_mensagens(){
        messagePage.acessarMessage();
    }

    @Dado("^preencho todos os campos$")
    public void preencho_todos_os_campos(){
        messagePage.selecionaAssunto("Webmaster");
        messagePage.preencheEmail("michael_92@hotmail.com");
        messagePage.preencheMensagem("Minha mensagem");
        messagePage.uploadFile("C:\\Users\\SAMSUNG\\Desktop");
    }

    @Quando("^clico em enviar mensagens$")
    public void clico_em_enviar_mensagens() {
        messagePage.click_submit();
    }

    @Entao("^vejo notificacao de mensagem enviada com sucesso$")
    public void vejo_notificacao_de_mensagem_enviada_com_sucesso() {

    }

}
