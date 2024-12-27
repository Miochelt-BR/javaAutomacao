package steps;

import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DescontoSteps {
    WebDriver driver=new ChromeDriver();
    @Dado("^que estou no site da QAzando$")
    public void acessar_site_qazando() {
        driver.get("https://qazando.com.br/curso.html");
    }
    @Quando("eu coloco meu email")
    public void eu_coloco_meu_email() {
        System.out.println("ola email");
    }
    @Quando("clico em ganhar cupom")
    public void clico_em_ganhar_cupom() {
        System.out.println("ola email");

    }
    @Então("vejo o código de desconto")
    public void vejo_o_código_de_desconto() {
        System.out.println("ola email");

    }

}
