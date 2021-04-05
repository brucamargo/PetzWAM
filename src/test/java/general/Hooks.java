package general;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base {
    private Base base; // objeto local para comunicação com a classe Base

   // public Hooks(Base base) {
    //    super(); // classe especial de onde todas as coisas derivão, os outros sao filhos
    //    this.base = base;
    //}

    public Hooks(Base base) {
        super(base.driver);
        this.base = base;
    }


    // Before

    @Before
    public void setup() {

        // caminho do driver

        System.setProperty("webdriver.chrome.driver", " drivers/chrome/88/driver");

        // instanciando o driver

        base.driver = new ChromeDriver();

        // maximixar a tela

        base.driver.manage().window().maximize();

        // espera IMPLICITA do chrome driver para 1 minuto

        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);


    }

    @After
    public void tearDown() {
        base.driver.quit();

    }


}
