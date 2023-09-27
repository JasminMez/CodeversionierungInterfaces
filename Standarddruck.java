public class Standarddruck implements IDruckbar
{
    public Standarddruck(Person person)
    {

    }

    @Override
    public void drucken(Person person)
    {
        System.out.println("ID: " + person.getID() + " Name: " + person.getLastName());

        if (person instanceof Mitarbeiter)
        {
            Mitarbeiter mitarbeiter = (Mitarbeiter)person;
            System.out.println("Email: " + mitarbeiter.getEmail() + " Position: "+ mitarbeiter.getPosition());
        }

    }
}
