package main;

import Data.DataStudents;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.lang.System.*;

//task1
//Створити проект, що складається з двох класів: основного (Main) та класу для
//представлення об’єкта відповідно специфікації, що наведена нижче. Кожний
//клас повинен бути розміщений у окремому пакеті. У створеному класі
//визначити приватні поля для зберігання указаних даних, конструктори для
//створення об’єктів та відкриті методи setValue(), getValue(), toString() для
//доступу до полів об’єкту.
public class Students {

    public static void main(String[] args) {
        new Students().run();
    }
    //task2
    //В основному класі програми визначити методи, що створюють масив об'єктів.
    //Задати критерії вибору даних та вивести ці дані на консоль. Для кожного
    //критерію створити окремий метод.
    private void run() {
        DataStudents[] dataStudents = DataStudentsArray();
        out.println("---------------------");
        printDataStudents(dataStudents);//вывести всех студентов
        out.println("-------------------------------------");
        out.println("Cписок студентів заданого факультету!");
        printDepartamentDataStudents(dataStudents);
        out.println("_____________________________________");
        out.println("-------------------------------------");
        out.println("Cписок студентів, які народились після заданого року");
        printYearDataStudents(dataStudents);
        out.println("_____________________________________");
        out.println("-------------------------------------");
        out.println("список навчальної групи.");
        printGroupDataStudents(dataStudents);
        out.println("_____________________________________");
    }

    private void printDepartamentDataStudents(DataStudents[] dataStudents) {//вывести студентов заданного факультета
        for (DataStudents dataStudent : dataStudents) {
            if (dataStudent.getDepartament().equals("122")) {
                out.println(dataStudent);
            }
        }
    }

    private void printYearDataStudents(DataStudents[] dataStudents) {//вывести всех студентов которые родились после определенного года
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");//инициализируем формат даты
        LocalDate dateTime = LocalDate.parse("01-01-1999", formatter);//вводим дату и указываем формат
        for (DataStudents dataStudent : dataStudents) {
            if (dateTime.isBefore(LocalDate.parse(dataStudent.getDate(), formatter))) {//проверяем нашу дату и смотри которые даты идут после нашей
                out.println(dataStudent);
            }
        }
    }

    private void printGroupDataStudents(DataStudents[] dataStudents) {//вывести студентов определенной группы
        for (DataStudents dataStudent : dataStudents) {
            if (dataStudent.getGroupe().equals("2141")) {
                out.println(dataStudent);
            }
        }
    }

    //task3
    //Виконати програму, та пересвідчитись, що дані зберігаються та коректно
    //виводяться на екран відповідно до вказаних критеріїв.
    private void printDataStudents(DataStudents[] dataStudents) {//вывести всех студентов
        for (DataStudents dataStudent : dataStudents) {
            out.println(dataStudent);
        }
    }

    private DataStudents[] DataStudentsArray() {//создание массива объектов
        return new DataStudents[]{
                new DataStudents("12", "Potrivich", "Olya", "Nikolaivna", "01-01-1999", "Pushkinskaya", "+0123456789", "122", "2", "2141"),
                new DataStudents("32", "Kuprov", "Vadim", "Antonovich", "03-09-1998", "Solyanie", "0111946789", "123", "3", "2151"),
                new DataStudents("31", "Baranov)", "Vlad", "Vladimirovich", "05-11-1999", "Korabelniy", "+0123234589", "122", "3", "2141"),
                new DataStudents("45", "Timoshenko", "Victor", "Fedorovich", "17-04-2000", "Pl.Pobedy", "0123411754", "122", "2", "2141"),
                new DataStudents("35", "Hagan", "Kamila", "Vasilievna", "12-01-2002", "Sovetskaya", "+0129872369", "123", "1", "2151"),
                new DataStudents("39", "Zukov", "Valentin", "Dmitrievich", "21-08-1997", "Solyanie", "0105827678", "122", "4", "2141"),
                new DataStudents("36", "Fedorov", "Evgen", "Arturovich", "24-07-1996", "Solyanie", "0105827489", "122", "4", "2141"),
                new DataStudents("30", "Licov", "Danila", "Alexandrovich", "24-11-1996", "Solyanie", "0105123489", "123", "4", "2151")
        };
    }
}
