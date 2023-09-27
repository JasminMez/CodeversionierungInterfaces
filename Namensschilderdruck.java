public class Namensschilderdruck implements IDruckbar
{

    @Override
    public void drucken(Person person)
    {
        if(person instanceof  Mitarbeiter m) //neues Mitarbeiterobjekt m wird erzeugt
        {
            System.out.println(m.getLastName() + " " + m.getID());
            System.out.println(m.getPosition().getSterne());

        }
    }
}
