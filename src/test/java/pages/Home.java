package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {


    //mapeamentos de elementos
    @FindBy(id = "search")
    private WebElement txtInputSearch;
    //construtores

    @FindBy(css = "button.button-search")
    private WebElement btnSearch;


    //construtor
    public Home(WebDriver driver) {
        super(driver);
    }


    //ações do elementos

    public void search(String product) {

        txtInputSearch.click();
        txtInputSearch.clear();
        btnSearch.sendKeys(product);

    }

    // features - steps - search
    public void searchWithMagnifierButton(String product) {
        search(product);
        btnSearch.click();

    }

    public void searchWithEnter(String product) {
        search(product);
        txtInputSearch.sendKeys(Keys.ENTER);

    }

}
