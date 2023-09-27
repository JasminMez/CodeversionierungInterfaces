public class Doppelrahmendruck implements IDruckbar
{
    @Override
    public void drucken(Person person)
    {
        if(person instanceof Mitarbeiter m) //neues Mitarbeiterobjekt m wird erzeugt
        {
            String zeile1 = m.getID() + " " + m.getLastName();
            String zeile2 = m.getEmail() + " " + m.getPosition();

            String maxZeile = zeile1;
            String minZeile = zeile2;


            if(maxZeile.length() < zeile2.length())
            {
                maxZeile = zeile2;
                minZeile = zeile1;
            }

            int differenz = maxZeile.length() - minZeile.length();

            doppelRahmenDrucken(maxZeile);
            if(zeile1.length() == maxZeile.length())
            {
                System.out.println("\n** " + zeile1 + " **");
                System.out.println("** " + zeile2 + abstandDrucken(differenz) + " **");
            }
            else
            {
                System.out.println("\n** " + zeile1 + abstandDrucken(differenz) + " **");
                System.out.println("** " + zeile2 + " **");
            }
            doppelRahmenDrucken(maxZeile);
            System.out.println("");
        }
    }
    private void doppelRahmenDrucken(String maxZeile)
    {
        for (int i = 0; i < 2; i++)
        {
            System.out.println();
            for (int j = 0; j < maxZeile.length() + 6; j++)
            {
                System.out.print("*");
            }
        }
    }

    private String  abstandDrucken(int differenz)
    {
        String abstand = "";
        for (int i = 0; i < differenz; i++)
        {
            abstand = abstand + " ";
        }
        return abstand;
    }
}
