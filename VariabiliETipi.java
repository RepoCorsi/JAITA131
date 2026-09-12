package variabilietipi;

public class VariabiliETipi {

    public static void main(String[] args){

        // Il nome di una variabile non deve iniziare con un numero. permesso solo
        // underscore.
        // non deve avere spazio tra le parole
        // camelCase.
        // permessi: nome, nome1, $anno, _eta, codiceFiscale, codice_fiscale
        // non permessi: 1nome, #eta
        // { ..... } blocco di codice tra parentesi graffe
        // non posso avere due variabili con lo stesso nome nello stesso blocco/ scope:
        // {
//         int v = 1;
//         int v = 2;
        // }
        
        /*
		 * 
		 * ALLE VARIABILI POSSO DARE UN VALORE:
		 * 
		 * //ESEMPI ERRATI 6 = 7; // 6 non è una variabile int a = 7.1; //di nuovo: un
		 * decimale dentro un intero. Tipi non compatibili int h = "Ferdinando"; // una
		 * String dentro un intero. Tipi non compatibili String s = 7; //Un intero
		 * dentro una stringa. Tipi non compatibili //ESEMPI VALIDI int a = 6; double b
		 * = 7; //funziona. Un intero è un caso particolare dei decimali String s = "7";
		 * //le virgolette rendono il valore “7” un testo. double c = a+2; //funziona,
		 * il valore di una variabile è determinata da un’altra
         */
        /**
         * *************************
         * TIPI NUMERICI PRIMITIVI
           ********************************
         */
        // ---------Tipi Interi----------------------
        byte b = 1; // -128 +127 in tutto 256, perchè 2^8=256 cioè 128+127+il segno
        short sh = 1; // -32768 +32767 in tutto 65.535, perchè 2^16=65.535 cioè 32768+32767+il segno
        int i = 1; // più di -2miliardi +2miliardi in tutto 4 milardi e 3, perchè somma + il segno

        // Gli int possono essere rappresentati anche così per chiarezza di lettura:
        int visualizzazioni = 123_456_789;// underscore dopo le cifre

        System.out.println(visualizzazioni);

        // quattro operazioni + modulo
        int primo = 10;
        int secondo = 5;
        System.out.println(primo + secondo);// 15
        System.out.println(primo - secondo);// 5
        System.out.println(primo * secondo);// 50
        System.out.println(primo / secondo);// 2
        System.out.println(primo % secondo);// 0 resto, non risultato, 10%3=1 perchè 3X3==9 e resta 1

        // ordine di esecuzione istruzioni da sinistra a destra così come scritte
        // molt e div hanno la stessa priorità.
        // Quindi==10*(10/5)+3-1*(4/2) = 21
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2); // 21

        // Declaring longs, floats and doubles
        long l = 1L; // ci va la L perchè il tipo predefinito è int
        long lungo = 3_123_456_789L;// Se non metto la L lui lo considera int anche se dichiarato Long
        System.out.println(lungo);

        // -------Variabili di tipo decimale----------------------
        float f = 1.5F;// Ci va la F perchè il tipo predefinito per i numeri con la virgola è Double
        double d = 2.1;// Non serve la d perchè è il tipo predefinito

        System.out.println("Byte: " + b + "\n" + 
                           "Short: " + sh + "\n" + 
                           "Int: " + i + "\n" + 
                           "Long: " + l + "\n"+ 
                           "Float: " + f + "\n" + 
                           "Double: " + d);

        // come rappresenteresti l'età di una persona?
        // va bene byte perchè è fino a 127 cifre
        /**
         * *********************** TIPI CARATTERI ***********************************
         */
        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';

        char euro = '\u20AC'; // Carattere unicode
        // https://www.rapidtables.com/code/text/unicode-characters.html

        char c1 = '1';
        char c2 = '2';
        char c3 = '3';

        // System.out.print(euro);
        // System.out.print(c1);
        // System.out.print(c2);
        // System.out.println(c3);
        char aMaiuscola = 65;// dalla tabella ascii
        System.out.println(aMaiuscola);

        aMaiuscola++;// B
        System.out.println(aMaiuscola);// B

        char aMinuscola = 'a';
        aMinuscola++; // si può aumentare un carattere perchè è memorizzato come numero
        System.out.println(aMinuscola);

        /**
         * ******************** BOOLEANI *******************************
         */
        boolean vero = true;
        boolean falso = false;

        System.out.println("il valore di vero è " + vero);
        System.out.println("il valore di falso è " + falso);

        int eta = 18;
        boolean maggiorenne = eta > 18;// true

        boolean b3 = !vero;
        System.out.println("il valore di  b3 è " + b3);

//      int i2 = 0;
//	boolean b4 = i2; //non posso convertire un boolean in un numero, neanche col cast.
        // non vale l'associazione 0==false
        // *********ESPRESSIONI:****************
        int base = 4;
        int altezza = 6;
        int area = base * altezza;

        // --------------------------- Costanti --------------------------------------
        final double PI = 3.14159;
        // Le costanti si dichiarano con final, e il loro valore non può essere
        // modificato
        System.out.println(PI);

        /**
         * ********************** CAST ******************************
         */
        // Cast implicito: int ci sta in un long, quindi viene convertito
        // automaticamente
        int i1 = 56;
        long l1 = i1; // ok. int in un long
        System.out.println("Il risultato di l1 è " + l1);

        int a = 10;
        double dbl = a; // ok. int in un double. Gli aggiunge 0 come decimale

        System.out.println(dbl); // 10.0 gli aggiunge i decimali

        // Cast esplicito, dobbiamo specificare noi il tipo di conversione
        // perchè il long non ci sta nell'int. Rischio di perdita di valori.
        long l2 = 56L;
        int i2 = (int) l2; // cast di un long in un int
        System.out.println("Il risultato di i2 è " + i2);

        // Cast esplicito, dobbiamo specificare noi il tipo di conversione
        // perchè il double ha la virgola e l'int no. Perdita di cifre decimali.
        double d3 = 3.9999999999d;
        int i3 = (int) d3; // cast di un double in un int. Perdita di decimali.
        System.out.println("Il risultatodi i3 è " + i3);

        long l5 = 56L;
        float f5 = (float) l5; // cast di un long in un float. Aggiunge 0 come decimale
        System.out.println("Il risultato di f5 è " + f5);

        // Overflow
        int num = 130;
        // anche se faccio la conversione non va bene perchè byte va da -128 a +127
        // quindi quando arriva a 127 torna indietro e fa -128,-127, -126
        byte piccolo = (byte) num; // 130 è più grande di byte e quindi torna indietro a -126
        System.out.println(num + " " + piccolo);// -126 torna indietro di 3 partendo da -128

        /// ATTENZIONE AI TIPI PREDEFINITI (INT)!!!
        byte mioByte1 = 12;
        byte mioByte2 = 15;
        // la somma di 2 byte non sempre ritorna un byte. Questo ritorna 27 che per java
        // è un int
        // byte tot = (mioByte1 + mioByte2);
        byte tot = (byte) (mioByte1 + mioByte2);// ritorna 27. il tipo predefinito è int e quindi bisogna convertirlo
        // la stessa cosa vale con short. non ho fatto l'esempio perchè è uguale

        int i4 = 10;
        short valore = (byte) (short) (i4 - 5);// doppia conversione
        System.out.println("Il risultato di valore è " + valore);

        int prova = (int) c1;// conversione da carattere '1' a valore ascii.
        System.out.println("Il risultato di prova è " + prova);

        System.out.println("----------------------");
        char lettera = 'a';
        int ascii = (int) lettera;
        System.out.println(ascii);// 97 a
        ascii = ascii + 1;// 98 b
        ascii += 1;// 99 c
        ascii++;// 100 d
        System.out.println(ascii);
        System.out.println("----------------------------");
        
        // Il contrario, da numero ascii a carattere letterale
        char carattere = (char) 100; // d
        System.out.println(carattere);
        
        // Pre Incremento Post Incremento
        int x = 10;
        System.out.println(x++);// stampa 10 ma vale (11)
        System.out.println(++x);// stampa 12
        System.out.println(x--);// stampa 12 ma vale (11)
        System.out.println(--x);// stampa 10
        
        /**
         * ******************* WRAPPER **********************************
         *WRAPPER CLASS: Sono Classi che estendono le funzionalità dei tipi primitivi
         */

        Boolean bool = true;
        Character chara = '@';
        Integer intero = 123;
        Double virgola = 3.14;

        // Declaring a byte value
        byte bMin = Byte.MIN_VALUE;
        byte bMax = Byte.MAX_VALUE;

        System.out.println("Range byte è " + bMin + " " + bMax);

        // Declaring a short
        short sMin = Short.MIN_VALUE;
        short sMax = Short.MAX_VALUE;
        System.out.println("Range short è " + sMin + " " + sMax);

        // Declaring an int
        int iMin = Integer.MIN_VALUE;
        int iMax = Integer.MAX_VALUE;
        System.out.println("Range int è " + iMin + " " + iMax);

        // Declaring a long
        long lMin = Long.MIN_VALUE;
        long lMax = Long.MAX_VALUE;
        System.out.println("Range long è " + lMin + " " + lMax);

        // Declaring a float
        float fMin = Float.MIN_VALUE;
        float fMax = Float.MAX_VALUE;
        System.out.println("Range float è " + fMin + " " + fMax);

        // Declaring a double
        double dMin = Double.MIN_VALUE;
        double dMax = Double.MAX_VALUE;
        System.out.println("Range double è " + dMin + " " + dMax);

        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

        String str = "TruE".toLowerCase();
        boolean b5 = Boolean.parseBoolean(str);// Trasforma la stringa in un booleano
        System.out.println("il valore di  b5 è " + b5);

        int y = 0;
        // boolean b1=(boolean)(y);//cast numerico su boolean non si può fare!

        // da Stringa a Numero con Integer.parseInt( "..." )
        String uno = "1";
        int numeroConvertito = Integer.parseInt(uno);
        System.out.println(numeroConvertito);

        // il contrario, da numero a stringa:
        int n = 10;
        String dieci = Integer.toString(n); // converte il numero n in una stringa
        System.out.println(dieci);// 10 come Stringa

        // Massimo tra 2 numeri
        int num1 = 3;
        int num2 = 4;
        Integer massimo = Integer.max(num1, num2);

        System.out.println("il maggiore tra " + num1 + " e " + num2 + " è " + massimo);

        // parlare delle 4 operazioni e roba varia
        
        ////////// SCAMBIO 2 VARIABILI
        int var1 = 3;
        int var2 = 8;
        System.out.println(var1 + ", " + var2); // 3 - 8
        // Per scambiare 2 variabili c'è bisogno di una terza variabile
        int temp = var1;
        var1 = var2;
        var2 = temp;
        System.out.println(var1 + ", " + var2); // 8 - 3


        // ******VAR//////////////
        // Posso dichiarare una variabile con var, e prende il tipo dal valore che gli
        // metto dentro.
        // Non posso più cambiare il tipo di dato
        var miaVariabile = 10;
        // miaVariabile="hello"; NO // Non posso più cambiare il tipo di dato

    }// Fine Main
       
}// Fine classe

//Esercizi:
//calcolo perimetro rettangolo base25 altezza 40
//Programma che calcola l'area del (cerchio pi*r*r) e il (perimetro 2*pi*r) con raggo a piacere
//Definire una costante pi 
//dichiare la variabile raggio con valore a piacere.
//dichiarare la variabile Area.
// stampare il valore del raggio e dell'area.

//Slide errore programmi
