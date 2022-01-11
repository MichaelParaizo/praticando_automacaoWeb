package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import suport.Utils;

public class MessagePage extends Utils {
    WebDriver driver;

    private By subject_field = By.id("id_contact");
    private By message_field = By.id("message");
    private By upload_field = By.id("fileUpload");
    private By email_field = By.id("email");
    private By submit_button = By.id("submitMessage");


    public MessagePage(WebDriver driver) {

        this.driver = driver;
    }

    public void acessarMessage(){
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=contact");
        esperarElementoEstarPresente(message_field,20);
    }

    public void selecionaAssunto(String assunto){

        Select select_assunto = new Select(driver.findElement(subject_field));
        select_assunto.selectByVisibleText(assunto);
    }
    public void preencheEmail(String email){
        driver.findElement(email_field).sendKeys(email);
    }

    public void preencheMensagem(String mensagem){
        driver.findElement(message_field).sendKeys(mensagem);
    }

    public void uploadFile (String caminhoArquivo){
        driver.findElement(upload_field).sendKeys(caminhoArquivo);
    }

    public void click_submit(){
        driver.findElement(submit_button).click();
    }

    public void validaEmail(){
        esperarElementoEstarPresente(By.className("alert alert-success"),20);
        String resultado_atual = driver.findElement(By.className("alert alert-success")).getText();
        Assert.assertEquals("Your message has been successfully sent to our team.", resultado_atual);
    }
}
