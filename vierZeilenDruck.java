public class vierZeilenDruck implements IDruckbar
{
    @Override
    public void drucken(Person person)
    {
        System.out.println("ID: " + person.getID());
        System.out.println("Name: " + person.getLastName());

        if (person instanceof Mitarbeiter)
        {
            Mitarbeiter mitarbeiter = (Mitarbeiter)person;
            System.out.println("Email: " + mitarbeiter.getEmail());
            System.out.println("Position: "+ mitarbeiter.getPosition());
        }

    }
}
