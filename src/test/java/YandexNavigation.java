import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class YandexNavigation {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://yandex.by/");

        driver.findElement(By.xpath(".//*[text()='Видео']")).click();

        for (String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }
        String Video = driver.getCurrentUrl();
        Assert.assertEquals(Video, "https://yandex.by/video/search?utm_source=main_stripe_big&text=%D0%B2%D0%B8%D0%B4%D0%B5%D0%BE");
        driver.close();
        for (String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }

        driver.findElement(By.xpath(".//*[text()='Картинки']")).click();
        for (String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }
        String Images = driver.getCurrentUrl();
        Assert.assertEquals(Images, "https://yandex.by/images/?utm_source=main_stripe_big");
        driver.close();
        for (String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }

        driver.findElement(By.xpath(".//*[text()='Новости']")).click();
        for (String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }
        String News = driver.getCurrentUrl();
        Assert.assertEquals(News, "https://yandex.by/news/?utm_source=main_stripe_big");
        driver.close();
        for (String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }

        driver.findElement(By.xpath(".//*[text()='Карты']")).click();
        for (String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }
        String Maps = driver.getCurrentUrl();
        Assert.assertEquals(Maps, "https://yandex.by/maps/?ll=29.617949%2C52.316643&utm_source=main_stripe_big&z=8");
        driver.close();
        for (String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }

        driver.findElement(By.xpath(".//*[text()='Маркет']")).click();
        for (String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }
        String Shop = driver.getCurrentUrl();
        Assert.assertEquals(Shop, "https://market.yandex.by/?clid=505&utm_source=main_stripe_big&src_pof=505&utm_source_service=morda");
        driver.close();
        for (String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }

        driver.findElement(By.xpath(".//*[text()='Переводчик']")).click();
        for (String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }
        String Translator = driver.getCurrentUrl();
        Assert.assertEquals(Translator, "https://translate.yandex.by/?utm_source=main_stripe_big");
        driver.close();
        for (String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }

        driver.findElement(By.xpath(".//*[text()='Музыка']")).click();
        for (String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }
        String Music = driver.getCurrentUrl();
        Assert.assertEquals(Music, "https://music.yandex.by/home?utm_source=main_stripe_big");

        driver.quit();
    }
}