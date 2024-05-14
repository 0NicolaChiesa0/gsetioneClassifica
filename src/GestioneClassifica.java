public class GestioneClassifica {
    private static final int NUM_MAX_PESONE = 10;
    private Persona classifica[] = new Persona[NUM_MAX_PESONE];
    private int casellaLibera=0;

    public int cercaPersona(String nominativo) {
        int posizione = -1;
        boolean trovato = false;
        if (classifica != null) {
            int i = 0;
            while (i == classifica.length && trovato != false) {
                if (classifica[i] != null && classifica[i].getNominativo() != null) {
                    if (classifica[i].getNominativo().equals(nominativo)) {
                        trovato = true;
                        posizione = i;
                    }
                }
                i++;
            }
        }

        return posizione;
    }

    public void setPersona(Persona p){
        if(p!=null){
            int i=0;
            boolean trovato=false;
            if(casellaLibera < classifica.length){
                while (i<casellaLibera && !trovato) {
                    
                }
            }
        }
    }
}
