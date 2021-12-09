package massMutual.pages;

import massMutual.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class taskPage {
    WebDriver driver= Driver.getDriver();
    public taskPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ibl_val_1")
    public WebElement value_1;

    @FindBy(id = "ibl_val_2")
    public WebElement value_2;

    @FindBy(id = "ibl_val_3")
    public WebElement value_3;

    @FindBy(id = "ibl_val_4")
    public WebElement value_4;

    @FindBy(id = "ibl_val_5")
    public WebElement value_5;

    @FindBy(id = "txt_val_1")
    public WebElement textValue_1;

    @FindBy(id = "txt_val_2")
    public WebElement textValue_2;

    @FindBy(id = "txt_val_3")
    public WebElement textValue_3;

    @FindBy(id = "txt_val_4")
    public WebElement textValue_4;

    @FindBy(id = "txt_val_5")
    public WebElement textValue_5;

    @FindBy(id = "txt_ttl_val")
    public WebElement totalValue;




}
