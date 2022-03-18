package skyro.company;

import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int witty;
    private int creative;

    public Ravenclaw(String student, int character, int power, int transgress, int smart, int witty, int creative) {
        super(student, character, power, transgress);
        if (smart < 0 || smart > 100 || witty < 0 || witty > 100 || creative < 0 || creative > 100) {

            throw new IllegalArgumentException("Используйте значения в параметрах от 0 до 100");
        }
        this.smart = smart;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int nobility) {
        this.smart = smart;
    }

    public int getWitty() {
        return this.witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;

        public int getCreative () {
            return this.creative;
        }

        public void setCreative ( int creative){
            this.creative = creative;
        }

        @Override
        public String toString () {
            return ", факультет Ravenclaw, " + "умные= " + smart + ", остроумные= " + witty + ", творческие= " + creative;
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ravenclaw that = (Ravenclaw) o;
            return smart == that.smart && witty == that.witty && creative == that.creative;

        }

        @Override
        public int hashCode () {
            return Objects.hash(smart, witty, creative);
        }
    }

