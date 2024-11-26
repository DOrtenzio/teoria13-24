package garage;

import veicoli.*;

public class Garage {
    private VeicoloAMotore [] veicoli;
    private int veicoliInseriti;

    //Costruttore
    public Garage() {
        this.veicoliInseriti=0;
        this.veicoli=new VeicoloAMotore[15];
    }

    //Metodi
    public int immettiNuovoVeicolo( VeicoloAMotore v ){
        if (veicoliInseriti==15) {
            return -1;
        }else{
            for (int i=0;i<veicoli.length;i++){
                if (veicoli[i]==null){
                    veicoli[i]=v;
                    veicoliInseriti++;
                    return i;
                }
            }
        }
        return -1;
    }
    public VeicoloAMotore estraiVeicolo( int posto ){
        if (veicoli[posto] != null) {
            VeicoloAMotore v = veicoli[posto];
            veicoli[posto] = null;
            veicoliInseriti--;
            return v;
        }
        return null;
    }
    public void stampaSituazionePosti(){
        for (int i=0;i<veicoli.length;i++){
            System.out.println("POSTO "+i+" "+veicoli[i]);
        }
    }
}
