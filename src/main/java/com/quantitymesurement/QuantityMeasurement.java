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
    public boolean compareLengths(Double length1,Double length2) {
        return length1.equals(length2);
    }
    /*
     * Purpose : To check given feet null or not
     * @pram: length1, length2
     * return: boolean value
     */
    public boolean nullCheck(Double length1,Double length2) {
        boolean flag = length1 == null || length2 == null;
        return flag;
    }
}