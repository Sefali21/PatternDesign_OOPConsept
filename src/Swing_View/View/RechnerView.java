package Swing_View.View;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.awt.*;

public class RechnerView extends JFrame{
    private JTextField txt_erste_zahl=new JTextField(10);
    private JTextField txt_zweite_zahl=new JTextField(10);
    private JTextField txt_berechnungs_ergebnis=new JTextField(10);
    private JLabel lbl_addition=new JLabel("+");
    private JButton btn_berechnungs=new JButton("Berechne");

    public RechnerView() {
        JPanel pnl_brechnung=new JPanel();
        pnl_brechnung.setBackground(Color.ORANGE);

        pnl_brechnung.add(this.txt_erste_zahl);
        pnl_brechnung.add(this.lbl_addition);
        pnl_brechnung.add(this.txt_zweite_zahl);
        pnl_brechnung.add(this.btn_berechnungs);
        pnl_brechnung.add(this.txt_berechnungs_ergebnis);



        //hinzufügen der Komponentenzum Panel
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);
        this.add(pnl_brechnung);
        this.setVisible(true);




    }

    public int getErsteZahl(){
        String buffer=this.txt_erste_zahl.getText();
        return Integer.parseInt(buffer);
    }
    public int getZweiteZahl(){
        String buffer=this.txt_zweite_zahl.getText();
        return Integer.parseInt(buffer);
    }

    public void setBerechnungsergebnis(int berechnungsergebnis){
        this.txt_berechnungs_ergebnis.setText(Integer.toString(berechnungsergebnis));

    }

    public void zeigeFehlerMeldung(String fehlerMeldung){
        JOptionPane.showMessageDialog(this, fehlerMeldung);
    }

    public void setBerechnungsListener(ActionListener actionListener){
        this.btn_berechnungs.addActionListener(actionListener);

    }


}


