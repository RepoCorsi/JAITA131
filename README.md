Repository dedicato al corso JAVA contenente esercizi e progetti Java.

## Linguaggio

- **Java**: 100%

## Struttura del Progetto

Il repository contiene materiali didattici e esercizi del corso.

## Come Usare

1. Clona il repository
2. Naviga nella directory desiderata
3. Compila ed esegui i file Java

javac NomeFile.java
java NomeFile

**Come funziona insieme:**

Il codice parte semplice con I/O console di base e variabili, progredisce poi attraverso cicli e metodi per costruire competenze procedurali fondamentali. Collections e Generics insegnano l'utilizzo di strutture dati in modo sicuro. I moduli OOP (testPersona → Ereditarieta → Interfacce) costruiscono la modellazione di oggetti attraverso pattern di ereditarietà e polimorfismo sempre più complessi. La gestione eccezioni scorre in parallelo, mostrando le migliori pratiche per la gestione degli errori. La progressione rispecchia un tipico bootcamp Java: basi → funzioni → strutture dati → oggetti → ereditarietà → gestione errori.

## Come eseguire

Ogni file è un eseguibile autonomo o parte di un package mirato. Per compilare ed eseguire qualsiasi file:

```bash
# Compilare un file
javac HelloWorld.java

# Eseguirlo (nota: nome della classe, non del file)
java primo.HelloWorld

# Per file con package
javac OOP/testPersona/Persona.java
javac OOP/testPersona/TestPersona.java
java testPersona.TestPersona

# Eseguire tutti i file di una directory
javac Collections/*.java
java code.Code
