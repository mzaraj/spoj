package fangen;

import fangen.enums.WingType;

public class WingPainterFactory {

    public static WingPainter getWingPainter(WingType asteriskTriangle) {
        return new WingPainter();
    }
}
