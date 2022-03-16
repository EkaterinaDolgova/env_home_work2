package skyro.company;

public class Hufflepuff extends Hogwarts {
    static String charh1;
    static String charh2;
    static String charh3;

    public Hufflepuff(String student, int character, int power, int transgress, String charh1, String charh2, String charh3) {
        super(student, character, power, transgress);
        this.charh1 = charh1;
        this.charh2 = charh2;
        this.charh3 = charh3;
    }

    public String getCharh1() {
        return this.charh1;
    }

    public String getCharh2() {
        return this.charh2;
    }

    public String getCharh3() {
        return this.charh3;
    }
}

