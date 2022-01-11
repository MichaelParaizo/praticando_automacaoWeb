package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import suport.Utils;

public class CadastroPage extends Utils {

    WebDriver driver;

    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By first_name_field = By.id("customer_firstname");
    private By last_name_field = By.id("customer_lastname");
    private By password_field = By.id("passwd");
    private By select_day_field = By.id("days");
    private By select_month_field = By.id("months");
    private By select_year_field = By.id("years");
    private By address_field = By.id("address1");
    private By city_field = By.id("city");
    private By state_field = By.id("id_state");
    private By postcode_field = By.id("postcode");
    private By aditionalInformation_field = By.id("other");
    private By phone_mobile_field = By.id("phone_mobile");
    private By references_field = By.id("alias");
    private By submit_button = By.id("submitAccount");

    public CadastroPage(WebDriver driver) {

        this.driver = driver;
    }

    public void selectTitle(Integer type){
        esperarElementoEstarPresente(titleM,20);
        if(type == 1 ){
           driver.findElement(titleM).click();
        }else if (type == 2){
            driver.findElement(titleF).click();
        }
    }

    public void preencheNome(String nome){
        driver.findElement(first_name_field).sendKeys(nome);
    }

    public void preencheSobreNome(String sobrenome){
        driver.findElement(last_name_field).sendKeys(sobrenome);
    }

    public void preencheSenha(String senha){
        driver.findElement(password_field).sendKeys(senha);
    }

    public void selecionaAniversario(Integer day, Integer months, String year){

        Select select_day = new Select(driver.findElement(select_day_field));
        select_day.selectByIndex(day);

        Select select_month = new Select(driver.findElement(select_month_field));
        select_month.selectByIndex(months);

        Select select_year = new Select(driver.findElement(select_year_field));
        select_year.selectByValue(year);
    }

    public void preencheEndereco(String endereco){
        driver.findElement(address_field).sendKeys(endereco);
    }

    public void preencheCidade(String cidade){
        driver.findElement(city_field).sendKeys(cidade);
    }

    public void selecionaEstado(String estado){

        Select select_state = new Select(driver.findElement(state_field));
        select_state.selectByVisibleText(estado);
    }

    public void preenchePostalcode(String cep){
        driver.findElement(postcode_field).sendKeys(cep);
    }

    public void preencheInformacoesAdicionais(String info){
        driver.findElement(aditionalInformation_field).sendKeys(info);
    }

    public void preenchePhoneMobile(String telefone){
        driver.findElement(phone_mobile_field).sendKeys(telefone);
    }

    public void preencheReferences(String referencias){
        driver.findElement(references_field).sendKeys(referencias);
    }

    public void clickRegister(){
        driver.findElement(submit_button).click();
    }

    public void validaCadastro(String nome, String sobrenome){
        esperarElementoEstarPresente(By.className("button-search"),20);
        String resultado_atual = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(nome + " " + sobrenome, resultado_atual);
    }


}
