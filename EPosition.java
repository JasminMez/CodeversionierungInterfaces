public enum EPosition
{
    Mitarbeiter ("*"),
    CEO ("*****"),
    Abteilungsleiter("***");

    private String sterne;

    private EPosition(String sterne)
    {
        this.sterne = sterne;
    }
    public String getSterne()
    {
        return sterne;
    }
}
