package web.testweb.devrabbittest.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class HomeScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"http://www.devrabbit.com/\",\"report_upload_url\":\"https://192.168.1.142:8080/SmartQE/UploadReportFile\",\"project_name\":\"TestWeb\",\"project_description\":\"d\",\"project_id\":236,\"module_name\":\"DevrabbitTest\",\"module_description\":\"\",\"sub_module_id\":0,\"module_id\":376,\"testcase_name\":\"Sample\",\"testcase_id\":441,\"testset_id\":0,\"executed_timestamp\":2057806077,\"browser_type\":\"chrome\"}";

	public static String projectName = "testweb";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public HomeScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_300872A;
	public String clkAContact_300872() {
		waitForExpectedElement(driver, Contact_300872A);		
		String text = Contact_300872A.getText();
		Contact_300872A.click();
		return text;
	}

}