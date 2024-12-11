// import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.PreCadastro;
import suporte.Web;

public class CadastroPageObject {

    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
    }

    @Test
    public void cadastro() {
        new PreCadastro(navegador)
                .login("testedoisPaginaPreCadastro")
                .email("testedoisemail@precadastro1")
                .pagina()
                .genero()
                .senha("123456")
                .dia()
                .mes()
                .ano()
                .noticia()
                .opcao()
                .primeiroNome("Jose")
                .sobreNome("Bezerra")
                .rua("rua teste")
                .pais()
                .ano()
                .estado("Ceará")
                .cidade("Fortaleza")
                .codigoPostal("000000")
                .telefone("85999999")
                .pagina();

    }

    // @After
    public void tearDown() {
        navegador.quit();
    }
}
