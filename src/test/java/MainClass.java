import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://yandex.by/");

        driver.findElement(By.xpath("//span[@class='geolink__reg']")).click();
        driver.findElement(By.xpath("//input[@id='city__front-input']")).clear();
        driver.findElement(By.xpath("//input[@id='city__front-input']")).sendKeys("Лондон");
        driver.findElement(By.xpath("//*[text()='Лондон']")).click();
        driver.findElement(By.xpath("//div[@class='services-new__more-icons']")).click();

        String pageSourceLondon = driver.findElement(By.xpath("//ul[@class='services-new__more-popup-services']")).getText();

        driver.findElement(By.xpath("//span[@class='geolink__reg']")).click();
        driver.findElement(By.xpath("//input[@id='city__front-input']")).clear();
        driver.findElement(By.xpath("//input[@id='city__front-input']")).sendKeys("Париж");
        driver.findElement(By.xpath("//*[text()='Париж']")).click();
        driver.findElement(By.xpath("//div[@class='services-new__more-icons']")).click();

        String pageSourceParis = driver.findElement(By.xpath("//ul[@class='services-new__more-popup-services']")).getText();

        if (pageSourceLondon.equals(pageSourceParis)){
            System.out.println("Они одинаковые!");
        }else {
            System.out.println("Они разные!");
        }
        driver.quit();


    }
}
