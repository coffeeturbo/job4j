package ru.job4j.oop.profession.engineer.programmer;

import ru.job4j.oop.profession.engineer.Engineer;

public class Programmer extends Engineer {
    protected String programmingLangiage;
    protected String teamStatus;

    public String getProgrammingLangiage() {
        return programmingLangiage;
    }

    public void setProgrammingLangiage(String programmingLangiage) {
        this.programmingLangiage = programmingLangiage;
    }

    public String getTeamStatus() {
        return teamStatus;
    }

    public void setTeamStatus(String teamStatus) {
        this.teamStatus = teamStatus;
    }
}
