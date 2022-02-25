package org.jose.prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Prueba {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions notificaciones = new ChromeOptions();
        notificaciones.addArguments("--disable-notifications");
        notificaciones.addArguments("--disable-extensions");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rvssian\\Desktop\\Prueba\\chromeDriver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver(notificaciones);
        navegador.get("https://www.utest.com");
        navegador.findElement(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a")).click();
        Thread.sleep(5000);
        navegador.findElement(By.id("firstName")).sendKeys("Jose");
        navegador.findElement(By.id("lastName")).sendKeys("Turizo");
        navegador.findElement(By.id("email")).sendKeys("joseturizo7@gmail.com");
        Select anio = new Select(navegador.findElement(By.id("birthMonth")));
        anio.selectByIndex(06);
        Select mes = new Select(navegador.findElement(By.id("birthDay")));
        mes.selectByIndex(30);
        Select dia = new Select(navegador.findElement(By.id("birthYear")));
        dia.selectByIndex(07);
        navegador.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a")).click();
        Thread.sleep(2000);
        navegador.findElement(By.id("city")).clear();
        navegador.findElement(By.id("city")).sendKeys("valledupar");
        Thread.sleep(3000);
        navegador.findElement(By.xpath("/html/body/div[3]/div[1]/span[2]")).click();
        Thread.sleep(2000);
        navegador.findElement(By.id("zip")).sendKeys("200001");
        navegador.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/i")).click();
        Thread.sleep(2000);
        navegador.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a")).click();
        Thread.sleep(2000);
        navegador.findElement(By.id("password")).sendKeys("Jose#1234567890");
        navegador.findElement(By.id("confirmPassword")).sendKeys("Jose#1234567890");
        navegador.findElement(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div:nth-child(5) > label > span.checkmark.signup-consent__checkbox.error")).click();
        navegador.findElement(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div:nth-child(6) > label > span.checkmark.signup-consent__checkbox.error")).click();
        navegador.findElement(By.xpath("//*[@id=\"laddaBtn\"]")).click();


    }


}
