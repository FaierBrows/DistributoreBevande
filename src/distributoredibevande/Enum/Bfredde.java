/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package distributoredibevande.Enum;

/**
 *
 * @author loren
 */
public enum Bfredde {

    ACQUA("Acqua"),
    COLA("Cola"),
    ARANCIATA("Aranciata"),
    GAZZOSA("Gazzosa");

    private String label;

    private Bfredde(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
