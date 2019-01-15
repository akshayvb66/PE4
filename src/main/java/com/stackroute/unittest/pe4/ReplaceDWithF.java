/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe4;

/**Write a program to replace all d with f and all l with t in the given String
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */

public class ReplaceDWithF {
    public static String replaceDandL(String string){
        String str1= string.replaceAll("d","f");
        String str2= str1.replaceAll("l","t");
        return str2; } }
