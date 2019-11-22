public class Osoba {
    String firma;
    String adres;
    long NIP;
    long bank;

    public Osoba(){}

    public Osoba(String firma, String adres, long NIP, long bank){
        this.firma = firma;
        this.adres = adres;
        this.NIP = NIP;
        this.bank = bank;
    }

    public Osoba(Osoba os){
        firma = os.firma;
        adres = os.adres;
        NIP = os.NIP;
        bank = os.bank;
    }

}
