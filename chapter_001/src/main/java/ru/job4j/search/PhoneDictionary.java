package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {

        Predicate<Person> combine1 = person -> person.getSurname().contains(key);
        Predicate<Person> combine2 = person -> person.getAddress().contains(key);
        Predicate<Person> combine3 = person -> person.getName().contains(key);
        Predicate<Person> combine4 = person -> person.getPhone().contains(key);
        Predicate<Person> compositPredicate = combine1.or(combine2).or(combine3).or(combine4);

        ArrayList<Person> result = this.persons.stream()
                .filter(compositPredicate)
                .collect(Collectors.toCollection(ArrayList::new));

        return result;
    }
}
