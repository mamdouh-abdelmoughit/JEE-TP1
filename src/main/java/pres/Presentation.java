package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.IMetier;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        DaoImpl2 dao= new DaoImpl2() ;
        MetierImpl metier= new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
