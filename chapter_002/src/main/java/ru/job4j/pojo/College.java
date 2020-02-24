package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student vasa = new Student();
        vasa.setAddmissionAt("сентябрь");
        vasa.setGroup("A101");
        vasa.setLastName("Иванов");
        vasa.setName("Василий");
        vasa.setSurname("Петрович");

        System.out.println(vasa.getName());
        System.out.println(vasa.getSurname());
        System.out.println(vasa.getLastName());
        System.out.println(vasa.getGroup());
        System.out.println(vasa.getAddmissionAt());
    }
}
