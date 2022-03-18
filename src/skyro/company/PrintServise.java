package skyro.company;

public class PrintServise {

    public static void printStudents(Hogwarts[] student) {
        for (int i = 0; i < student.length; i++) {
            //  Hogwarts students = student[i];
            System.out.println("Ученик:" + student[i].getStudent() + " " + student[i].toString());
            // System.out.println(Hogwarts[i].toString());
        }
    }
    //Кто самый умный из факультета
    public static void printSmart(Hogwarts[] student) {
        int minValue = student[0].getCharacter();
        String studentS = student[0].getStudent();
        for (int i = 1; i < student.length; i++) {
            if (student[i].getCharacter() < minValue) {
                minValue = student[i].getCharacter();
                studentS = student[i].getStudent();
            }
        }
        System.out.println(" Самый умный ученик: " + studentS);
    }

    //Кто самый сильный из факультета
    public static void printPower(Hogwarts[] student) {
        int maxValue = student[0].getPower();
        String studentP = student[0].getStudent();
        for (int i = 1; i < student.length; i++) {
            if (student[i].getCharacter() > maxValue) {
                maxValue = student[i].getPower();
                studentP = student[i].getStudent();
            }
        }
        System.out.println(" Самый сильный ученик: " + studentP);
    }

    //Кто самый трангрессионный из факультета
    public static void printTrang(Hogwarts[] student) {
        int maxValue = student[0].getPower();
        String studentT = student[0].getStudent();
        for (int i = 1; i < student.length; i++) {
            if (student[i].getCharacter() > maxValue) {
                maxValue = student[i].getPower();
                studentT = student[i].getStudent();
            }
        }
        System.out.println(" Самый трангрессионный ученик: " + studentT);
    }

    //Кто самый умный из двух учеников
    public static void printSmart1(Hogwarts[] student) {
        int char1 = student[0].getCharacter();
        String stud1 = student[0].getStudent();
        int char2 = student[1].getCharacter();
        String stud2 = student[1].getStudent();
        if (char2 < char1) {
            System.out.println(stud2 + " умнее, чем " + stud1);
        } else {
            System.out.println(stud1 + " умнее, чем " + stud2);
        }
    }

    //Кто самый сильный из двух учеников из факультета
    public static void printPower1(Hogwarts[] student) {
        int power1 = student[0].getPower();
        String student1 = student[0].getStudent();
        int power2 = student[1].getPower();
        String student2 = student[1].getStudent();
        if (power1 > power2) {
            System.out.println(student1 + " сильнее, чем " + student2);
        } else {
            System.out.println(student2 + " сильнее, чем " + student1);
        }
    }

    //Кто самый трангрессионный тз двух учеников из факультета
    public static void printTrang1(Hogwarts[] student) {
        int trang1 = student[0].getTransgress();
        String student1 = student[0].getStudent();
        int trang2 = student[1].getTransgress();
        String student2 = student[1].getStudent();
        if (trang1 > trang2) {
            System.out.println(student1 + " может трансгрессировать на большее расстояние, чем " + student2);
        } else {
            System.out.println(student2 + " может трансгрессировать на большее расстояние, чем " + student1);
        }

    }

    //Сравнивает двух любых учеников hogvarts по силе магии и расстоянию.
    public static void printPower2(Hogwarts[] ravenclaw, Hogwarts[] slytherin) {
        int trang1 = ravenclaw[0].getTransgress();
        int power1 = ravenclaw[0].getPower();
        String student1 = ravenclaw[0].getStudent();
        int trang2 = slytherin[2].getTransgress();
        int power2 = slytherin[2].getPower();
        String student2 = slytherin[2].getStudent();
        if (trang1 > trang2) {
            System.out.println(student1 + " может трансгрессировать на большее расстояние, чем " + student2);
        } else {
            System.out.println(student2 + " может трансгрессировать на большее расстояние, чем " + student1);
        }
        if (power1 > power1) {
            System.out.println(student1 + " обладает большей мощностью магии, чем " + student2);
        } else {
            System.out.println(student2 + " обладает большей мощностью магии, чем " + student1);
        }

    }
}
