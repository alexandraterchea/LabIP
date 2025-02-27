import java.util.List;

abstract class Tur {
    private String _nume;
    private String _ghid;
    private List<Participant> participanti;

    public String getName()
    {
        return _nume;
    }
    public String getGhid()
    {
        return _ghid;
    }
    public void setName(String nume)
    {
        _nume=nume;
    }
    public void setGhid(String ghid)
    {
        _ghid=ghid;
    }

    void adaugaParticipant(Participant p) {
        participanti.add(p);
    }

    void afiseazaDetalii()
    {
        System.out.println("Tur: " + getName());
        System.out.println("Ghid: " + getGhid());
        System.out.println("Participanți:");
        for (Participant p : participanti) {
            System.out.println(" - " + p);
        }
    }
}
