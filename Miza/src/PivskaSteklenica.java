import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

/*
Maj Klavžar, Programiranje 1
  PIVSKA STEKLENICA
------------------------------
Java skripta ki ustvari Pivsko steklenico ki dedkuje po Steklenici
------------------------------
 --VHODNI PODATKI--

------------------------------
 --IZHODNI PODATKI--

------------------------------
*/

//Deklariramo javni razred, ki razsirja steklenico in implementira vmesnik AlkoholnaPijaca
public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca {
    
    //Vse lastnosti razred a se prenesejo
    //deklariramo nove lastnosti

    private String znamka;
    private boolean jePovratna;
    private float temperatura;
    private double stopnjaAlkohola;

    //Javni konstruktor
    //Vhodni parametri: z - znamka, k - kapaciteta, s - stopnja alkohola
    //Opis: ustvari nov objekt PivskatSteklenica (Predvidevamo da ni povratna)
    //Izhodni parametri: nov objekt
    public PivskaSteklenica(String z, int k, double s){
//-----tukaj ne sme biti nic razen komentarja ----
        //poklicemo konstruktor nadrazreda
        super(k);
        
        //naponi steklenico - klicmo metodo, deklarirano v nadrazredu
        try{
            odpri();
            napolni(200, "Pivo");
            zapri();
        }
        catch(Exception e){
            System.out.println("Napaka pri polnjenu pivske steklenice: "+e);
        }

        //Inicializiramo se ostale lastnosti

        temperatura = 22.5f;
        znamka = z;
        jePovratna = false;
        stopnjaAlkohola = s;

    }

    //Javna metoda, ti ohladi pivo za zeljeno temperaturo
    //Vhodni parametri: t - temperatura
    //Opis: nastavi temperaturo piva za zelejeno temperaturo
    //Izhodni parametri: nov objekt
    public void ohladi(float t){
        System.out.println("Hladim "+znamka+" iz "+temperatura);
        temperatura -= t;
        System.out.println(" na "+temperatura);
    }

    //Javna metoda, ki vrne znamko in kolicino
    //Opis: vrne znamko in kolicino
    //Izhodni parametri: niz z znamko in kolicino ter vsebino
    public String getZnamkaKolicina(){
        //Vrnemo string
        return znamka + ", "+ getKolicinaVsebine() + " ml";
    }

    //Implementiramo metodo, ki vrne stopnjo alkohola in jo predpisuje vmesnik AlkoholnaPijaca
    //Opis: vrne stopnjo alkohola
    //Izhodni parametri: double - stopnja alkohola
    public double getStopnjaAlkohola(){
        return stopnjaAlkohola;
    }
}
