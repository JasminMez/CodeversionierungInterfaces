import java.util.UUID;

public class Main
{
    public static void main(String[] args)
    {
        Namensschilderdruck namensschilderdruck = new Namensschilderdruck();
        Mitarbeiter ma1 = new Mitarbeiter("Meier","h.meier@tsn.at", EPosition.Mitarbeiter);
        Visitenkartendruck visitenkartendruck = new Visitenkartendruck(ma1,new Rahmendurck());
        visitenkartendruck.drucken(ma1);

        System.out.println("");
        Mitarbeiter ma2 = new Mitarbeiter("Hofer", "a.hofer@tsn.at", EPosition.CEO);
        Visitenkartendruck visitenkartendruck1 = new Visitenkartendruck(ma2, new vierZeilenDruck());
        visitenkartendruck1.drucken(ma2);

        System.out.println("");
        IDruckbar logo = new Logodruck(ma2);
        logo.drucken(ma2);

        Mitarbeiter ma3 = new Mitarbeiter("Müller", "t.müller.at", EPosition.Abteilungsleiter);
        Visitenkartendruck visitenkartendruck2 = new Visitenkartendruck(ma2, new Doppelrahmendruck());
        visitenkartendruck2.drucken(ma2);


    }
}