package garage;

import veicoli.*;
import java.util.Scanner;

public class MainGarage {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Garage garage=new Garage();
        int scelta;
        do {
            System.out.println("Scegli un'opzione: " +
                    "\n0-Aggiungi una tipologia di veicolo;" +
                    "\n1-Estrai un veicolo;" +
                    "\n2-Vedi situazione parcheggio;" +
                    "\n3-Esci");
            scelta=Integer.parseInt(in.next());
            switch (scelta){
                case 0:
                    System.out.println("INSERIMENTO NUOVO VEICOLO");
                    int tipoVeicolo;
                    do {
                        System.out.println("Scegli una tipologia di veicolo seguente:" +
                                "\n0-Furgone;" +
                                "\n1-Automobile;" +
                                "\n2-Motocicletta.");
                        tipoVeicolo=Integer.parseInt(in.next());
                        switch (tipoVeicolo){
                            case 0:
                                System.out.println("Inserire anno d'immatricolazione: ");
                                int annoImm= Integer.parseInt(in.next());
                                System.out.println("Inserire la marca: ");
                                String marca= in.next();
                                System.out.println("Inserire il tipo d'alimentazione: ");
                                String tipoAl= in.next();
                                System.out.println("Inserire la cilindrata: ");
                                int cilindrata= Integer.parseInt(in.next());
                                System.out.println("Inserire la capacità: ");
                                int cap= Integer.parseInt(in.next());
                                if (garage.immettiNuovoVeicolo(new Furgone(annoImm,marca,tipoAl,cilindrata,cap)) == -1)
                                    System.out.println("ERRORE");
                                else
                                    System.out.println("Inserito correttamente");
                                break;
                            case 1:
                                System.out.println("Inserire anno d'immatricolazione: ");
                                int annoImm1= Integer.parseInt(in.next());
                                System.out.println("Inserire la marca: ");
                                String marca1= in.next();
                                System.out.println("Inserire il tipo d'alimentazione: ");
                                String tipoAl1= in.next();
                                System.out.println("Inserire la cilindrata: ");
                                int cilindrata1= Integer.parseInt(in.next());
                                System.out.println("Inserire il numero di porte: ");
                                int numPorte= Integer.parseInt(in.next());
                                if (garage.immettiNuovoVeicolo(new Automobile(annoImm1,marca1,tipoAl1,cilindrata1,numPorte)) == -1)
                                    System.out.println("ERRORE");
                                else
                                    System.out.println("Inserito correttamente");
                                break;
                            case 2:
                                System.out.println("Inserire anno d'immatricolazione: ");
                                int annoImm2= Integer.parseInt(in.next());
                                System.out.println("Inserire la marca: ");
                                String marca2= in.next();
                                System.out.println("Inserire il tipo d'alimentazione: ");
                                String tipoAl2= in.next();
                                System.out.println("Inserire la cilindrata: ");
                                int cilindrata2= Integer.parseInt(in.next());
                                System.out.println("Inserire la tipologia: ");
                                String tipologia= in.next();
                                System.out.println("Inserire il numero di tempi del motore: ");
                                int numTempi = Integer.parseInt(in.next());
                                if (garage.immettiNuovoVeicolo(new Motocicletta(annoImm2,marca2,tipoAl2,cilindrata2,tipologia,numTempi)) == -1)
                                    System.out.println("ERRORE");
                                else
                                    System.out.println("Inserito correttamente");
                                break;
                            default:
                                System.out.println("Scegli solo una fra le opzioni proposte");
                        }
                    }while (tipoVeicolo != 0 && tipoVeicolo != 1 && tipoVeicolo != 2);
                    System.out.println();
                    break;
                case 1:
                    System.out.println("ESTRAZIONE VEICOLO");
                        System.out.println("Inserisci posto");
                        VeicoloAMotore s=garage.estraiVeicolo(Integer.parseInt(in.next()));
                        System.out.println();
                    break;
                case 2:
                    System.out.println("SITUAZIONE VEICOLI");
                    garage.stampaSituazionePosti();
                    break;
                case 3:
                    System.out.println("Ciao");
                    break;
                default:
                    System.out.println("Scegli solo una fra le opzioni proposte");
            }
        }while (scelta!=3);
    }
}