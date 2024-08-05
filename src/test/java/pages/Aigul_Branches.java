package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Aigul_Branches {
    WebDriver driver;
    public Aigul_Branches(){
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@placeholder=\"Enter login\"]")
    public WebElement loginBtn;
    @FindBy(xpath = "//input[@placeholder=\"Enter password\"]")
    public WebElement passwordBtn;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement singInBtn;
    @FindBy(xpath = "//span[contains(text(), 'Branches')]")
    public WebElement branchesBtn;
    @FindBy(xpath = "//button[text() = 'Create Branch']")
    public WebElement createBranch;
    @FindBy(xpath = "//input[@name=\"name\"]")
    public WebElement branchName;
    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement email;
    @FindBy(xpath = "//input[@name=\"address\"]")
    public WebElement address;
    @FindBy(xpath = "//input[@name=\"phoneNumber\"]")
    public WebElement phoneNumber;
    @FindBy(xpath = "//input[@name=\"city\"]")
    public WebElement city;
    @FindBy(xpath = "//div[@id=\"mui-component-select-regionId\"]")
    public WebElement region;
    @FindBy(xpath = "//li[@data-value=\"13\"]")
    public WebElement illinois;
    @FindBy(xpath = "//div[@id=\"mui-component-select-companyId\"]")
    public WebElement companies;
    @FindBy(xpath = "//li[@data-value=\"5\"]")
    public WebElement nameOfCompany;
   @FindBy(xpath = "//button[@form=\"add-branch-form\"]")
    public WebElement createBtn;
   @FindBy(xpath = "(//button[@type=\"button\"])[3]")
    public WebElement funBtn;
   @FindBy(xpath = "(//li[text()='Edit'])[1]")
    public WebElement editBtn;
   @FindBy(xpath = "//button[text() = 'Save']")
    public WebElement saveBtn;
   @FindBy(xpath = " //h3[text() = 'Branches For Testing']")
    public WebElement checkBranchName;
   @FindBy(xpath = "(//div[@class=\"sc-kjOQFR fHgxRQ\"])[1]")
    public WebElement checkEmail;
   @FindBy(xpath = "//div[@id=\"mui-component-select-company\"]")
    public WebElement companyBtn;
   @FindBy(xpath = "//li[contains(text(), 'Bank of America')]")
    public WebElement bankOfAmerica;

   public void loginNavigate(){
      Aigul_Branches branches = new Aigul_Branches();
       driver.get("https://supplysync.us/login");
       branches.loginBtn.sendKeys("admin@codewise.com");
       branches.passwordBtn.sendKeys("codewise123");
       branches.singInBtn.click();
   }
   public void createBranchesMethod(){
       Faker faker = new Faker();
       Aigul_Branches branches = new Aigul_Branches();
       branches.branchesBtn.click();
       branches.createBranch.click();
       branches.branchName.sendKeys("Branches For Testing");
       branches.email.sendKeys(faker.internet().emailAddress());
       branches.address.sendKeys(faker.address().fullAddress());
       branches.phoneNumber.click();
       branches.phoneNumber.sendKeys(faker.phoneNumber().phoneNumber());
       branches.city.sendKeys(faker.address().city());
       branches.region.click();
       branches.illinois.click();
       branches.companies.click();
       branches.nameOfCompany.click();
       branches.createBtn.click();
   }
   public void editMethod(){
       Aigul_Branches branches = new Aigul_Branches();
       Actions actions = new Actions(driver);
       branches.branchesBtn.click();
       branches.funBtn.click();
       branches.editBtn.click();
       actions.keyDown(branches.email, Keys.COMMAND).sendKeys("a").
               keyUp(Keys.COMMAND).keyDown(branches.email,Keys.BACK_SPACE ).
               keyUp(Keys.BACK_SPACE).build().perform();
       branches.email.sendKeys("aigul111@gmail.com");
       branches.city.sendKeys("Chicago");
       branches.saveBtn.click();
   }
   public void checkCompany(){
       Aigul_Branches branches = new Aigul_Branches();
       branches.companyBtn.click();
       branches.bankOfAmerica.click();
   }































}






















