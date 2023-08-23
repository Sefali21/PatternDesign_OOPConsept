package Swing_View.Contoller;

import Swing_View.Model.RechnerModel;
import Swing_View.View.RechnerView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RechnerController {
    private RechnerView rechnerView;
    private RechnerModel rechnerModel;

    public RechnerController(RechnerModel rechnerModel, RechnerView rechnerView){
        this.rechnerView=rechnerView;
        this.rechnerModel=rechnerModel;

        this.rechnerView.setBerechnungsListener(new BerechnungsListener());
    }



    class BerechnungsListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int ersteZahl, zweiteZahl=0;

            try {
                ersteZahl= rechnerView.getErsteZahl();
                zweiteZahl= rechnerView.getZweiteZahl();

                int berechnungsErgebnis = rechnerModel.addiereZweiZahlen(ersteZahl,zweiteZahl);
                rechnerView.setBerechnungsergebnis(berechnungsErgebnis);
            } catch (NumberFormatException ex) {
                rechnerView.zeigeFehlerMeldung("FEHLER: Du musst zwei Zahlen eingeben");
            }
        }
    }


}
