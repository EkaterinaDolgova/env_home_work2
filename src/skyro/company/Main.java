package skyro.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Hogwarts[] griffindor = {
                new Griffindor("Гарри Поттер", 1, 12, 10, "Благородство", "Честь", "Храбрость"),
                new Griffindor("Гермиона Грейнджер", 2, 11, 9, "Благородство", "Честь", "Храбрость"),
                new Griffindor("Рон Уизли", 3, 10, 8, "Благородство", "Честь", "Храбрость")
        };
        Hogwarts[] hufflepuff = {
                new Hufflepuff("Захария Смит", 2, 11, 9, "Трудолюбивы", "Верны", "Честны"),
                new Hufflepuff("Седрик Диггори", 3, 11, 9, "Трудолюбивы", "Верны", "Честны"),
                new Hufflepuff("Джастин Финч-Флетчли", 1, 8, 9, "Трудолюбивы", "Верны", "Честны")
        };
        Hogwarts[] ravenclaw = {
                new Ravenclaw("Чжоу Чанг", 2, 11, 9, "Умны", "Мудры", "Остроумны"),
                new Ravenclaw("Падма Патил", 3, 11, 9, "Умны", "Мудры", "Остроумны"),
                new Ravenclaw("Маркус Белби", 2, 10, 8, "Умны", "Мудры", "Остроумны")
        };
        Hogwarts[] slytherin = {
                new Slytherin("Драко Малфой", 1, 11, 9, "Хитрость", "Решительность", "Жажда власти"),
                new Slytherin("Грэхэм Монтегю", 3, 11, 9, "Хитрость", "Решительность", "Жажда власти"),
                new Slytherin("Грегори Гойл", 3, 10, 8, "Хитрость", "Решительность", "Жажда власти")
        };

        PrintServise.print(griffindor, 1);
        PrintServise.print(hufflepuff, 2);
        PrintServise.print(ravenclaw, 3);
        PrintServise.print(slytherin, 4);

        PrintServise.printSmart(griffindor);
        PrintServise.printSmart(hufflepuff);
        PrintServise.printSmart(ravenclaw);
        PrintServise.printSmart(slytherin);

        PrintServise.printPower(griffindor);
        PrintServise.printPower(hufflepuff);
        PrintServise.printPower(ravenclaw);
        PrintServise.printPower(slytherin);

        PrintServise.printTrang(griffindor);
        PrintServise.printTrang(hufflepuff);
        PrintServise.printTrang(ravenclaw);
        PrintServise.printTrang(slytherin);

        PrintServise.printSmart1(griffindor);
        PrintServise.printSmart1(hufflepuff);
        PrintServise.printSmart1(ravenclaw);
        PrintServise.printSmart1(slytherin);

        PrintServise.printPower1(griffindor);
        PrintServise.printPower1(hufflepuff);
        PrintServise.printPower1(ravenclaw);
        PrintServise.printPower1(slytherin);

        PrintServise.printTrang1(griffindor);
        PrintServise.printTrang1(hufflepuff);
        PrintServise.printTrang1(ravenclaw);
        PrintServise.printTrang1(slytherin);

        PrintServise.printPower2(ravenclaw, slytherin);

    }
}
