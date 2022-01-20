abstract class Legemiddel{
  protected String navn;
  static int globalid=1;
  protected int ID;
  protected double pris;
  protected double virkestoff;

  public Legemiddel(String n, double p, double vs){
    navn=n;
    pris=p;
    virkestoff=vs;
    ID=globalid;
    globalid++;



  }

  public int hentID(){
    return ID;
  }

  public String hentNavn(){
    return navn;
  }

  public double hentPris(){
    return pris;
  }

  public double hentVirkestoff(){
    return virkestoff;
  }

  public void settNyPris(double nypris){
    pris=nypris;
  }


  @Override
  public String toString(){
    return "(ID: "+ ID+ " navn: " + navn +" pris:" + pris + " virkestoff: "+ virkestoff+ ")";
  }



}
