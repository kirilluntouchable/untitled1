import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SwitchLanguage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://yandex.by/");

        driver.findElement(By.xpath("//a[@title='Выбрать язык']")).click();
        driver.get("https://yandex.by/tune/common?retpath=https%3A%2F%2Fyandex.by%2F&nosync=1");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//span[text()='English']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String CheckLang = driver.findElement(By.xpath("//a[@class='home-link i-bem dropdown2__switcher home-link_black_yes']")).getText();
        Assert.assertEquals(CheckLang, "Eng");

    }
}
