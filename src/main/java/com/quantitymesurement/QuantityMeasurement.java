/*
 * @author: Kunal Suryawanshi
 */
package com.quantitymesurement;

public class QuantityMeasurement {
    /*
     * Purpose : To check given feet are equal or not
     * @pram: length1, length2
     * return: boolean value
     */
    public boolean compareLengths(Object length1,Object length2) {
        return length1.equals(length2);
    }
    public double compareLengths(Double length) {
        return length;
    }
    /*
     * Purpose : To check given feet null or not
     * @pram: length1, length2
     * return: boolean value
     */
    public boolean nullCheck(Double length1,Double length2) {
        return length1 == null || length2 == null;
    }
    /*
     * Purpose : To check given feet contains which data type
     * @pram: length1, length2
     * return: boolean type
     */
    public boolean compareDataType(Object length1,Object length2) {
        return length1.getClass() == length2.getClass();
    }

    /*
     * Purpose : To Convert Feet To Yard
     * @pram: feet
     * return: double
     */
    public double feetToYard(double feet) {
        return feet/3;
    }
    /*
     * Purpose : To Convert inch To Yard
     */
    public double inchToYard(double inch) {
        return inch/36;
    }
    /*
     * Purpose : To Convert yard To inch
     */
    public double yardToInch(double yard) {
        return yard*36;
    }
    /*
     * Purpose : To Convert yard To feet
     */
    public double yardToFeet(double yard) {
        return yard*3;
    }
}