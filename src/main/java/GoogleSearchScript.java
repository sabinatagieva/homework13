import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchScript {
    public static void main(String[] args) {
        // Указание пути к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "/Users/sabinatagieva/Desktop/DZ/DZ14/drivers/chromedriver");

        // Инициализация драйвера
        WebDriver driver = new ChromeDriver();

        // Открытие Google
        driver.get("https://www.google.com");

        // Нахождение поля ввода и ввод текста
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");

        // Нажатие Enter (или можно использовать searchBox.submit())
        searchBox.sendKeys(Keys.ENTER);

        // Закрытие браузера
        driver.quit();
    }
}
