package massMutual.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private Driver(){

    }

    private static ThreadLocal<WebDriver> threadLocal=new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        String browser=configurationReader.getProperty("browser");

        if (threadLocal.get()==null) {

            switch (browser) {

                case  "chrome":
                    WebDriverManager.chromedriver().setup();
                    threadLocal.set(new ChromeDriver());
                    break;
                case  "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    threadLocal.set(new FirefoxDriver());
                    break;
                case "remote-chrome":
                    DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
                    desiredCapabilities.setBrowserName(BrowserType.CHROME);
                    try {
                        threadLocal.set(new RemoteWebDriver(new URL(""),desiredCapabilities));
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
            }
        }

        return new ChromeDriver();
    }
}
