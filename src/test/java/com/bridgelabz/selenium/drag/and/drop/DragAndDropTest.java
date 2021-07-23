package com.bridgelabz.selenium.drag.and.drop;

import com.bridgelabz.selenium.drag.and.drop.base.BaseClass;
import com.bridgelabz.selenium.drag.and.drop.utility.DragAndDrop;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseClass{

    @Test
    public void drag_and_drop_test() throws InterruptedException {

        DragAndDrop dragAndDrop = new DragAndDrop(driver);
        dragAndDrop.dragAndDrop ();
    }
}
