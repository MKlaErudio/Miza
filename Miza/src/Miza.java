/*
Maj Klavžar, Programiranje 1
  Hello World
------------------------------
Java skripta, ki omogoca uporabo graficnega umesnika
------------------------------
 --IZHODNI PODATKI--
Okno graficnega umesnika
------------------------------
*/

//Uvozimo knjiznico za delo z GUI
import javax.swing.*;
//Uvozimo paket za delo z dogotki
import java.awt.event.*;
import java.awt.Font;


//Deklariramo javni razred
public class Miza extends JFrame implements ActionListener{

    //Deklariramo zasebne lastnosti
    private JPanel povrsina;
    private JButton dodajJButton;
    private JTextField znamkaPolje, alkoholPolje;
    private JTable tabela;
    private PivskaSteklenicaTableModel modelTabele;


    //Deklariramo javno staticno metodo main, ki se zazene ob zagonu programa
    //Vhodni parametri: vhodni parametri iz konzole
    //Opis: Ustvarimo novo okno
     public static void main(String[] args){
        Miza m = new Miza("Miza z pivskimi steklenicami");
     }

    //Definiramo konstruktor
    //Vhodni parametri: n - naslov okna
    //Opis: Vrne objekt tipa miza
     public Miza(String n){

        // Klicemo konstruktor nadrazreda
        super(n);

        //Inicializiramo lastnosti
        povrsina = new JPanel();
        dodajJButton = new JButton("Dodaj steklenico");
        znamkaPolje = new JTextField(32);
        znamkaPolje.setFont(new Font("Tahoma", Font.BOLD, 11));
        znamkaPolje.setToolTipText("Sem vnesete znamko piva");
        alkoholPolje = new JTextField(8);
        modelTabele = new PivskaSteklenicaTableModel();
        tabela = new JTable(modelTabele);


        //Povrsino dodamo na mizo
        getContentPane().add(povrsina);

        //Na gumb dodamo actionEvent
        dodajJButton.addActionListener(this);

        //Dodamo gumb in vpisno polje na povrsino
        JLabel label = new JLabel("Znamka");
        label.setLabelFor(znamkaPolje);
        povrsina.add(label);
        povrsina.add(znamkaPolje);
        JLabel label_1 = new JLabel("% alk.");
        label_1.setLabelFor(alkoholPolje);
        povrsina.add(label_1);
        povrsina.add(alkoholPolje);
        povrsina.add(dodajJButton);
        povrsina.add(tabela);


        //Pokazemo okno
        setVisible(true);

        //Nastavimo velikost okna
        setSize(558, 250);

        //Nastavimo obnasanje krizca (x) - da konca aplikacijo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println("Ustvarjam objekt Miza");

     }
    //Metoda, ki jo predpisuje vmesnik Action listener
    //Vhodni parametri: e - Action event 
    //Opis: DOda steklenico na seznam
     public void actionPerformed(ActionEvent e){
        System.out.println("Znamka je: "+znamkaPolje.getText() + " Stopnja alkohola pa: "+alkoholPolje.getText());


        //Dodamo objekt v seznam
        modelTabele.addPivskoSteklenico(new PivskaSteklenica(znamkaPolje.getText(), 500, Float.parseFloat(alkoholPolje.getText())));

    }
}
