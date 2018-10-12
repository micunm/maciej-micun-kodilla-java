package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.stream.Collectors;

import static junit.framework.TestCase.assertTrue;

public class CrudAppTestSuite {
    private static final String BASE_URL="https://micunm.github.io";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTests() {
        driver=WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
        generator=new Random();
    }

    @After
    public void cleanUpAfterTest() {
        driver.close();
    }

    private String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME="//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT="//form[contains(@action, \"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON="//form[contains(@action,\"createTask\")]/fieldset[3]/button";
        String taskName="Task number " + generator.nextInt(100000);
        String taskContent=taskName+" content";

        WebElement name=driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content=driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton=driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    @Test
    public void shouldCreateTrelloCard() throws InterruptedException {
        String taskName=createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        assertTrue(checkTaskExistsInTrello(taskName));
        deleteCrudAppTask(taskName);
    }

    private void sendTestTaskToTrello (String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while (!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class = \"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class = \"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
                    Select select = new Select(selectElement);
                    select.selectByIndex(3);
                    WebElement buttonCreateCard =
                            theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
                    buttonCreateCard.click();
                });
        Thread.sleep(3000);
        try {
            driver.get("http://www.trello.com");
        } catch (UnhandledAlertException e){
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
    }

    private boolean checkTaskExistsInTrello(String taskName) throws InterruptedException {
        final String TRELLO_URL = "https://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("micun@o2.pl");
        driverTrello.findElement(By.id("password")).sendKeys("Trello123!");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(2000);

  //      driverTrello.get("https://trello.com/micunm/boards");
        driverTrello.findElements(By.xpath("//a[@class = \"board-tile\"]")).stream()
                .filter(aHrew -> aHrew.findElements(By.xpath(".//div[contains(@title, \"Kodilla Application\")]")).size() > 0)
                .forEach(aHrew -> aHrew.click());

        Thread.sleep(2000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .filter(theSpan -> theSpan.getText().contains(taskName))
                .collect(Collectors.toList())
                .size() > 0;

        driverTrello.close();

        return result;
    }

    private void deleteCrudAppTask(String taskName) throws InterruptedException {
        Thread.sleep(3000);

        driver.findElements(By.xpath("//form[@class = \"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class = \"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
       //             WebElement deleteButton = theForm.findElement(By.xpath(".//button[contains(text(), 'Delete'']"));
                    WebElement deleteButton = theForm.findElement(By.xpath(".//button[4]"));
                    deleteButton.click();
                });
        Thread.sleep(3000);

    }

}
