import java.util.List;

abstract class Tur {
    private String nume;
    private String ghid;
    private List<Participant> participanti;

    void adaugaParticipant(Participant p) {
        participanti.add(p);
    }

    void afiseazaDetalii()
    {
        System.out.println("Tur: " + nume);
        System.out.println("Ghid: " + ghid);
        System.out.println("Participanți:");
        for (Participant p : participanti) {
            System.out.println(" - " + p);
        }
    }
}
