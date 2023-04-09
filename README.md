# es_09-Gestione-della-fatturazione
### Un programma che simuli la gestione della fatturazione

Realizzare un programma per gestire la fatturazione, addebitando le fatture ai clienti e accreditando i pagamenti ricevuti. 
<br>Le entità rilevanti per questa descrizione sono il Cliente e la Fattura.

I clienti sono descritti con i loro dati anagrafici e il saldo dei loro pagamenti.

I metodi principali sono:
- addebita per addebitare una fattura al cliente (e quindi il saldo aumenta)
- paga per permettere all'utente di effettuare un pagamento di una fattura (e quindi il saldo diminuisce)
- stampa per visualizzare le informazioni relative ad un cliente

Le fatture sono intestate a un cliente e contengono la descrizione del prodotto acquistato (si suppone un solo tipo di prodotto), la quantità acquistata e il prezzo unitario del prodotto. 

I metodi principali sono:
- calcolaImponibile
- calcolaImposta
- totaleFattura
- emettiFattura
