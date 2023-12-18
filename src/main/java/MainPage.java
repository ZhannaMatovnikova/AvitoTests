import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By avitoSiteAdverts = By.xpath("//a[@title='Авито — сайт объявлений ']");
    private By buttonAllCategories = By.xpath("//button[@data-marker='top-rubricator/all-categories']");
    private By fieldSearch = By.xpath("//input[@data-marker='search-form/suggest']");
    private By buttonFind = By.xpath("//button[@data-marker='search-form/submit-button']");
    private By location = By.xpath("//*[@data-marker='search-form/change-location']");
    private By linkForBusiness = By.xpath("//a[text()='Для бизнеса']");
    private By linkCareerAvito = By.xpath("//a[text()='Карьера в Авито]");
    private By linkHelp = By.xpath("//a[text()='Помощь']");
    private By linkCatalogies = By.xpath("//span[text()='Каталоги']");
    private By linkCare = By.xpath("//a[text()='Польза']");
    private By iconFavourites = By.xpath("//a[@title='Избранное']");
    private By iconBuscket = By.xpath("//a[@title='Корзина']");
    private By loginRegistration = By.xpath("//a[text()='Вход и регистрация']");
    private By postAdvert = By.xpath("//span[text()='Разместить объявление']");
    private By signInTextHeading = By.xpath("//h2[text()='Вход']");

    public MainPage clickLoginRegistration() {
        driver.findElement(loginRegistration).click();
        return new MainPage(driver);
    }

    public MainPage clickPostAdvert() {
        driver.findElement(postAdvert).click();
        return new MainPage(driver);
    }

    public String getHeadingLoginWindow() {
        return driver.findElement(signInTextHeading).getText();
    }

}
