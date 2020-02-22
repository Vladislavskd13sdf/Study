//import data class
package main;

import Data.DataStudents;

import static java.lang.System.*;

//Main Class
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

    private void run(){
        DataStudents[] dataStudents=DataStudentsArray();
        out.println("---------------------");
        printDataStudents(dataStudents);
        out.println("---------------------");
        //a) список студентів заданого факультету;
        printDepartamentDataStudents(dataStudents);
        out.println("a^---------------------");
        //b) список студентів, які народились після заданого року;
        printYearDataStudents(dataStudents);
        out.println("b^---------------------");
        //c) список навчальної групи.
        printGroupDataStudents(dataStudents);
        out.println("c^---------------------");
    }

    private void printDepartamentDataStudents(DataStudents[] dataStudents) {
        for (DataStudents dataStudent : dataStudents) {
            if (dataStudent.getDepartament().equals("122")) {
                out.println(dataStudent);
            }
        }
    }

    private void printYearDataStudents(DataStudents[] dataStudents) {
        for (DataStudents dataStudent : dataStudents) {
            if (dataStudent.getDate().equals("01-01-1999")) {
                out.println(dataStudent);
            }
        }
    }

    private void printGroupDataStudents(DataStudents[] dataStudents) {
        for (DataStudents dataStudent : dataStudents) {
            if (dataStudent.getGroupe().equals("2141")) {
                out.println(dataStudent);
            }
        }
    }

    private void printDataStudents(DataStudents[] dataStudents)
    {
        for (DataStudents dataStudent : dataStudents) {
            out.println(dataStudent);
        }
    }

    private DataStudents[] DataStudentsArray()
    {
        return new DataStudents[]{
                new DataStudents("12", "Potrivich","Olya","Nikolaivna","01-01-1999","Pushkinskaya","+0123456789","122","2","2141"),
                new DataStudents("32", "Kazantip","Vadim","Natashevich","03-09-1998","Solyanie","0111946789","123","3","2151"),
                new DataStudents("31", "Killmyfrend)","Odim","Noyabir","05-11-1999","Korabelniy","+0123234589","122","3","2141"),
                new DataStudents("45", "krutojivotov","Armyan","Teterovich","17-04-2000","Pl.Pobedy","0123411754","122","2","2141"),
                new DataStudents("35", "Chereshnya","Kaminna","Zamorozmenya","12-01-2002","Sovetskaya","+0129872369","123","1","2151"),
                new DataStudents("39", "Zmanay","Menya","Pchola","21-08-1997","Solyanie","0105827678","122","4","2141"),
                new DataStudents("36", "Zavtra","Budet","Laba","24-07-1996","Solyanie","0105827489","122","4","2141"),
                new DataStudents("30", "Crazy","Danila","What","24-11-1996","Solyanie","0105123489","123","4","2151")
        };
    }
}
