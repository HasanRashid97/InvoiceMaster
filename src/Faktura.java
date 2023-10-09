import java.util.ArrayList;

public class Faktura {

    private int fakturaNummer;
    private String fakturaDato;

    private String forfaldsDato;

    private Udsteder udsteder;

    private Modtager modtager;

    private ArrayList<FakturaLinje> fakturaLinjer;
    private double subTotal;

    private double momsBeløb;

    private double fakturaTotal;


    public Faktura(int fakturaNummer, Udsteder udsteder, Modtager modtager){
        this.fakturaNummer = fakturaNummer;
        this.udsteder = udsteder;
        this.modtager = modtager;
        fakturaLinjer = new ArrayList<>();
    }


    public void setFakturaDato(String dato){
        fakturaDato = dato;
    }

    public void setForfaldsDato(String dato){
        forfaldsDato = dato;
    }

    public void setFakturaLinjer(FakturaLinje fakturalinje){
        fakturaLinjer.add(fakturalinje);
    }
    public void setSubTotal() {
        int total = 0;
        for (int i = 0; i < fakturaLinjer.size(); i++){
            total += fakturaLinjer.get(i).getBeløb();
        }
        subTotal = total;
    }
    public void setMomsBeløb (){
        momsBeløb = subTotal*0.25;
        }

    public void setFakturaTotal (){
            fakturaTotal = subTotal+momsBeløb;
        }

    public void printFakturaInfo(){
        System.out.print("\n-------------------------------------------------------------------------------------------");
        System.out.printf("\n%s\n%s\n%s\n%s", modtager.getNavn(), modtager.getAdresse(),
                modtager.getPostnummerBy(), modtager.getLand());

        System.out.printf("\n\n%50s\n%90s\n%57s%33d", "Faktura",
                "-----------------------------------------------", "Fakturanummer:", fakturaNummer);
        System.out.printf("\n%55s%35s", "Fakturadato:", fakturaDato);
        System.out.printf("\n%56s%34s", "Forfaldsdato:", forfaldsDato);
        System.out.printf("\n%56s%34.2f\n\n", "At betale DKK", fakturaTotal);

        System.out.printf("\n%s%20s%20s%20s%20s", "Beskrivelse", "Antal", "Enhed", "Pris", " Beløb\n");
        System.out.print("------------------------------------------------------------------------------------------");
        for (int i= 0; i < fakturaLinjer.size(); i++){
            System.out.printf("\n%-29s%-19d%-19s%-16.2f%-5.2f", fakturaLinjer.get(i).getBeskrivelse(), fakturaLinjer.get(i).getAntal(),
            fakturaLinjer.get(i).getEnhed(), fakturaLinjer.get(i).getPris(), fakturaLinjer.get(i).getBeløb());
        }
        System.out.print("\n-------------------------------------------------------------------------------------------");

        System.out.printf("\n\n\n%62s%28.2f", "Subtotal uden moms:", subTotal );
        System.out.printf("\n%48s%42.2f", "Moms:", momsBeløb);
        System.out.printf("\n%52s%38.2f\n\n", "Total DKK", fakturaTotal);

        System.out.print("\n-------------------------------------------------------------------------------------------");
        System.out.printf("\n%-25s%s", "Din virksomhed:", udsteder.getNavn());
        System.out.printf("\n%-25s%s", "Adresse:", udsteder.getAdresse());
        System.out.printf("\n%-25s%s", "By:", udsteder.getPostnummerBy());
        System.out.printf("\n%-25s%s", "Land", udsteder.getLand());
        System.out.print("\n-------------------------------------------------------------------------------------------");


    }



    }


