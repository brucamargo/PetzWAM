package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    protected WebDriver driver; // ao usar page factory a variavel torna-se protegida


    // criar um construtor e inicializar os elementos do pae factory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements('driver',this);
    }


}
