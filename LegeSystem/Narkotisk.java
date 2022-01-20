class Narkotisk extends Legemiddel{
  protected int styrke;

  public Narkotisk(String navn, double pris, double virkestoff, int s){
    super(navn, pris, virkestoff);
    styrke=s;
  }

  public int hentNarkotiskStyrke(){
    return styrke;
  }


  @Override
  public String toString(){
    return "ID: "+ ID+ " navn: " + navn +" pris:" + pris + " virkestoff: "+ virkestoff + " styrke: " + styrke;
  }

}
