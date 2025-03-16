package ma.khairy.presentation;

import ma.khairy.dao.DaoImpl;
import ma.khairy.ext.DaoImplV2;
import ma.khairy.metier.MetierImpl;

public class presentationV1 {
    public static void main(String[] args) {
        /**
         * injection de deps par instanciation statique --> new ...()
         */
        DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl(dao); //injection via le constructeur
        //metier.setdao(dao); //injection via setter
        System.out.println(metier.calcul());


    }
}
