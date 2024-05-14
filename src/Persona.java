public class Persona {
    String nominativo;
    int punteggio;

    public Persona() {
        punteggio = 0;
    }

    public Persona(String nominativo, int punteggio) {
        this();
        setNominativo(nominativo);
        setPunteggio(punteggio);
    }

    public Persona(Persona p) {
        this(p.getNominativo(), p.getPunteggio());
    }

    public void setNominativo(String nominativo) {
        // if (nominativo != null){
        this.nominativo = nominativo;
        // }
    }

    public String getNominativo() {
        return nominativo;
    }

    public void setPunteggio(int punteggio) {
        if (punteggio <= 10 && punteggio >= 0) {
            this.punteggio = punteggio;
        }
    }

    public int getPunteggio() {
        return punteggio;
    }

    public int equals(Persona p) {
        int confronto = -2;
        if (p != null && this != null && p.getNominativo()!=null && this.getNominativo()!=null) {
            if (p.getNominativo() == this.getNominativo()) {
                confronto = 1;
            } else {
                confronto = -1;
            }
        }
        return confronto;
    }

}
