package ru.job4j.tracker.input;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        String[] data = {"one", "1"};

        Input input = new StubInput(data);
        ValidateInput validate = new ValidateInput(input);
        validate.askInt("Enter");
        assertThat(
                mem.toString(),
                is(String.format("Please enter validate data again.%n"))
        );
        System.setOut(out);
    }
    @Test
    public void whenKeyMenuBiggerThenMax() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        String[] data = {"22", "1"};

        Input input = new StubInput(data);
        ValidateInput validate = new ValidateInput(input);
        validate.askInt("Enter", 10);
        assertThat(
                mem.toString(),
                is(String.format("Please select key from menu.\n"))
        );
        System.setOut(out);
    }
}