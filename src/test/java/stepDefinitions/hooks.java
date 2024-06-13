package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

    @Before("@NetBanking")
    public void NetBankingSetup() {
        System.out.println("*********************");
        System.out.println("Setup the entries in Netbanking database");
    }

    @Before("@Mortgage")
    public void MortgageSetup() {
        System.out.println("*********************");
        System.out.println("Setup the entries in Mortgage database");
    }

    @After
    public void tearDown() {
        System.out.println("*********************");
        System.out.println("Clear the entries in the database");
    }
}
//Before->Background->Scenario->After