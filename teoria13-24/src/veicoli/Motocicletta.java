package veicoli;

public class Motocicletta extends VeicoloAMotore{
    private String tipologia;
    private int numTempiMotore;

    //Costruttore
    public Motocicletta(int annoImmatricolazione, String marca, String tipoAlimentazione, int cilindrata, String tipologia, int numTempiMotore) {
        super(annoImmatricolazione, marca, tipoAlimentazione, cilindrata);
        this.tipologia = tipologia;
        this.numTempiMotore = numTempiMotore;
    }
    public Motocicletta() {
        this.tipologia = "ERRORE";
        this.numTempiMotore = 0;
    }

    //get e set
    public String getTipologia() { return tipologia; }
    public void setTipologia(String tipologia) { this.tipologia = tipologia; }

    public int getNumTempiMotore() { return numTempiMotore; }
    public void setNumTempiMotore(int numTempiMotore) { this.numTempiMotore = numTempiMotore; }

    //To string
    @Override
    public String toString() {
        return "MOTOCICLETTA: "+super.toString()+"\tTipologia: "+this.tipologia+"\tTempi del motore: "+this.numTempiMotore;
    }
}
