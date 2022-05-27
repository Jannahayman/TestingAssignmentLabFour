import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.util.concurrent.TimeUnit;

public class Test {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome,driver",Utils.chromeLoc);
    }
    @org.testng.annotations.Test(testName = "Submit WebForm")
    public static void submitForm()
    {
        driver.get(Utils.Base);
        WebForm formy = new WebForm(driver);
        formy.enterFN();
        formy.enterLN();
        formy.enterJT();
        formy.levelEducation();
        formy.pressSubmit();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        formy.verifySuccess();
    }
    @AfterSuite
    public static void CleanUp()
    {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
