/*
Maj Klavžar, Programiranje 1
  STEKLENICA (15b)
*/

/**
 * Razred za delo s steklenicami
 * @author Maj Klavžar
 *
 */

public class Steklenica {

//Deklariramo in inicializiramo staticno konstantno lastnost material
public static final String material = "Steklo";

//Deklariramo lastnosti razreda Steklenica
  private int kolicinaVsebine;
  private String vrstaVsebine;
  private boolean jeOdprta;
  private int kapaciteta;


  /**
   * konstruktor, ki ustvari nov objekt tipa Steklenica
   */
  public Steklenica(){
    //Inicializiramo lastnosti objekta
    kolicinaVsebine = 0;  // v ml
    kapaciteta = 0;       // v ml
    vrstaVsebine = "";
    jeOdprta = false;

    System.out.println("Ustvarjam nov objekt tipa Steklenica");
  }

  /**
   * konstruktor, ki ustvari nov objekt tipa Steklenica
   * @param k kapaciteta
   */
  public Steklenica(int k){
    //Inicializiramo lastnosti objekta
    kolicinaVsebine = 0;  // v ml
    kapaciteta = k;       // v ml
    vrstaVsebine = "";
    jeOdprta = false;

    System.out.println("Ustvarjam nov objekt tipa Steklenica z kapaciteto "+kapaciteta);
  }
  
  /**
   * Javna metoda za polnjenje steklenice
   * pristeje natoceno vsebino in doda vrsto kolicine
   * @param k kolicina vsebine
   * @param v vrsta vsebine steklenice
   * @return kolicina po polnjenju
   * @throws Exception Vrne exception ce je steklenica zaprta
   */
  public int napolni(int k, String v) throws Exception{
    //Ce je steklenica odprta, jo napolni
    if(jeOdprta){
      System.out.println("Kolicina pred polnjenjem "+kolicinaVsebine);

      //Kolicini pristejemo k
      kolicinaVsebine += k;

      //Vrsti vsebine dodamo v
      vrstaVsebine += v;

      System.out.println("Kolicina po polnjenju "+kolicinaVsebine);
    }
    else{
      //vrzemo izjemo za neuspesno polnjenje
      throw new Exception("Steklenica je zaprta");
    }
    //vrnemo kolicino vsebine
    return kolicinaVsebine;
  }


  /**
   * Javna metoda za odpiranje steklenice
   * Nastavi jeOdprta lastnost na true;
   * @return true-> uspesno odprta, false-> je ze odprta
   */
    public boolean odpri(){
      if(jeOdprta){
        return false;
      }
      else{
        jeOdprta = true;
        return true;
      }
    }


    /**
     * Definiramo javno boolean metodo za zapiranje steklenice
     * Nastavi jeOdprta lastnost na true;
     * @return true-> uspesno zaprta, false-> je ze zaprta
     */
  public boolean zapri(){
    if(!jeOdprta){
      return false;
    }
    else{
      jeOdprta = false;
      return true;
    }
  }


  /**
   * metoda, ki vrne kolicino v steklenici
   * @return kolicina vsebine
   */
 public int getKolicinaVsebine(){
  return kolicinaVsebine;
 }
}