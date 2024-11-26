package veicoli;

public class Automobile extends VeicoloAMotore{
    private int porte;

    //Costruttore
    public Automobile(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata, int porte) {
        super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
        this.porte = porte;
    }
    public Automobile() {
        super();
        this.porte = 0;
    }

    //get e set
    public int getPorte() { return porte; }
    public void setPorte(int porte) { this.porte = porte; }

    //to string
    @Override
    public String toString() {
        return "AUTOMOBILE:"+super.toString()+"\tNumero porte: "+this.porte;
    }
}
