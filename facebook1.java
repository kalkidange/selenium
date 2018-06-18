/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automate1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author TG
 */
public class facebook1 {
    public static void main(String[] args ){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TG\\Documents\\NetBeansProjects\\automate1\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("0936607589");
        driver.findElement(By.id("pass")).sendKeys("36607589");
        driver.findElement(By.id("u_0_n")).click();
        
        WebElement numberOfNotifictions = driver.findElement(By.id("notificationsCountValue"));
        String not = numberOfNotifictions.getText();
        System.out.println(not + " notifications.");
        
        
    
    }
    
}
