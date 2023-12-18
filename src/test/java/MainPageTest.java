import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Жанна\\IdeaProjects\\untitled2\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.avito.ru");
        mainPage = new MainPage(driver);


    }


    /* проверяем запуск тестов. На главной странице при клике на кнопку "Вход и регистрация"
    появляется окно для регистрации, заголовок которого имеет текст "Вход"

     */
    @Test
    public void testclick(){
        MainPage newmainPage = mainPage.clickLoginRegistration();
        String heading = mainPage.getHeadingLoginWindow();
        Assert.assertEquals("Вход", heading);
    }



    @After
    public void tearDown(){
        driver.quit();
    }


}
