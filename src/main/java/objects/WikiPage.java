package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikiPage {
    @FindBy(id = "js-link-box-en")
    WebElement en;
    @FindBy(id = "js-link-box-es")
    WebElement es;
    @FindBy(id = "js-link-box-de")
    WebElement de;
    @FindBy(id = "js-link-box-fr")
    WebElement fr;
    @FindBy(id = "js-link-box-it")
    WebElement it;


    public void getElementsText() {
        System.out.println(en.getText());
        System.out.println(es.getText());
        System.out.println(de.getText());
        System.out.println(fr.getText());
        System.out.println(it.getText());
    }

}


