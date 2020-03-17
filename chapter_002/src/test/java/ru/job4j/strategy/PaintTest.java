package ru.job4j.strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class PaintTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        String exprected = new StringJoiner(
                    System.lineSeparator())
                    .add("++++")
                    .add("+     +")
                    .add("+     +")
                    .add("++++")
                .toString();

        exprected = exprected.concat(System.lineSeparator());

        assertThat(new String(out.toByteArray()), is(exprected));
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        String expected = new StringJoiner(System.lineSeparator())
                .add("++++++")
                .add("++  ++")
                .add("+    +")
                .add("++++++")
                .toString();

        expected = expected.concat(System.lineSeparator());
        assertThat(new String(out.toByteArray()), is(expected));
    }
}