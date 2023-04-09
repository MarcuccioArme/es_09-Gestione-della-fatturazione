import java.util.Vector;

public class Fatturazione {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Mario", "Rossi", 0);
        Prodotto prodotto1 = new Prodotto("Penna", 0.5);
        Fattura fattura1 = new Fattura(cliente1, prodotto1, 10);
        fattura1.emettiFattura();
        cliente1.stampa();
        cliente1.paga(5);
        cliente1.stampa();
        cliente1.paga(10);
        cliente1.stampa();

        // Esempio con più prodotti
        Cliente cliente2 = new Cliente("Luigi", "Verdi", 0);
        Prodotto prodotto2 = new Prodotto("Quaderno", 1.5);
        Prodotto prodotto3 = new Prodotto("Matita", 0.3);
        Vector<Fattura> fattureCliente2 = new Vector<>();
        fattureCliente2.add(new Fattura(cliente2, prodotto2, 5));
        fattureCliente2.add(new Fattura(cliente2, prodotto3, 20));
        for (Fattura fattura : fattureCliente2) {
            fattura.emettiFattura();
        }
        cliente2.stampa();
        cliente2.paga(15);
        cliente2.stampa();
    }
}