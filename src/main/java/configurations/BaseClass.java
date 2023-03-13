package configurations;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
    static public RemoteWebDriver driver;
    @BeforeClass
    public static void start(){
        driver=DriverConfig.create(EMULATORS.PIXELBASICS);
    }
    @AfterClass
    public static void end() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
