public class Logodruck implements IDruckbar
{
    public Logodruck(Person person)
    {

    }

    @Override
    public void drucken(Person person)
    {
        System.out.println("\n" + "Ihr Berater für Druck aller Art: " + person.getLastName());
        System.out.println(" ____              _              _ _            _____     _\n" +
                "|    \\ ___ _ _ ___| |_ ___     __| | |___ ___   |  _  |___| |_\n" +
                "|  |  |  _| | |  _| '_| -_|   |. | | | -_|  _|  |     |  _|  _|\n" +
                "|____/|_| |___|___|_|_|___|  |___|_|_|___|_|    |__|__|_| | |\n" +
                "                                                          |__|");


    }
}
