package garage;

import java.util.ArrayList;

public class Garage {

    //Attributi
    private String nome;//nome del garage
    private ArrayList<Macchina> macchine=new ArrayList();//Un ArrayList di Macchine nel garage


    //Costruttore
    public Garage(String nome){
        this.nome = nome;
    }

    //Metodi
    public String getNome(){
        return nome;
    }

    //Parcheggia un veicolo alla volta
    /**
     * Metodo che parcheggia le auto
     * @param veicolo la macchina che devo parcheggiare
     */
    void parcheggia(Macchina veicolo){
        macchine.add(veicolo);
    }

    //Parcheggia un insieme di veicoli tutti insieme
 /**
     * Metodo che parcheggia un insieme di veicoli
     * @param veicoli Array di veicoli da parcheggiare
     */
    void parcheggiaTutti(ArrayList<Macchina> veicoli){
        for (int i = 0; i < veicoli.size(); i++){
            macchine.add(veicoli.get(i));
        }
    }

    /**
     * metodo che elenca le macchine nel garage
     */
    public void elenco(){
        for (Macchina macchina : macchine){
            System.out.println(macchina.getNome());
        }
    }



}
