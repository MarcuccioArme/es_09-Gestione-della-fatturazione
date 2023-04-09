class Prodotto {
    private String descrizione;
    private double prezzoUnitario;

    public Prodotto(String descrizione, double prezzoUnitario) {
        this.descrizione = descrizione;
        this.prezzoUnitario = prezzoUnitario;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public double getPrezzoUnitario() {
        return this.prezzoUnitario;
    }
}