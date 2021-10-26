package fizzbuzzchecker;

import io.cucumber.java8.En;
import numberchecker.NumberChecker;
import org.junit.Assert;

public class IsThisNumberIsDivisibleByAnotherNumber implements En {

    private int number;
    private String answer;

    public  IsThisNumberIsDivisibleByAnotherNumber() {


        Given("There is number 9", () -> {
            this.number = 9;
        });

        Given("There is number 5", () -> {
            this.number = 5;
        });

        Given("There is number 15", () -> {
            this.number = 15;
        });

        Given("There is number 7", () -> {
            this.number = 7;
        });

        Given("There is number 3", () -> {
            this.number = 3;
        });

        Given("There is number 100", () -> {
            this.number = 100;
        });

        Given("There is number 45", () -> {
            this.number = 45;
        });

        Given("There is number 0", () -> {
            this.number = 0;
        });

        When("I ask whether it's fizz or buzz", () -> {
            NumberChecker checker = new NumberChecker();
            this.answer = checker.checkIfDivisible(this.number);
        });

        Then("I should be given {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
