class Cliente {
    private String nome;
    private String cognome;
    private double saldo;

    public Cliente(String nome, String cognome, double saldo) {
        this.nome = nome;
        this.cognome = cognome;
        this.saldo = saldo;
    }

    public void addebita(double importo) {
        this.saldo += importo;
    }

    public void paga(double importo) {
        if (this.saldo >= importo) {
            this.saldo -= importo;
        } else {
            System.out.println("Pagamento non consentito: saldo insufficiente");
        }
    }

    public void stampa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cognome: " + this.cognome);
        System.out.println("Saldo: " + this.saldo);
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public double getSaldo() {
        return saldo;
    }
    
}