package HWClass04;
 /* goto facebook.com
 click on create account
and select your date of birth using select class
     */

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement createNewAccount = driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
        createNewAccount.click();
        Thread.sleep(2000);

        WebElement birthMonth = driver.findElement(By.xpath("//select[@id='month']"));
        birthMonth.click();

        Select selectMonth = new Select(birthMonth);
        selectMonth.selectByVisibleText("Nov");

        WebElement birthDay = driver.findElement(By.xpath("//select[@id='day']"));
        birthDay.click();

        Select selectDay = new Select(birthDay);
        selectDay.selectByVisibleText("21");

        WebElement birthYear = driver.findElement(By.xpath("//select[@id='year']"));
        birthYear.click();

        Select selectYear = new Select(birthYear);
        selectYear.selectByVisibleText("1986");

        driver.close();

    }
}
