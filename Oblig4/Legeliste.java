
public class Legeliste extends OrdnetLenkeliste<Lege> {

  /**
   * Soeker gjennom listen etter en lege med samme navn som `navn`
   * og returnerer legen (uten aa fjerne den fra listen).
   * Hvis ingen slik lege finnes, returneres `null`.
   * @param   navn    navnet til legen
   * @return  legen
   */

  // hva skal vi gjore dersom legelisten er tom??? returnere null??
  public Lege finnLege(String navn) {
    Node gjeldende = hode;
    while(gjeldende.neste != hale) {
      gjeldende = gjeldende.neste;    // gaar her til det forste element i legelisten
      if(gjeldende.data.hentNavn().equals(navn)) {
        return gjeldende.data;      // returnerer legen
      }
    }
    return null;
  }

  /**
   * Returnerer et String[] med navnene til alle legene i listen
   * i samme rekkefoelge som de staar i listen.
   * @return array med navn til alle legene
   */

   // hva skal vi gjore dersom legelisten er tom??? returnere null??
  public String[] stringArrayMedNavn() {
    Node gjeldende = hode;
    String[] legelisteNavn = new String[storrelse()];
    int indeks = 0;
    while(gjeldende.neste != hale) {
      gjeldende = gjeldende.neste;      // forste element i legelisten
      legelisteNavn[indeks] = gjeldende.data.hentNavn();
      indeks++;
    }
    return legelisteNavn;
  }
}