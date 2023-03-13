import configurations.BaseClass;
import objects.WikiPage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class TestChromeMob extends BaseClass {
    static WikiPage wikiPage;
    @BeforeClass
    public static void beforeTest(){
        driver.get("https://www.wikipedia.org/");
        wikiPage= PageFactory.initElements(driver, WikiPage.class);
    }
    @Test
    public void showElementsText(){
        wikiPage.getElementsText();
    }

}
