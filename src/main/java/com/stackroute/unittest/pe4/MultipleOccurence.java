/**
 *Akshay Badiger
 *
 *Boeing India Pvt Ltd
 *
 * Stackroute
 */
package com.stackroute.unittest.pe4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**TWrite a program to find out the multiple occurrences of the given word in a string using Matcher methods.
 *
 * @version 1.0 11-1-2018
 *
 * @author Akshay Badiger
 */
public class MultipleOccurence {
    public static String countMultiple(String inputString, String word) {
        String string="";
        Pattern r = Pattern.compile(word);
        int count = 0;
        Matcher matcher = r.matcher(inputString);
        while (matcher.find()) {
          { count++;
          string =string+ "Found at " + matcher.start()+"-"+matcher.end()+"\n"; }
        } return string;
    }}

