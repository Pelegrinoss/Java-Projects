package Covek;
import java.util.Scanner;

public class Matematika {
    public void racunica(String znak) {

        System.out.println("Tvoj omiljeni matematicki znak je "+znak);

        System.out.println("Aj malo matematike za Lazara, posto mi je predavao :D");

        Scanner prviBroj = new Scanner(System.in);
        double x, y, c, d, f, g, v;
        System.out.println("Unesi prvi broj");
        x = prviBroj.nextInt();

        Scanner drugiBroj = new Scanner(System.in);

        System.out.println("Unesi drugi broj");
        y = drugiBroj.nextInt();

        System.out.println("Evo ti svi operatori matematicki na gomili");

        c = x + y;
        System.out.println(c);
        d = x - y;
        System.out.println(d);
        f = x * y;
        System.out.println(f);
        g = x / y;
        System.out.println(g);
        v = x % y;
        System.out.println(v);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
    }
}