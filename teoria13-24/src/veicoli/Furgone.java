package veicoli;

public class Furgone extends VeicoloAMotore{
    private int capacita;

    //Costruttore
    public Furgone(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata, int capacita) {
        super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
        this.capacita = capacita;
    }
    public Furgone() {
        super();
        this.capacita=0;
    }

    //Set e get
    public int getCapacita() { return capacita; }
    public void setCapacita(int capacita) { this.capacita = capacita; }

    //To string
    @Override
    public String toString() {
        return "FURGONE: "+super.toString()+"\tCapacità: "+this.capacita;
    }
}
