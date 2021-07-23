package com.bridgelabz.selenium.drag.and.drop.utility;

import com.bridgelabz.selenium.drag.and.drop.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDrop extends BaseClass{

    @FindBy(xpath = "//div[@id='column-a']")
    WebElement from;

    @FindBy(xpath = "//div[@id='column-b']")
    WebElement to;

    public DragAndDrop(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void dragAndDrop() throws InterruptedException {

        Actions actions = new Actions(driver);
        //Dragged and dropped.
        actions.dragAndDrop(from, to).perform();
        Thread.sleep(5000);

        String textTo = to.getText();
        if(textTo.equals("Dropped!")) {
            Log.info ("PASS: File is dropped to target as expected");
        }else {
            Log.info("FAIL: File couldn't be dropped to target as expected");
        }
    }
}
