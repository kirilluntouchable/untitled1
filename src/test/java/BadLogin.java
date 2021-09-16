import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class BadLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://yandex.by/");

        driver.findElement(By.xpath(".//*[text()='Войти']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("NoAutotestLogin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        String badLogin = driver.findElement(By.xpath("//*[text()='Такого аккаунта нет']")).getText();
        Assert.assertEquals(badLogin, "Такого аккаунта нет");
    }
}

