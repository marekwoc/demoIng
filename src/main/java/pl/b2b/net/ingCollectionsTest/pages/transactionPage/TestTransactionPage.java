package pl.b2b.net.ingCollectionsTest.pages.transactionPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pl.b2b.net.ingCollectionsTest.SingletonWebDriver;

public class TestTransactionPage{
    private SingletonWebDriver singletonWebDriver;
    private WebDriverWait webDriverWait;
    private WebDriver webDriver;
    private ObjectsTransationPage objectsTransationPage;

    @BeforeClass
    public void setUp (){
        singletonWebDriver = SingletonWebDriver.getInstance();
        webDriver = singletonWebDriver.getWebDriver();
        webDriverWait = singletonWebDriver.getWait();
        objectsTransationPage= new ObjectsTransationPage(webDriver, webDriverWait);
    }


    @Test
    @Parameters({"nazwaKonta"})
    public void wybierzkontouzytkownika (@Optional("KONTO Direct") String nazwaKonta){
        objectsTransationPage.wybierzkontouzytkownika(nazwaKonta);


    }

}
