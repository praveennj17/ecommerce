/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cong.logiware.constant;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author shanmugam
 */
public interface UnitConstant {

    String LBS_VALUE_CONSTANT = "0.4536";
    String KGS_VALUE_CONSTANT = "2.2046";
    String CFT_VALUE_CONSTANT = "0.02832";
    String CBM_VALUE_CONSTANT = "35.31";
    String TWO_DECIMAL_PATTEN_CONSTANT = "###,###,##0.00";
    NumberFormat formatToThreeDecimals = new DecimalFormat("###,###,##0.000");
    NumberFormat formatToTwoDecimals = new DecimalFormat("###,###,##0.00");
    String KGS = "KGS";
    String LBS = "LBS";
    String MT = "MT";

}
