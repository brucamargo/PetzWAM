package pages;

import general.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class List extends Base {

    // 1 mapeamentos

    @FindBy(css = "h1.h2Categoria.nomeCategoria")
    private WebElement lblResultBy;


    // 2 construtor
    public List(WebDriver driver) {
        super(driver);
    }

    // 3 mapeamentos

    // lê o titulo da guia e retorna o texto encontrado

    public String readTitleTabe() {
        return driver.getTitle();

    }

    // lê a frase do Resultado para Produto

    public String readResultBy() {

        return lblResultBy.getText();
    }

    // clique no produto encontrado

    public void clickAtDesiredProduct(String product) {

        driver.findElement(By.xpath("//h3[contains(text(),'" + product + "')]")).click();


    }

}
