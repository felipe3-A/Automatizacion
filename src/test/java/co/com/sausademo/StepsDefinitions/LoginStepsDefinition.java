package co.com.sausademo.StepsDefinitions;

import co.com.sausademo.models.Credentials;
import co.com.sausademo.steps.LoginStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class LoginStepsDefinition {

   @Steps
   LoginStep loginStep;

    @Given("the user open the page")
    public void theUserOpenThePage() {
    loginStep.openPage();
    }

    @DataTableType
    public Credentials credentialsEntry(Map<String, String> entry) {
     Credentials credentials = new Credentials();
     credentials.setUsername(entry.get("username"));
     credentials.setPassword(entry.get("password"));
     return credentials;
    }

    @When("the user enter the credentials corrects")
    public void theUserEnterTheCredentialsCorrects(DataTable dataTable) {
     List<Credentials> credentialsList =dataTable.asList(Credentials.class);
     Credentials credentials = credentialsList.get(0);

     //Llamando el paso de ingresar datos
     loginStep.enterdates(credentials.getUsername(),
                          credentials.getPassword());

     //llamando el paso enviar datos, se llama la instacia y su clase
     loginStep.clickbotton();



    }


    @Then("the user will be login")
    public void theUserWillBeLogin() {

    }


}
