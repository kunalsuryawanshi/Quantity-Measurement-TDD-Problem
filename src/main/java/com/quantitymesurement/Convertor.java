package com.quantitymesurement;

/**
 * @author KUNAL SURYAWANSHI
 */
public class Convertor {
    private static final double FEET_TO_YARD = 3.0;
    private static final double YARD_TO_INCH = 36.0;
    private static final double INCH_TO_YARD = 36.0;
    private static final double YARD_TO_FEET = 3.0;
    private static final double INCH_TO_CENTIMETER = 2.5;

    /**
     * @param feet
     * @return feet to inch
     */
    public double feetIntoYard(double feet) {
        return feet / FEET_TO_YARD;
    }

    /**
     * @param yard
     * @return inch to yard
     */
    public double inchToYard(double yard) {
        return yard * INCH_TO_YARD;
    }

    /**
     * @param inch
     * @return yard to inch
     */
    public double yardToInch(double inch) {
        return inch / YARD_TO_INCH;
    }

    /**
     * @param yard
     * @return yard to feet
     */
    public double yardIntoFeet(double yard) {
        return yard * YARD_TO_FEET;
    }

    /**
     * @param inch
     * @return inch to centimeter
     */
    public double inchToCentimeter(double inch) {
        return inch * INCH_TO_CENTIMETER;
    }
}
