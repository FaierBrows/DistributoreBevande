package distributoredibevande;

import distributoredibevande.exeptions.EndedQuantityExeptions;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loren
 */
public abstract class Bevanda {
    
    private double prezzo;
    private int quantity;
    private int id;

    public Bevanda(double prezzo, int id, int quantity) {
        this.prezzo= prezzo;
        this.quantity= quantity;
        this.id = id;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }
    
    public Bevanda extract() throws EndedQuantityExeptions{
        if(this.quantity<0){
            throw new EndedQuantityExeptions(EndedQuantityExeptions.Field.OUTOFSTOCK, "Il prodotto è finito");
        }
        this.quantity--;
        return this;
    }
    
    
    
    
}
