package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DatatablesPage {

    public DatatablesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='dt-button buttons-create']")
    public WebElement newButton;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firsNameEditText;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastNameEditText;

    @FindBy(id = "DTE_Field_position")
    public WebElement positionEditText;

    @FindBy(id = "DTE_Field_office")
    public WebElement officeEditText;

    @FindBy(id = "DTE_Field_extn")
    public WebElement extensionEditText;

    @FindBy(id = "DTE_Field_start_date")
    public WebElement startDateEditText;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salaryEditText;

    @FindBy(xpath = "//*[@class='btn']")
    public WebElement createButton;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchBox;
}
