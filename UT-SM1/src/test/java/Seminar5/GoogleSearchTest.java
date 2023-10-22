package Seminar5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//
//    Напишите автоматизированный тест, который выполнит следующие шаги:
//            1.
//            2.
//            3.
//    Открывает главную страницу Google.
//    Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
//    В результатах поиска ищет ссылку на официальный сайт Selenium
//            (https://www.selenium.dev) и проверяет, что ссылка действительно присутствует среди
//                    результатов поиска.

public class GoogleSearchTest {


    public static void main(String[] args) {
//        Установите путь к драйверу браузера Chrome
//        https://sites.google.com/chromium.org/driver/
        String pathWebBrowser= "C:\\WebDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",pathWebBrowser );

        // Опциональные настройки браузера Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Максимизация окна браузера

        // Инициализация WebDriver
        WebDriver driver = new ChromeDriver(options);

        // Открытие главной страницы Google
        driver.get("https://www.google.com");

        // Находим элемент поисковой строки и вводим текст "Selenium"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");

        // Нажимаем кнопку "Поиск в Google"
        searchBox.submit();

        // Ожидание появления результатов поиска
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".rc")));

        // Поиск ссылки на официальный сайт Selenium
        WebElement officialLink = driver.findElement(By.partialLinkText("Selenium"));

        // Проверка, что ссылка действительно присутствует среди результатов поиска
        if (officialLink != null) {
            System.out.println("Ссылка на официальный сайт Selenium найдена.");
        } else {
            System.out.println("Ссылка на официальный сайт Selenium не найдена.");
        }

        // Завершение сеанса браузера
        driver.quit();

    }

}
