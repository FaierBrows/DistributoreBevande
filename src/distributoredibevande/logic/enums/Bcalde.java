/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package distributoredibevande.logic.enums;

/**
 *
 * @author loren
 */
public enum Bcalde {
    
    CAFFE("Caffè"),
    LATTE("Latte"),
    CIOCCOLATA("Cioccolata"),
    CAPPUCCINO("Cappuccino");
    
    private String label;

    private Bcalde(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
    
    
}
