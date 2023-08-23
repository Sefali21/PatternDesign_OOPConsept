package Swing_View;

import Swing_View.Contoller.RechnerController;
import Swing_View.Model.RechnerModel;
import Swing_View.View.RechnerView;

public class Main {
    public static void main(String[] args) {
        //new RechnerView();
        new RechnerController(new RechnerModel(), new RechnerView());

    }
}
