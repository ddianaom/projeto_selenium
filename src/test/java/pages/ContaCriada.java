package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

public class ContaCriada extends BasePage {

    public ContaCriada(WebDriver navegador) {
        super(navegador);

        assertTrue(navegador.getPageSource().contains("Account Created!"));
    }

}