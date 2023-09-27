import java.util.UUID;

public abstract class Person
{
    private UUID id;
    private String lastName;

    public Person(String lastName)
    {
        setID(UUID.randomUUID());
        setLastName(lastName);
    }

    public UUID getID() {
        return id;
    }

    public void setID(UUID id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
