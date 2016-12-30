package com.cong.logiware.util;

import java.io.Serializable;

/**
 *
 * @author sunil
 */
public class MeasureUtil implements Serializable{

    public static double getCBM(Double cft) {
        if (cft == null) {
            return 0d;
        }
        double v = cft / 35.314;
        return v;
    }

    public static double getCFT(Double cbm) {
        if (cbm == null) {
            return 0d;
        }
        double v = cbm * 35.314;
        return v;
    }

    public static double getKGS(Double lbs) {
        if (lbs == null) {
            return 0d;
        }
        double v = lbs * 0.45359237;
        return v;
    }

    public static double getLBS(Double kgs) {
        if (kgs == null) {
            return 0d;
        }
        double v = kgs * 2.20462262;
        return v;
    }
}
