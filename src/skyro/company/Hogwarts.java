package skyro.company;

public class Hogwarts {
    private String student;
    private int character;
    private int power;
    private int transgress;

    public Hogwarts(String student, int character, int power, int transgress) {
        this.student = student;
        this.character = character;
        this.power = power;
        this.transgress = transgress;
    }

    public String getStudent() {
        return this.student;
    }

    public int getPower() {
        return power;
    }

    public int getTransgress() {
        return transgress;
    }

    public int getCharacter() {
        return character;
    }
    public void setCharacter(int character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "Hogwarts, " + "ученик: " + student + ", умный= " + character + ", сила магии= " + power
                + ", расстояние трангрессии=" + transgress;
    }

}





