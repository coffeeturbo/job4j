package ru.job4j.strategy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class PaintTest {
    @Test
    public void whenDrawSquare() {
        // получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        // Создаем буфур для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //Заменяем стандартный вывод на вывод в пямять для тестирования.
        System.setOut(new PrintStream(out));
        // выполняем действия пишушиее в консоль.
        new Paint().draw(new Square());
        // проверяем результат вычисления

        String exprected = new StringJoiner(
                    System.lineSeparator())
                    .add("++++")
                    .add("+     +")
                    .add("+     +")
                    .add("++++")
                .toString();

        exprected = exprected.concat(System.lineSeparator());

        assertThat(new String(out.toByteArray()), is(exprected));
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        String expected = new StringJoiner(System.lineSeparator())
                .add("++++++")
                .add("++  ++")
                .add("+    +")
                .add("++++++")
                .toString();

        expected = expected.concat(System.lineSeparator());
        assertThat(new String(out.toByteArray()), is(expected));
        System.setOut(stdout);
    }
}