import java.util.concurrent.atomic.AtomicInteger;

abstract class Legemiddel {

  // skal variablene vaere protected eller private?
  // trenger subklassene tilgang til variablene?
  // kan bruke hent metodene i subkassene for aa gi tilgang til variablene
  protected String navn;
  private static AtomicInteger nesteId = new AtomicInteger();
  protected static int id;    // skal dene gjores finale?? Slik at den ikke kan endre?
  protected double pris;
  protected double virkestoff;

  public Legemiddel(String navn, double pris, double virkestoff) {
    this.navn = navn;
    this.pris = pris;
    this.virkestoff = virkestoff;
    id = nesteId.incrementAndGet();
  }

  public int hentId() { return id; }
  public String hentNavn() { return navn; }
  public double hentPris() { return pris; }
  public double hentVirkestoff() { return virkestoff; }

  public String toString() {
    return "Legemiddel [" + hentId() + "] " + hentNavn() + "\nPris: "
    + hentPris() + "\nVirkestoff: " + hentVirkestoff(); 
  }
}