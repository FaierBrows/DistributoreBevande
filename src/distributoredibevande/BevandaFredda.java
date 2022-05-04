/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distributoredibevande;

import distributoredibevande.Enum.Bfredde;

/**
 *
 * @author loren
 */
public class BevandaFredda extends Bevanda{
    
    private Bfredde nome;

    public BevandaFredda(Bfredde nome, double prezzo, int id, int quantity) {
        super(prezzo, id, quantity);
        this.nome = nome;
    }


    public Bfredde getNome() {
        return nome;
    }

    public void setNome(Bfredde nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome + "Prezzo: " + super.getPrezzo();
    }
    
    
}
