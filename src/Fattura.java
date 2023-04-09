class Fattura {
    private Cliente cliente;
    private Prodotto prodotto;
    private int quantita;

    public Fattura(Cliente cliente, Prodotto prodotto, int quantita) {
        this.cliente = cliente;
        this.prodotto = prodotto;
        this.quantita = quantita;
    }

    public double calcolaImponibile() {
        return this.prodotto.getPrezzoUnitario() * this.quantita;
    }

    public double calcolaImposta() {
        return this.calcolaImponibile() * 0.22; // IVA al 22%
    }

    public double totaleFattura() {
        return this.calcolaImponibile() + this.calcolaImposta();
    }

    public void emettiFattura() {
        double importo = this.totaleFattura();
        this.cliente.addebita(importo);
        System.out.println("Fattura emessa a " + this.cliente.getNome() + " " + this.cliente.getCognome());
        System.out.println("Descrizione prodotto: " + this.prodotto.getDescrizione());
        System.out.println("Quantità: " + this.quantita);
        System.out.println("Prezzo unitario: " + this.prodotto.getPrezzoUnitario());
        System.out.println("Importo imponibile: " + this.calcolaImponibile());
        System.out.println("Importo IVA: " + this.calcolaImposta());
        System.out.println("Totale fattura: " + this.totaleFattura());
    }
}