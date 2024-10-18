package co.com.sausademo.steps;

import co.com.sausademo.pages.LoginPage;
import net.thucydides.core.annotations.Step;

    public class LoginStep {
    LoginPage loginPage;

  @Step("Esta clase permite abrir la pagina")
  public void openPage(){
    loginPage.open();
  }

  @Step("Ingresa datos")
  public void enterdates(String username, String password){
      loginPage.getDriver().findElement(loginPage.getINPUT_USER()).sendKeys(username);
      try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}
      loginPage.getDriver().findElement(loginPage.getINPUT_PASSWORD()).sendKeys(password);
      try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}

  }

  @Step("Enviar datos")
  public void clickbotton(){
      loginPage.getDriver().findElement(loginPage.getBUTTON_LOGIN()).click();
      try {Thread.sleep(3000);} catch (InterruptedException e) {throw new RuntimeException(e);}

  }

}
