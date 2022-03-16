package skyro.company;

public class Griffindor extends Hogwarts {
    static String char1;
    static String char2;
    static String char3;

    public Griffindor(String student, int character, int power, int transgress, String char1, String char2, String char3) {
        super(student, character, power, transgress);
        this.char1 = char1;
        this.char2 = char2;
        this.char3 = char3;
    }

    public String getChar1() {
        return this.char1;
    }

    public String getChar2() {
        return this.char2;
    }

    public String getChar3() {
        return this.char3;
    }

}
