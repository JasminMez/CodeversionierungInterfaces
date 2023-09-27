public class Visitenkartendruck implements IDruckbar
{
    private Mitarbeiter mitarbeiter;
    private IDruckbar drucker;

    public Visitenkartendruck(Mitarbeiter mitarbeiter, IDruckbar drucker)
    {
        try
        {
            if(mitarbeiter !=null)
            {
                setMitarbeiter(mitarbeiter);
            }
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }

       setDrucker(drucker);
    }
    public Mitarbeiter getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(Mitarbeiter mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public IDruckbar getDrucker() {
        return drucker;
    }

    public void setDrucker(IDruckbar drucker) {
        this.drucker = drucker;
    }

    public void drucken(Person person)
    {
        this.drucker.drucken(person);
    }
}
