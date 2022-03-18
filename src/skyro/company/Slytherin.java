package skyro.company;

import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int tricky;
    private int resolute;
    private int resourcefulness;

    public Slytherin(String student, int character, int power, int transgress, int tricky, int resolute, int resourcefulness) {
        super(student, character, power, transgress);
        if (tricky < 0 || tricky > 100 || resolute < 0 || resolute > 100 || resourcefulness < 0 || resourcefulness > 100) {

            throw new IllegalArgumentException("Используйте значения в параметрах от 0 до 100");
        }
        this.tricky = tricky;
        this.resolute = resolute;
        this.resourcefulness = resourcefulness;
    }

    public int getTricky() {
        return tricky;
    }

    public void setTricky(int tricky) {
        this.tricky = tricky;
    }

    public int getResolute() {
        return this.resolute;
    }

    public void setResolute(int resolute) {
        this.resolute = resolute;
    }

    public int getResourcefulness() {
        return this.resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    @Override
    public String toString() {
        return ", факультет Slytherin, " + "хитрые= " + tricky + ", решительные= " + resolute + ", находчивость= " + resourcefulness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slytherin that = (Slytherin) o;
        return tricky == that.tricky && resolute == that.resolute && resourcefulness == that.resourcefulness;

    }

    @Override
    public int hashCode() {
        return Objects.hash(tricky, resolute, resourcefulness);
    }
}

