/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package distributoredibevande.gui;

import javax.swing.JPanel;

/**
 *
 * @author loren
 */
public enum ChoicePanels {
    
    MAIN_PANEL(new SceltaDistributorePanel()),
    OPTIONS_HOT_PANEL(new OpzioniDistributoreCaldoPanel()),
    OPTIONS_COLD_PANEL(new OpzioniDistributoreFreddoPanel()),
    LOAD_HOT_PANEL(new RiempiDistributoreCaldoPanel()),
    LOAD_COLD_PANEL(new RiempiDistributoreFreddoPanel()),
    BUY_HOT_PANEL(new PrelevaBevandeCaldePanel()),
    BUY_COLD_PANEL(new PrelevaBevandeFreddePanel()),
    SUGAR_PANEL(new ZuccheroPanel());
    
    private JPanel panel;

    private ChoicePanels(JPanel panel) {
        this.panel=panel;
    }

    public JPanel getPanel() {
        return panel;
    }
    
    
}
