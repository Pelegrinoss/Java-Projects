package Covek;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class Covek {
    String rasa;
    char pol;
    int godine;
    boolean zivot;

    public Covek(String rasaCoveka, char polCoveka, int godineCoveka, boolean zivotCoveka) {
        rasa = rasaCoveka;
        pol = polCoveka;
        godine = godineCoveka;
        zivot = zivotCoveka;
    }

    public static void main(String[] args) {

        Scanner godineSken = new Scanner(System.in);
        int godinePitam;
        System.out.println("Unesi svoje godine");
        godinePitam = godineSken.nextInt();
        System.out.println(godinePitam);

        if (godinePitam >= 60) {
            System.out.println("U svojim 60im si");
        } else if (godinePitam >= 50) {
            System.out.println("U svojim 50im si");
        } else if (godinePitam >= 40) {
            System.out.println("U svojim 40im si");
        } else if (godinePitam >= 30) {
            System.out.println("U svojim 30im si");
        } else if (godinePitam >= 20) {
            System.out.println("U svojim 20im si");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Koji ti je omiljeni matematicki znak?");
        String znak = sc.next();

        Matematika matematickiZnak = new Matematika();

        matematickiZnak.racunica(znak);
        //print();//
        //ocene();//
        //visinaKlasa();//
        petlje();
        numberToString();
    }

    public static void print() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi svoje ime");
        String ime = sc.next();

        System.out.println("De si " + ime + "?");

        Covek Lazar = new Covek("Belac", 'M', 38, true);
        Covek Marko = new Covek("Belac", 'M', 25, true);
        Covek Nina = new Covek("Belac", 'Z', 32, true);
        Covek Frenk = new Covek("Crnac", 'M', 45, true);
        Covek Blaza = new Covek("Belac", 'M', 95, false);

        boolean koJeStariji = Lazar.godine > Marko.godine;
        int totalGodina = Lazar.godine + Marko.godine + Nina.godine + Frenk.godine + Blaza.godine;
        char polNine = Nina.pol;

        System.out.println("Da li je Lazar stariji od Marka? " + koJeStariji);
        System.out.println("Kog je pola Nina? " + polNine);
        System.out.println("Koliko godina imaju svi zajedno? " + totalGodina);
        System.out.println(Frenk);
    }

    public String toString() {
        return "Ovo je covek Frenk: \n" + "Rasa:" + rasa + " \nPol:" + pol + " \nGodine:" + godine + " \nJel ziv? " + zivot;
    }

    public static void visinaKlasa() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Koliko si visok? ");
        int visina = sc1.nextInt();
        System.out.println(visina);

        if (visina > 180) {
            if (visina > 200) {
                System.out.println("Mnogo si visok");
            }
            System.out.println("Visok si");
        } else {
            System.out.println("Nizak si");
        }


    }


    public static void ocene() {

        int ocena;
        ocena = 4;

        switch (ocena) {
            case 1:
                System.out.println("Nedovoljan");
                break;
            case 2:
                System.out.println("Dovoljan");
                break;
            case 3:
                System.out.println("Dobar");
                break;
            case 4:
                System.out.println("Vrlo dobar");
                break;
            case 5:
                System.out.println("Odlican");
                break;
        }

        int mat, bio;

        mat = 5;
        bio = 3;

        if (mat > 2 && bio > 2) {
            System.out.println("Zavrsio si razred, bravo.");
        } else {
            System.out.println("Pao si.");
        }

        int geos = 5;

        System.out.println(geos > 4 ? "Prosao si geos " : "Pao si geos");


    }

    public static void petlje() {

        int counter;
        counter = 0;

        while (counter < 5) {

            System.out.println("Lazar voli plavuse");
            counter++;
        }
        for (int kounter = 0; kounter < 5; kounter++) {
            System.out.println("Nesto");
        }
        int kaunter = 0;
        do {
            System.out.println("Nesto jos" + kaunter);
            kaunter++;
        } while (kaunter < 10);

        int niz[] = new int[6];
        niz[3] = 23;
        System.out.println(niz[3]);
        int niz2[] = {1, 2, 3, 4, 5};
        System.out.println(niz2);


        ArrayList<String> toDoList = new ArrayList<String>();
        String toDo1 = "Sleep";
        String toDo2 = "Gym";
        String toDo3 = "Eat";

        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);
        toDoList.add("Rave");
        /* toDoList.remove("Rave");*/

        System.out.println(toDoList);
        System.out.println(toDoList.indexOf("Gym"));

        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double total = 0;

        for (int l = 0; l < expenses.size(); l++) {

            total += expenses.get(l);
        }
        System.out.println(total);

    }

    public static void kockica() {
        Random kockice = new Random();
        int broj;
        for (int i = 0; i < 9; i++) {
            broj = 1 + kockice.nextInt(6);
            System.out.println(broj);
        }
    }
    public static void numberToString(){
        String numberAsString = "2019";
        System.out.println("numberAsString " + numberAsString);
        int number = Integer.parseInt(numberAsString);
        System.out.println("number " + number);
        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString " + numberAsString);
        System.out.println("number " + number);
    }
}