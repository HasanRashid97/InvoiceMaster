public class OpretFaktura {

    Udsteder udsteder1;

    Modtager modtager1;

    FakturaLinje fakturaLinje1;
    FakturaLinje fakturaLinje2;
    FakturaLinje fakturaLinje3;

    Faktura faktura1;

    public static void main(String[] args) {
        new OpretFaktura().run();
    }
    public void run(){
    opretUdsteder();
    opretModtager();
    opretFakturalinje();
    opretFaktura();
    tilføjLinjer();
    tilføjBeløb();
    printFaktura();

    }

    private void opretUdsteder() {
        udsteder1 = new Udsteder("KEA", "Guldbergsgade 5",
                "2200 København N", "Danmark" );
    }

    private void opretModtager() {
        modtager1 = new Modtager("Google Danmark", "Programmeringstræde 69",
                "1150 København K","Danmark");
    }
    private void opretFakturalinje() {
        fakturaLinje1 = new FakturaLinje("Datamatiker", 10, "stk", 500);
        fakturaLinje2 = new FakturaLinje("Multimediedesigner", 1, "stk", 5);
        fakturaLinje3 = new FakturaLinje("Smykkedesigner", 1, "stk", 1);
    }


    private void opretFaktura() {
        faktura1 = new Faktura(32, udsteder1, modtager1);
        faktura1.setFakturaDato("10.04.2023");
        faktura1.setForfaldsDato("20.04.2023");

    }
   private void tilføjLinjer(){
        faktura1.setFakturaLinjer(fakturaLinje1);
        faktura1.setFakturaLinjer(fakturaLinje2);
        faktura1.setFakturaLinjer(fakturaLinje3);
    }

    private void tilføjBeløb(){
        faktura1.setSubTotal();
        faktura1.setMomsBeløb();
        faktura1.setFakturaTotal();
    }
    private void printFaktura(){
        faktura1.printFakturaInfo();
    }

}