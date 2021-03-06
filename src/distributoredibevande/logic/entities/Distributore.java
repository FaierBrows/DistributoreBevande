/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distributoredibevande.logic.entities;

import distributoredibevande.logic.exceptions.EndedQuantityExceptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author loren
 */
public class Distributore {

    private static Distributore _instance = null;
    private Map<Integer, BevandaCalda> bevandeCaldeMap = new HashMap<>();
    private Map<Integer, BevandaFredda> bevandeFreddeMap = new HashMap<>();

    public static Distributore getInstance() {
        if (_instance == null) {
            _instance = new Distributore();
        }
        return _instance;
    }

    private Distributore() {
    }

    public BevandaCalda selectBevandaCalda(int id) throws EndedQuantityExceptions {
        if (!this.bevandeCaldeMap.containsKey(id)) {
            throw new EndedQuantityExceptions(EndedQuantityExceptions.Field.NOTFOUND, "Il prodotto non esiste");
        }
        BevandaCalda bevanda = this.bevandeCaldeMap.get(id);
        if (bevanda.getQuantity() <= 0) {
            throw new EndedQuantityExceptions(EndedQuantityExceptions.Field.OUTOFSTOCK, "Il prodotto è finito");
        }
        return (BevandaCalda) bevanda.extract();
    }

    public BevandaFredda selectBevandaFredda(int id) throws EndedQuantityExceptions {
        if (!this.bevandeFreddeMap.containsKey(id)) {
            throw new EndedQuantityExceptions(EndedQuantityExceptions.Field.NOTFOUND, "Il prodotto non esiste");
        }
        BevandaFredda bevanda = this.bevandeFreddeMap.get(id);
        if (bevanda.getQuantity() <= 0) {
            throw new EndedQuantityExceptions(EndedQuantityExceptions.Field.OUTOFSTOCK, "Il prodotto è finito");
        }
        return (BevandaFredda) bevanda.extract();
    }

    public void load(Bevanda... bevande) {
        for (Bevanda bevanda : bevande) {
            if (bevanda instanceof BevandaCalda) {
                this.bevandeCaldeMap.put(bevanda.getId(), (BevandaCalda) bevanda);
            } else if (bevanda instanceof BevandaFredda) {
                this.bevandeFreddeMap.put(bevanda.getId(), (BevandaFredda) bevanda);
            }
        }
    }

    public void addQuantity(int id, int quantity, boolean caldo) throws EndedQuantityExceptions {
        if (caldo) {
            if (!this.bevandeCaldeMap.containsKey(id)) {
                throw new EndedQuantityExceptions(EndedQuantityExceptions.Field.NOTFOUND, "Il prodotto non esiste");
            }
            this.bevandeCaldeMap.get(id).setQuantity(quantity);
        } else {
            if (!this.bevandeFreddeMap.containsKey(id)) {
                throw new EndedQuantityExceptions(EndedQuantityExceptions.Field.NOTFOUND, "Il prodotto non esiste");
            }
            this.bevandeFreddeMap.get(id).setQuantity(quantity);
        }
    }
}
