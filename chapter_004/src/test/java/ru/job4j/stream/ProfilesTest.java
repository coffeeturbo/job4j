package ru.job4j.stream;

import org.junit.Test;

import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class ProfilesTest {

    private List<Profile> profiles = List.of(
            new Profile(new Address("Москва", "1",  1, 1)),
            new Profile(new Address("Москва", "1",  1, 1)),
            new Profile(new Address("London", "2",  2, 2)),
            new Profile(new Address("London", "2",  2, 2)),
            new Profile(new Address("New york", "3",  3, 3)),
            new Profile(new Address("New york", "3",  3, 3))
    );

    @Test
    public void collect() {
        List<Address> actual =  Profiles.collect(profiles);

        List<Address> exprected = List.of(
                new Address("Москва", "1",  1, 1),
                new Address("London", "2",  2, 2),
                new Address("New york", "3",  3, 3)
        );

        assertEquals(exprected, actual);
    }


    @Test
    public void sort() {
        List<Address> actual =  Profiles.collect(profiles);

        List<Address> exprected = List.of(
                new Address("London", "2",  2, 2),
                new Address("New york", "3",  3, 3),
                new Address("Москва", "1",  1, 1)
        );

        Comparator<Address> comparator = Address::compareTo;
        actual.sort(comparator);
        assertEquals(exprected, actual);
    }

}