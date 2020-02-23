package ru.job4j.oop.profession.doctor;

import ru.job4j.oop.profession.Profession;

public class Doctor extends Profession {
    public Diagnose heal(Pacient pacient) {
        return new Diagnose();
    }
}
