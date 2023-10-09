public class Udsteder {

    private String navn;
    private String adresse;
    private String postnummerBy;
    private String land;


    public Udsteder(String navn, String adresse, String postnummerBy, String land){
        this.navn = navn;
        this.adresse = adresse;
        this.postnummerBy = postnummerBy;
        this.land = land;
    }


    public String getNavn(){
        return navn;
    }

    public String getAdresse(){
        return adresse;
    }

    public String getPostnummerBy(){
        return postnummerBy;
    }

    public String getLand(){
        return land;
    }

}
