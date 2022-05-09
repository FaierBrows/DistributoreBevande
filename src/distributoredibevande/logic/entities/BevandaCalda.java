/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distributoredibevande.logic.entities;

import distributoredibevande.logic.enums.Bcalde;

/**
 *
 * @author loren
 */
public class BevandaCalda extends Bevanda{
    
    private Bcalde nome;

    public BevandaCalda(Bcalde nome, double prezzo, int id, int quantity) {
        super(prezzo, id, quantity);
        this.nome = nome;
    }

    public Bcalde getNome() {
        return nome;
    }

    public void setNome(Bcalde nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome + "Prezzo: " + super.getPrezzo();
    }
    
}
