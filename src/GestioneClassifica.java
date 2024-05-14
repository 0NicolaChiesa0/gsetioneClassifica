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

    public void setPersona(Persona persona){
        if (persona!=null){
            int i = 0;
            boolean trovato = false;
            if (casellaLibera < classifica.length){
                while (i <casellaLibera && !trovato){
                    if (persona.getPunteggio()>classifica[i].getPunteggio()){
                        for (int j = casellaLibera-1; j > i; j--){
                            classifica[j+1] = classifica[j];
                        }
                        classifica[i] = persona;
                        trovato = true;
                    }
                    i++;
                }
                if (!trovato){
                    classifica[casellaLibera] = persona;
                }
                casellaLibera++;
            }
        }

    }

    public double calcoloMedia(){
        double media = 0;
        for (int i = 0; i < casellaLibera; i++){
            media += classifica[i].getPunteggio();
        }
        media = media / casellaLibera;

        return media;
    }

    public int persona2(Persona p){
        int reult =-1;
        if(p!=null){
            if(num_persone<10){
                this.classifica[num_persone++] = new Persona(p);
                int i =num_persone;
                boolean trovato=false;
                while(i>1 && !trovato){
                    i--;
                    if (classifica[i].getPunteggio()<classifica[i-1].getPunteggio()){
                        Persona temp = classifica[i];
                        classifica[i]=classifica[i-1];
                        classifica[i-1]=temp;
                        temp=null;
                    }
                    
                }
            }
        }
    }

    public int killPersona(String nominativo){
        int pos=cercaPersona(nominativo);
        if(pos!=-1){
            classifica[pos]=null;
            for (int i = pos; i < classifica.length; i++) {
                classifica[i]= classifica [i+1];
            }
            classifica[--num_persone]=null;
        }
        return pos;
    }



}
