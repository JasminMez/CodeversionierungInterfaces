import java.util.UUID;

public class Mitarbeiter extends Person
{

    private String email;
    private EPosition position;

    public Mitarbeiter(String lastName, String email, EPosition position)
    {
        super(lastName);
        setEmail(email);
        setPosition(position);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EPosition getPosition() {
        return position;
    }

    public void setPosition(EPosition position) {
        this.position = position;
    }

}
