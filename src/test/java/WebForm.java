import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObj
{
    private final String First_name = "Yasmin";
    private final String Last_name = "Hassan";
    private final String Job_title = "Manager";
    @FindBy(id = "first-name")
    private WebElement first_name;
    @FindBy(id = "last-name")
    private WebElement last_name;
    @FindBy(id = "job-title")
    private WebElement job_title;
    @FindBy(xpath = "// a [contains(text(), 'Submit')]")
    private WebElement submit_button;
    @FindBy(xpath = "// div[contains(text(), 'The form was successfully submitted!')]")
    private WebElement alertSuccess;
    @FindBy(id = "radio-button-2")
    private WebElement college;

    public WebForm(WebDriver driver)
    {
        super(driver);
    }

    public void enterFN()
    {
        this.first_name.sendKeys(First_name);
    }
    public void enterLN()
    {
        this.last_name.sendKeys(Last_name);
    }
    public void enterJT()
    {
        this.job_title.sendKeys(Job_title);
    }
    public void pressSubmit()
    {
        this.submit_button.click();
    }
    public void verifySuccess()
    {
        this.alertSuccess.isDisplayed();
    }
    public void levelEducation() {
        this.college.click();
    }
}
