package AutomationTesting.seleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public final class WebDriverFactory {

    private static final String HUB_URL = "HUB_URL";

    public static WebDriver CreateNew() throws MalformedURLException {

        System.out.println("Creating driver ...");

        URL hubURL = new URL(System.getenv().get(HUB_URL));

        System.out.println("HubUrl is : " + hubURL);

        DesiredCapabilities cap = DesiredCapabilities.firefox();

        RemoteWebDriver driver =  new RemoteWebDriver(hubURL,cap);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);

        return driver;
    }
}
