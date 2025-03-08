package presentation;

import extension.DaoImpl2;
import metier.MetierImpl;

public class presStatique {
    public static void main(String[] args) {
        DaoImpl2 d = new DaoImpl2();
        MetierImpl metier = new MetierImpl(d);
        System.out.println(metier.calcul());
    }
}
