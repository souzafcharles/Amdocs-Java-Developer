package org.souza.charles;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Bruno Flávio Ferreira
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 12, 2022
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzStepDef {
    private int number;
    private int length;
    private String answer;
    private List<String> out;
    boolean background = false;
    boolean other = false;


    @Given("the user wnat to FizzBuzz the number {int}")
    public void selectNumber(int number) {
        this.number = number;
    }

    @When("the user clicked the FizzBuzz button")
    public void fizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        answer = fizzBuzz.render(number);

    }

    @Then("the program prints {word}")
    public void checkAnswer(String expected) {
        assertEquals(expected,answer);
    }

    @Given("the user whants a sequence of {int} numbers")
    public void theUserWnatsASequenceOfNumbers(int length) {
        this.length = length;

    }

    @When("the user clicked the FizzBuzz Sequence button")
    public void theUserClickedTheFizzBuzzSequenceButton() {
        Sequence sequence = new Sequence(new FizzBuzz());
        this.out = sequence.generate(length);

    }

    @Then("the program printed:")
    public void theProgramPrinted(List<String> expected) {
        assertNotNull(out);
        assertEquals(expected.size(), out.size());
        for(int i = 0;i < expected.size(); i++) {
            assertEquals(expected.get(i), out.get(i));
        }
    }

    @Then("the table must be converted:")
    public void theTableMustBeConverted(List<Person> table) {
        assertNotNull(table);
        for(Person p : table) {
            System.out.println(p);
        }

    }

    @DataTableType
    public static List<Person> converter(DataTable table){
        if(table.width() != 4) {
            return null;
        }
        List<Person> list = new ArrayList<Person>();
        for(List<String> colums : table.cells()) {
            Person p = new Person(colums.get(0), colums.get(1), colums.get(2), Integer.parseInt(colums.get(3)));
            list.add(p);
        }
        return list;
    }

    @Given("the backgroud flag is set")
    public void theBackgroudFlagIsSet() {
        background = true;
    }

    @And("other flag is set")
    public void otherFlagIsSet() {
        other = true;

    }

    @And("validate background flags")
    public void validateBackgroundFlag() {
        assertTrue(background);
        assertTrue(other);
    }
}
