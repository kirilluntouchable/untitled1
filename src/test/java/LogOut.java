import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LogOut {
    private By loginField = By.xpath("//input[@type='text']");
    private By passwordField = By.xpath("//input[@name='passwd']");

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://yandex.by/");

        driver.findElement(By.xpath(".//*[text()='Войти']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("AutotestLogin");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("autotestPassword123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[@class='username desk-notif-card__user-name']")).click();
        driver.findElement(By.xpath(".//*[text()='Выйти']")).click();
        String logOut = driver.findElement(By.xpath(".//*[text()='Войти']")).getText();
        Assert.assertEquals(logOut, "Войти");


    }
}
