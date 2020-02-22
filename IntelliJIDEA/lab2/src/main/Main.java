package main;

import lab2.Cat;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        Cat[] cats = fillCatsArray();
        System.out.println("---------------------");
        printCats(cats);
        System.out.println("---------------------");
        printDvorCats(cats);
    }

    private void printDvorCats(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].getBreed().equals("Dvor")) {
                System.out.println(cats[i]);
            }
        }
    }

    private void printCats(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
    }

    private Cat[] fillCatsArray() {
        return new Cat[]{
                new Cat(1,"Murka", "Sphinx", 'f', 1),
                new Cat(2, "Matroskin", "Dvor", 'm', 3),
                new Cat(3, "Felix", "Sibir", 'm', 2),
                new Cat(4, "Tom", "Dvor", 'm', 2)
        };
    }

}
