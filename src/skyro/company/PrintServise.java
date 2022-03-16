package skyro.company;

import static skyro.company.Griffindor.char1;
import static skyro.company.Griffindor.char2;
import static skyro.company.Griffindor.char3;
import static skyro.company.Hufflepuff.charh1;
import static skyro.company.Hufflepuff.charh2;
import static skyro.company.Hufflepuff.charh3;
import static skyro.company.Ravenclaw.charh1;
import static skyro.company.Ravenclaw.charh2;
import static skyro.company.Ravenclaw.charh3;
import static skyro.company.Slytherin.charh1;
import static skyro.company.Slytherin.charh2;
import static skyro.company.Slytherin.charh3;

public class PrintServise {
    public static void print(Hogwarts[] hogwarts, int ch) {
        String char1_ = null;
        String char2_ = null;
        String char3_ = null;
        switch (ch) {
            case (1):
                char1_ = Griffindor.char1;
                char2_ = Griffindor.char2;
                char3_ = Griffindor.char3;
                break;
            case (2):
                char1_ = Hufflepuff.charh1;
                char2_ = Hufflepuff.charh2;
                char3_ = Hufflepuff.charh3;
                break;
            case (3):
                char1_ = Ravenclaw.charh1;
                char2_ = Ravenclaw.charh2;
                char3_ = Ravenclaw.charh3;
                break;
            case (4):
                char1_ = Slytherin.charh1;
                char2_ = Slytherin.charh2;
                char3_ = Slytherin.charh3;
                break;
        }
        for (int i = 0; i < hogwarts.length; i++) {
            Hogwarts hogwarts1 = hogwarts[i];
            System.out.println("Ученик: " + hogwarts1.getStudent() + " Характер: " + hogwarts1.getCharacter() +
                    " Мощность: " + hogwarts1.getPower() +
                    " Трансгресия:" + hogwarts1.getTransgress() +
                    " Характер факультета:" + char1_ + ", " + char2_ + ", " + char3_);
        }

    }

    //Кто самый умный из факультета
    public static void printSmart(Hogwarts[] hogwarts) {
        int minValue = hogwarts[0].getCharacter();
        String student = hogwarts[0].getStudent();
        for (int i = 1; i < hogwarts.length; i++) {
            if (hogwarts[i].getCharacter() < minValue) {
                minValue = hogwarts[i].getCharacter();
                student = hogwarts[i].getStudent();
            }
        }
        System.out.println(" Самый умный ученик: " + student);
    }

    //Кто самый сильный из факультета
    public static void printPower(Hogwarts[] hogwarts) {
        int maxValue = hogwarts[0].getPower();
        String student = hogwarts[0].getStudent();
        for (int i = 1; i < hogwarts.length; i++) {
            if (hogwarts[i].getCharacter() > maxValue) {
                maxValue = hogwarts[i].getPower();
                student = hogwarts[i].getStudent();
            }
        }
        System.out.println(" Самый сильный ученик: " + student);
    }

    //Кто самый трангрессионный из факультета
    public static void printTrang(Hogwarts[] hogwarts) {
        int maxValue = hogwarts[0].getPower();
        String student = hogwarts[0].getStudent();
        for (int i = 1; i < hogwarts.length; i++) {
            if (hogwarts[i].getCharacter() > maxValue) {
                maxValue = hogwarts[i].getPower();
                student = hogwarts[i].getStudent();
            }
        }
        System.out.println(" Самый трангрессионный ученик: " + student);
    }

    //Кто самый умный из двух учеников
    public static void printSmart1(Hogwarts[] hogwarts) {
        int char1 = hogwarts[0].getCharacter();
        String student1 = hogwarts[0].getStudent();
        int char2 = hogwarts[1].getCharacter();
        String student2 = hogwarts[1].getStudent();
        if (char2 < char1) {
            System.out.println(student2 + " умнее, чем " + student1);
        } else {
            System.out.println(student1 + " умнее, чем " + student2);
        }
    }

    //Кто самый сильный из двух учеников из факультета
    public static void printPower1(Hogwarts[] hogwarts) {
        int power1 = hogwarts[0].getPower();
        String student1 = hogwarts[0].getStudent();
        int power2 = hogwarts[1].getPower();
        String student2 = hogwarts[1].getStudent();
        if (power1 > power2) {
            System.out.println(student1 + " сильнее, чем " + student2);
        } else {
            System.out.println(student2 + " сильнее, чем " + student1);
        }
    }

    //Кто самый трангрессионный тз двух учеников из факультета
    public static void printTrang1(Hogwarts[] hogwarts) {
        int trang1 = hogwarts[0].getTransgress();
        String student1 = hogwarts[0].getStudent();
        int trang2 = hogwarts[1].getTransgress();
        String student2 = hogwarts[1].getStudent();
        if (trang1 > trang2) {
            System.out.println(student1 + " может трансгрессировать на большее расстояние, чем " + student2);
        } else {
            System.out.println(student2 + " может трансгрессировать на большее расстояние, чем " + student1);
        }

    }

    //Сравнивает двузх любых учеников hogvarts по силе магии и расстоянию.
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
