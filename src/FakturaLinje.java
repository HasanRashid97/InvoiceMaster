public class FakturaLinje {

    private String beskrivelse;
    private int antal;
    private String enhed;
    private double pris;
    private double beløb;

    public FakturaLinje(String beskrivelse, int antal, String enhed, double pris){
        this.beskrivelse = beskrivelse;
        this.antal = antal;
        this.enhed = enhed;
        this.pris = pris;
        this.beløb = antal * pris;
    }

    public String getBeskrivelse(){
        return beskrivelse;
    }

    public int getAntal(){
        return antal;
    }

    public String getEnhed(){
        return enhed;
    }

    public double getPris() {
        return pris;
    }

    public double getBeløb(){
        return beløb;
    }



}



