package skyro.company;

import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Ravenclaw(String student, int character, int power, int transgress, int nobility, int honor, int courage) {
        super(student, character, power, transgress);
        if (nobility <0|| nobility >100|| honor <0|| honor >100|| courage <0|| courage >100) {

            throw new IllegalArgumentException("Используйте значения в параметрах от 0 до 100");
        }
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return this.honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return this.courage;
    }
    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override public String toString() {
        return", факультет Ravenclaw, "+"благородство= "+ nobility +", честь= "+ honor +", храбрость= "+ courage;
    }

    @Override public boolean equals(Object o) {
        if (this== o) return true;
        if (o ==null|| getClass() != o.getClass()) return false;
        Ravenclaw that = (Ravenclaw) o;
        return nobility == that.nobility && honor == that.honor && courage == that.courage;

    }
    @Override public int hashCode() {
        return Objects.hash(nobility, honor, courage);
    }
}

