import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaLocators {
    public static void main(String[] args) {
        // Указание пути к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "/Users/sabinatagieva/Desktop/DZ/DZ14/drivers/chromedriver");


        // Инициализация драйвера
        WebDriver driver = new ChromeDriver();

        // Открытие Wikipedia
        driver.get("https://ru.wikipedia.org/wiki");

        // Нахождение локаторов кнопок
        WebElement viewCodeButton = driver.findElement(By.xpath("//span[text()='Просмотр кода']/ancestor::a"));
        WebElement createArticleButton = driver.findElement(By.xpath("//span[text()='Создать статью']/ancestor::a"));
        WebElement loginButton = driver.findElement(By.xpath("//span[text()='Войти']/ancestor::a"));

        // Вывод локаторов
        System.out.println("Локатор кнопки 'Просмотр кода': " + viewCodeButton);
        System.out.println("Локатор кнопки 'Создать статью': " + createArticleButton);
        System.out.println("Локатор кнопки 'Войти': " + loginButton);

        // Закрытие браузера
        driver.quit();
    }
}
