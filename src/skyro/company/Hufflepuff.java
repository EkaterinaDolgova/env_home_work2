package skyro.company;

import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyal;
    private int honor;

    public Hufflepuff(String student, int character, int power, int transgress, int industriousness, int loyal, int honor) {
        super(student, character, power, transgress);
        if (industriousness < 0 || industriousness > 100 || honor < 0 || honor > 100 || honor < 0 || honor > 100) {

            throw new IllegalArgumentException("Используйте значения в параметрах от 0 до 100");
        }
        this.industriousness = industriousness;
        this.loyal = loyal;
        this.honor = honor;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyal() {
        return this.loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonor() {
        return this.honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    @Override
    public String toString() {
        return ", факультет Hufflepuff, " + "трудолюбивы= " + industriousness + ", верны= " + loyal + ", честны= " + honor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hufflepuff that = (Hufflepuff) o;
        return industriousness == that.industriousness && loyal == that.loyal && honor == that.honor;

    }

    @Override
    public int hashCode() {
        return Objects.hash(industriousness, loyal, honor);
    }
}

