/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codice;

/**
 *
 * @author matge
 */
public class Transazione {
    private double importo;
    private int giorno;
    private int mese;
    private int anno;
    private String desc;
    private int tipo;
    private char valuta;

    public Transazione(double importo, int giorno, int mese, int anno, String desc, int tipo, char valuta) {
        this.importo = importo;
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
        this.desc = desc;
        this.tipo = tipo;
        this.valuta = valuta;
    }
    
    
}
