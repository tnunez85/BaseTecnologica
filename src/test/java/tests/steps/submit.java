package tests.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static tests.Hooks.driver;
import static tests.Hooks.wait;

public class submit {
    @Then("^I am \"([^\"]*)\" into the environment$")
    public void iAmIntoTheEnvironment(String arg0)  {
        WebElement layerButton = driver.findElement(By.id("map-menu-button"));
        wait.until(elementToBeClickable(layerButton));
    }

    //endregion
    @Given("^\"([^\"]*)\" website$")
    public void website(String url)  {
        driver.navigate().to(url);
    }

    @When("^I use \"([^\"]*)\" and \"([^\"]*)\" credentials$")
    public void iUseMyAnd(String user, String pwd)  {
        WebElement username = driver.findElement(By.id("user"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"fm1\"]/fieldset/div/div[6]/button"));

        wait.until(elementToBeClickable(username)).sendKeys(user);
        wait.until(elementToBeClickable(password)).sendKeys(pwd);
        wait.until(elementToBeClickable(loginButton)).click();

    }

    @Then("^I go to the index \"([^\"]*)\"$")
    public void iGoToTheIndex(String arg0)  {
        WebElement layerButtom = driver.findElement(By.id("map-menu-button"));
        wait.until(elementToBeClickable(layerButtom));

    }

    @And("^click into the layer \"([^\"]*)\"$")
    public void clickIntoTheLayer(String layer)  {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("map-menu-button")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        switch (layer){

            default: System.out.println ("ERROR: The layer "+ layer +" is unknown. Please, implement me"); System.exit(3);
            case "Movilidad_Ciclista":
                System.out.println ("OK. Let's go to: " + layer);
                driver.findElement(By.id("map-menu-button")).click();
                //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Atención ciudadana'])[1]/following::span[3]")).click();

                //Opening requested layer
                WebElement movilidadCiclistaButton=driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Movilidad'])[2]/following::a[2]"));
                wait.until(elementToBeClickable(movilidadCiclistaButton)).click();

                //Wait until layer is completelly loaded.
                WebElement layerButtom = driver.findElement(By.id("map-menu-button"));
                wait.until(elementToBeClickable(layerButtom));

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case "Movilidad_Peatonal":
                System.out.println ("OK. Let's go to: " + layer);

                driver.findElement(By.id("map-menu-button")).click();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Atención ciudadana'])[1]/following::small[2]")).click();

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Movilidad'])[2]/following::a[1]")).click();

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }



                break;

            case "Transporte_Vertical":
                System.out.println ("OK. Let's go to: " + layer);
                driver.findElement(By.id("map-menu-button")).click();
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Atención ciudadana'])[1]/following::a[1]")).click();
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Movilidad'])[2]/following::a[3]")).click();


                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case "Transporte_Público":
                System.out.println ("OK. Let's go to: " + layer);
                driver.findElement(By.id("map-menu-button")).click();
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Atención ciudadana'])[1]/following::a[1]")).click();
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Movilidad'])[2]/following::a[4]")).click();



                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case "Circulación_Tráfico":
                System.out.println ("OK. Let's go to: " + layer);
                driver.findElement(By.id("map-menu-button")).click();
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Atención ciudadana'])[1]/following::a[1]")).click();
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Movilidad'])[2]/following::a[5]")).click();



                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case "Seguridad_Vial":
                System.out.println ("OK. Let's go to: " + layer);
                driver.findElement(By.id("map-menu-button")).click();
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Atención ciudadana'])[1]/following::small[2]")).click();
                driver.findElement(By.linkText("SEGURIDAD VIAL")).click();



                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case "Aparcamientos":
                System.out.println ("OK. Let's go to: " + layer);
                driver.findElement(By.id("map-menu-button")).click();
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Atención ciudadana'])[1]/following::small[2]")).click();
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Movilidad'])[2]/following::a[7]")).click();
                // no encuentra el elemento para clicar. Hay que esperar a que sea clickeable



                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case "Electromovilidad":
                System.out.println ("OK. Let's go to: " + layer);
                driver.findElement(By.id("map-menu-button")).click();
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Atención ciudadana'])[1]/following::small[1]")).click();
                driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Movilidad'])[2]/following::a[8]")).click();


                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;

            case "Medio_Ambiente":
                System.out.println ("OK. Let's go to: " + layer);

                WebElement mapMenuButton=driver.findElement(By.id("map-menu-button"));
                wait.until(elementToBeClickable(mapMenuButton)).click();
                try {
                    Thread.sleep(1000);
                    wait.until(elementToBeClickable(mapMenuButton)).click();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                WebElement medioAmbienteLayer=driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Movilidad'])[2]/following::small[2]"));
                wait.until(elementToBeClickable(medioAmbienteLayer)).click();


                WebElement calidadRuidolayer=driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Medio ambiente'])[3]/following::a[2]"));
                wait.until(elementToBeClickable(calidadRuidolayer)).click();

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;


        }


    }

    @And("^execute the test \"([^\"]*)\"$")
    public void executeTheTest(String test)  {
        System.out.println ("You are submitting the test: "+ test);

    }


    @Then("^I expect the status \"([^\"]*)\"$")
    public void iExpectTheStatus(String status) throws Throwable {
        System.out.println ("Test exited with status: "+ status);
    }
}
