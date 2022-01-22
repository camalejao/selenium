package jao.pages;

import jao.core.BasePage;

import static jao.core.DriverFactory.getDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class GooglePage extends BasePage {
    
    public void acessar() {
        getDriver().manage().window().setPosition(new Point(0, 0));
        getDriver().manage().window().setSize(new Dimension(1200, 660));
        getDriver().manage().window().maximize();
        
        getDriver().get("https://google.com");
    }

}
