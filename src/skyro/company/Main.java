package skyro.company;

public class Main {

    public static void main(String[] args) {
        Hogwarts[] griffindor = {
                new Griffindor("Гарри Поттер", 1, 12, 10, 10, 10, 11),
                new Griffindor("Гермиона Грейнджер", 2, 11, 9, 9, 6, 8),
                new Griffindor("Рон Уизли", 3, 10, 8, 7, 9, 10)
        };
        Hogwarts[] hufflepuff = {
                new Hufflepuff("Захария Смит", 2, 11, 9, 7, 7, 7),
                new Hufflepuff("Седрик Диггори", 3, 11, 9, 8, 7, 9),
                new Hufflepuff("Джастин Финч-Флетчли", 1, 8, 9, 7, 7, 6)
        };
        Hogwarts[] ravenclaw = {
                new Ravenclaw("Чжоу Чанг", 2, 11, 9, 8, 6, 7),
                new Ravenclaw("Падма Патил", 3, 11, 9, 10, 8, 7),
                new Ravenclaw("Маркус Белби", 2, 10, 8, 8, 7, 8)
        };
        Hogwarts[] slytherin = {
                new Slytherin("Драко Малфой", 1, 11, 9, 10, 10, 10),
                new Slytherin("Грэхэм Монтегю", 3, 11, 9, 8, 5, 6),
                new Slytherin("Грегори Гойл", 3, 10, 8, 4, 5, 8)
        };

//Списки всех учеников
        PrintServise.printStudents(griffindor);
        PrintServise.printStudents(hufflepuff);
        PrintServise.printStudents(ravenclaw);
        PrintServise.printStudents(slytherin);
//Самый умный ученик из факультета
        PrintServise.printSmart(griffindor);
        PrintServise.printSmart(hufflepuff);
        PrintServise.printSmart(ravenclaw);
        PrintServise.printSmart(slytherin);
//Самый сильный ученик из факультета
        PrintServise.printPower(griffindor);
        PrintServise.printPower(hufflepuff);
        PrintServise.printPower(ravenclaw);
        PrintServise.printPower(slytherin);
//Самый трангрессионный ученик из факультета
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
