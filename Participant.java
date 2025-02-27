class Participant {
    private String _name;
    private int _varsta;
    private String _nrTelefon;
    private String _email;

    //settere
    void setName(String name){
        _name = name;
    }

    void setVarsta(int varsta){
        _varsta = varsta;
    }

    void setNrTelefon(String nrTelefon){
        _nrTelefon = nrTelefon;
    }

    void setEmail(String email){
        _email = email;
    }

    //gettere
    String getName() {
        return _name;
    }

    int getVarsta() {
        return _varsta;
    }

    String getNrTelefon() {
        return _nrTelefon;
    }
    String getEmail() {
        return _email;
    }

}
