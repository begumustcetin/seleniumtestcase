package tests;


import org.apache.http.HttpRequest;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.http.HttpClient;
import org.openqa.selenium.remote.http.HttpResponse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLImageElement;

import java.awt.event.WindowAdapter;






public class test_2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fulname = driver.findElement(By.id("userName"));
        fulname.click();
        fulname.sendKeys("begüm");

        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("bgmustctn44@gmail.com");

        WebElement currentAddress = driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
        currentAddress.click();
        currentAddress.sendKeys("istanbul");

        WebElement peradd=driver.findElement(By.id("permanentAddress"));
        peradd.click();
        peradd.sendKeys(" aeenm sn");


        WebElement submitButton =driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement nameText=driver.findElement(By.xpath("//div/p[@id='name']"));
        String name= nameText.getText();
        System.out.println(name);



        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();
        String homeCheckBoxCssValue="label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement homeCheckbox=driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        homeCheckbox.click();

        homeCheckbox=driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        String homeCheckboxClassName=homeCheckbox.getAttribute("class");
        if (homeCheckboxClassName.equals("rct-icon rct-icon-check")){
            System.out.println("checkbox is checked");
        }
else {
            System.out.println("checkbox is unchecked");
        }


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement sportCheckbox=driver.findElement(By.id("hobbies-checkbox-1"));
        sportCheckbox.isEnabled();
        boolean isEnabled =sportCheckbox.isEnabled();
        System.out.println(isEnabled);
      //  if (isEnabled){
       //     sportCheckbox.click();
      //  }

WebElement sportCheckboxlabel=driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));
try {
    sportCheckbox.click();
}catch (ElementClickInterceptedException e){
    sportCheckboxlabel.click();
    System.out.println("entered catch block");
}
boolean isSelected=sportCheckbox.isSelected();
        System.out.println(isSelected);



        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        WebElement yesRadioButton=driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
        boolean isEnabled=yesRadioButton.isEnabled();
        if (isEnabled){
            yesRadioButton.click();
            System.out.println("clicked yesRadio button");
        }
        WebElement output=driver.findElement(new By.ByCssSelector("p.mt-3"));
        System.out.println(output.getText());



        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement doubleClickButton=driver.findElement(By.id("doubleClickBtn"));
        Actions action =new Actions(driver);
        action.doubleClick(doubleClickButton).perform();

        WebElement message=driver.findElement(By.id("doubleClickMessage"));
        String messageText= message.getText();
        System.out.println(messageText);



        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        WebElement dynamicClickButton =driver.findElement(By.xpath("//div/button[starts-with(text(), 'Click Me')]"));
        dynamicClickButton.click();


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();
        WebElement textElement=driver.findElement(By.xpath("//div/p"));
        String text=textElement.getText();
        System.out.println(text);

        WebElement firstButton=driver.findElement(By.id("enableAfter"));
        WebDriverWait wait=new WebDriverWait(driver, 5    );
        wait.until(ExpectedConditions.elementToBeClickable(firstButton));
        firstButton.click();



        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();
        WebElement colorChangeButton =driver.findElement(By.id("colorChange"));
        String className= colorChangeButton.getAttribute("class");
        System.out.println("before change:"+className);

        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.attributeToBe(colorChangeButton,"class", "mt-4 text-danger btn btn-primary"));
 className=colorChangeButton.getAttribute("class");
        System.out.println("after change:"+className);


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/broken");
        driver.manage().window().maximize();



        HttpClient client = HttpClientBuilder.create().build();
        HttpRequest request= new HttpGet("https://demoqa.com/");
        HttpResponse response= client.execute(request);
        int statusCode=response.getStatusLine().getStatusCode();
        System.out.println(statusCode);


         
    }

}



