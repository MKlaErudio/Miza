import javax.swing.table.DefaultTableModel;

/*
Maj Klavžar, Programiranje 1
  PIVSKA STEKLENICA TABLE MODEL
*/

import javax.swing.table.*;;

public class PivskaSteklenicaTableModel extends DefaultTableModel {
    
    //Konstruktor
    public PivskaSteklenicaTableModel(){
        //Klice konstruktor nadrazreda
        super();

        //V tabelo dodamo stolpce
        addColumn("Znamka");
        addColumn("Stopnje alkohola");        

        //Dodamo naslovno vrstico
        Object[] vrstica = new Object[] {"Znamka test", "Stopnja test"};
        addRow(vrstica);

    }

    //Javna metoda za dodajanje vpisov
    //Vhodni parametri: ps - pivska steklenica
    //Opis: metoda v tabelo doda pivsko steklenico
    public void addPivskoSteklenico(PivskaSteklenica ps){

        //Ustvarimo staticen seznam objektov
        Object[] vrstica = new Object[] {ps.getZnamkaKolicina(), ps.getStopnjaAlkohola()};

        //Dodamo vrstico v tabelo
        addRow(vrstica);
    }
}
